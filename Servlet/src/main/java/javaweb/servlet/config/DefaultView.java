package javaweb.servlet.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName DefaultView
 * @Description TODO spring mvc中首页的配置是通过在web.xml中增加 <welcome-file-list> 实现的，
 *                   其中 welcome-file 指向的是controller中的路径
 * @Author liulianghao
 * @Date 2021-02-10 10:07
 * @Version 1.0
 **/
//@Configuration
public class DefaultView extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/api/user/loginPage");
        registry.setOrder(1);
        super.addViewControllers(registry);
    }
}
