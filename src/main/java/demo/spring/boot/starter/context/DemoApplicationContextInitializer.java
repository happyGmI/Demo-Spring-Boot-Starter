package demo.spring.boot.starter.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class DemoApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println(" DemoApplicationContextInitializer 初始化成功 ");
    }
}
