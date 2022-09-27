package demo.spring.boot.starter.configuration;

import demo.spring.boot.starter.properties.DemoProperties;
import demo.spring.boot.starter.service.DemoService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = DemoProperties.class)
public class DemoAutoConfiguration {

    private final DemoProperties demoProperties;

    public DemoAutoConfiguration(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    @Bean
    // 当前项目是否包含 DemoService Class
    @ConditionalOnMissingBean(DemoService.class)
    public DemoService demoService() {
        return new DemoService(demoProperties);
    }
}