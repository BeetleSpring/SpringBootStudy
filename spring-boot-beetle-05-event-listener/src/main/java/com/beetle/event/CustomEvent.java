package com.beetle.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public void test(String mess){
        System.out.println("我是CustomEvent"+"--"+mess);
    }
}
