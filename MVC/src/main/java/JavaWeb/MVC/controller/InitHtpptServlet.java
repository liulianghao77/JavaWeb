package JavaWeb.MVC.controller;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @ClassName InitSecondServlet
 * @Description TODO 继承 HttpServlet， 通过反射 调用 对应的 处理方法
 * @Author liulianghao
 * @Date 2021-02-07 22:04
 * @Version 1.0
 **/
@Slf4j
@WebServlet(urlPatterns = {"/webapp","*.udo"}, loadOnStartup = -1)
public class InitHtpptServlet extends HttpServlet {

   /**
    * @Description: //TODO  get 对应方法
    * @Date: 16:50 2021-02-14
    * @Author: liulianghao
   **/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("hello doGet!pathInfo:{};pathTranslated:{}", req.getPathInfo(),req.getPathTranslated());
        log.info("222 hello servlet2-- contextPath:{};"+req.getContextPath());
        log.info("222 ServletPath:{}",req.getServletPath());
        log.info("2222 RealPath:{}",req.getRealPath("index1.jsp"));
        doPost(req,resp);
        //super.doGet(req, resp);
    }

    /**
     * @Description: //TODO  POST对应方法
     * @Date: 16:51 2021-02-14
     * @Author: liulianghao
    **/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cpStr = req.getServletPath();
        if ("".equals(cpStr)) return;
        if(true) {
            String strMethod = cpStr.substring(1, cpStr.length() - 4); //获取 url 对应的方法名
            try {
                //反射 通过方法名获取对应的方法
                log.info("22222:" + strMethod);
                Method method = this.getClass().getDeclaredMethod(strMethod, HttpServletRequest.class, HttpServletResponse.class);
                method.invoke(this, req, resp);//调用方法
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private void add() throws ServletException, IOException {

    }
    private void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
            log.info("query 222222222");
        resp.sendRedirect("/webindex.jsp");
     }
    private void delete() throws ServletException, IOException{

    }

    private void update() throws ServletException,IOException{

    }

}
