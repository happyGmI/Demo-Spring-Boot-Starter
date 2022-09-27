package demo.spring.boot.starter.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationListener;

public class DemoApplicationListener implements ApplicationListener<SpringApplicationEvent> {
    @Override
    public void onApplicationEvent(SpringApplicationEvent springApplicationEvent) {
        if (springApplicationEvent instanceof ApplicationStartingEvent) {
            System.out.println(" DemoApplicationListener 监听 ApplicationStartingEvent 事件");
        }
    }
}