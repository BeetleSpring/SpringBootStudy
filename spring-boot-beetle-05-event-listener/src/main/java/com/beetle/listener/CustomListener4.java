package com.beetle.listener;

import com.beetle.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener4 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.test("我是CustomListener4");
        System.out.println("CustomListener4监听到了");
    }
}
