package javaweb.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @ClassName testMain
 * @Description TODO
 * @Author liulianghao
 * @Date 2021-02-07 20:57
 * @Version 1.0
 **/
@SpringBootApplication
@ServletComponentScan//在SpringBoot启动时会扫描@WebServlet，并将该类实例化
public class FirstApp {
    public static void main(String[] args) {
        SpringApplication.run(FirstApp.class,args);
    }
}
