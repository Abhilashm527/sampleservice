package com.example.GS.Controller;

import org.apache.tomcat.jni.Sockaddr;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
public class ScheduleContorller {

    @GetMapping("/welcome")
    public ResponseEntity schedule() {
        System.out.println("The service has been invoked at this time , "+ LocalDateTime.now());
         return ResponseEntity.ok("welcome");
    }
}
