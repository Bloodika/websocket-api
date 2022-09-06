package com.example.wsapi.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {

    @MessageMapping("/test")
    public String test(@Payload final String message){
        System.out.println(message);
        return "Helloka";
    }

    @SendTo("/topic/test")
    public String testSend(@Payload final String message){
        System.out.println(message);
        return "Helloka";
    }
}
