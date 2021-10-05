package com.beetle.listener;

import com.beetle.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


public class CustomListener1 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.test("我是CustomListener1");
        System.out.println("CustomListener1监听到了");
    }
}
