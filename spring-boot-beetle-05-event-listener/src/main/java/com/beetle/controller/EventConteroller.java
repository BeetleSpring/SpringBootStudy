package com.beetle.controller;

import com.beetle.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventConteroller {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @RequestMapping("/event")
    public String event(){
        eventPublisher.publishEvent(new CustomEvent(this));
        return "Success";
    }
}
