package JavaWeb.MVC.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author liulianghao
 * @Date 2021-02-14 10:25
 * @Version 1.0
 **/
@Controller
@Slf4j
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        log.info("hello dispatcherServerlet!");

        return "index.jsp";
    }

}
