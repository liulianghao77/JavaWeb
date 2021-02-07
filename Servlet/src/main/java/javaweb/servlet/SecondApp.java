package javaweb.servlet;

import javaweb.servlet.service.InitSecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName SecondApp
 * @Description TODO
 * @Author liulianghao
 * @Date 2021-02-07 22:09
 * @Version 1.0
 **/
@SpringBootApplication
public class SecondApp {
    public static void main(String[] args) {
        SpringApplication.run(SecondApp.class,args);
    }
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new InitSecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }
}
