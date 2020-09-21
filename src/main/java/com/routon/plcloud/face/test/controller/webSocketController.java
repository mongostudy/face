package com.routon.plcloud.face.test.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.routon.plcloud.face.test.server.webSocketServer;

@RestController
public class webSocketController {
    @Autowired
    webSocketServer server;
    
    @PostMapping("/login")
    public String login(String username,String password) throws IOException {
        server.sendInfo(username + "进入了聊天室!");
        return username;
    }
    
    @PostMapping("/test")
    public String test(String photo) throws IOException {
//        server.sendInfo(photo);
        
        return test1(photo);
//        return photo;
    }
    
    @PostMapping("/test1")
    public String test1(String photo) throws IOException {
    	
    	System.err.println("test="+photo);
    	server.sendInfo(photo);
        return photo;
    }
}
