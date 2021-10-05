package com.beetle.listener;

import com.beetle.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {


    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.test("我是CustomListener2");
        System.out.println("CustomListener2监听到了");
    }
}
