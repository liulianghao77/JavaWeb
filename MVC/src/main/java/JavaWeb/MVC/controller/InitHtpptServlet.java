package JavaWeb.MVC.controller;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName InitSecondServlet
 * @Description TODO 继承 HttpServlet GenericServlet Servlet
 * @Author liulianghao
 * @Date 2021-02-07 22:04
 * @Version 1.0
 **/
@Slf4j
@WebServlet(urlPatterns = "/webapp")
public class InitHtpptServlet extends HttpServlet {
    private ServletContext servletContext;   //Servlet 共享的 上下文参数
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        servletContext = servletConfig.getServletContext();
        log.info("InitSecondServlet 2222222");
    }

    @Override
    public ServletConfig getServletConfig() {
        log.info("getServletConfig 2222222");
        return null;
    }

    /*
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        log.info("second hello servlet  2222222");
        PrintWriter out = servletResponse.getWriter();
        out.println("second hello servlet------ on Service");
        out.println(servletContext.getAttribute("first"));  //Coo
        out.println(servletContext.getInitParameter("passwd"));
    }*/

    @Override
    public String getServletInfo() {
        log.info("getServletInfo 2222222");
        return null;
    }

    @Override
    public void destroy() {
        log.info("destroy 2222222");

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        log.info("doPost 2222222");
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        log.debug("hello doGet! 2222222");
        log.info("hello doGet!  222222");
        PrintWriter pw = resp.getWriter();
        pw.println("hello servlet2-- on doGet!");
    }
}
