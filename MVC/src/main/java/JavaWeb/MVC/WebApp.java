package JavaWeb.MVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @ClassName SecondApp
 * @Description TODO
 * @Author liulianghao
 * @Date 2021-02-07 22:09
 * @Version 1.0
 **/
@SpringBootApplication
@ServletComponentScan
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class,args);
    }

    /*
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new InitSecondServlet());
        bean.addUrlMappings("/second");

        return bean;
    }*/
}
