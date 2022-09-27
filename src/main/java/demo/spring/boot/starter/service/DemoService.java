package demo.spring.boot.starter.service;

import demo.spring.boot.starter.properties.DemoProperties;

public class DemoService {

    private DemoProperties demoProperties;

    public DemoService(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    public String getName() {
        return demoProperties.getName();
    }

    public String getDate() {
        return demoProperties.getDate();
    }
}
