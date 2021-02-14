package javaweb.servlet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.webservices.WebServicesProperties;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
//web.xml配置servlet
/*
 * <servlet>
 * 		<servlet-name>FirstServlet</servlet-name>
 * 		<servlet-class>per.czt.servlet.FirstServlet</servlet-class>
 *
 * </servlet>
 * <servlet-mapping>
 * 	  <servlet-name>FirstServlet</servlet-name>
 * 	  <url-patten>/first</url-patten>
 *
 * </servlet-mapping>
 */
//SpringBoot整合servlet
//通过注解扫描完成servlet组件的注册
/**
 * @ClassName InitServlet
 * @Description TODO 继承 Servlet
 * @Author liulianghao
 * @Date 2021-02-07 21:04
 * @Version 1.0
 **/
@Slf4j
@WebServlet(urlPatterns = "/first", name = "InitFirstServlet")
public class InitFirstServlet implements Servlet {
    private ServletContext servletContext;

    public InitFirstServlet() {
        log.info("InitFirstServlet 11111111111");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        servletContext = config.getServletContext();
        servletContext.setAttribute("first", "first servlet set!");
        //servletContext.setInitParameter("first", "first servlet set!");
        log.info("servlet init；11111111111");

    }

    @Override
    public ServletConfig getServletConfig() {
        log.info("getServletConfig:11111111111");
        return  null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out =  res.getWriter();
        out.println("service:11111");
        log.debug("debug:11111111111 ");
        log.info("service:11111");
        out.println(servletContext.getRealPath("application.yml"));
        out.println(servletContext.getInitParameter("user"));
    }

    @Override
    public String getServletInfo() {
        log.info("getServletInfo:11111111111");
        return null;
    }

    @Override
    public void destroy() {
        log.info("destroy:11111111111");

    }
}
/*
    springMVC
<servlet>
        <servlet-name>SpringDispatcherServlet</servlet-name>
         <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
</servlet>
<servlet-mapping>
  <servlet-name> SpringDispatcherServlet </servlet-name>
  <url-pattern>*.do</url-pattern>
</servlet-mapping>
 */
