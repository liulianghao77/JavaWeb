package javaweb.servlet.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.webservices.WebServicesProperties;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
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
    public void init(ServletConfig config) throws ServletException {
        log.debug("servlet init；");

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

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
