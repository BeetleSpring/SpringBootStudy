package com.beetle.listener;

import com.beetle.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener3 {

    @EventListener
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.test("我是CustomListener3");
        System.out.println("CustomListener3监听到了");
    }
}
