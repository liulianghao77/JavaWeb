package javaweb.servlet.service;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
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
public class InitSecondServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        log.debug("hello servlet2!");
        PrintWriter pw = resp.getWriter();
        pw.println("hello servlet2!");
    }
}
