package com.example.GS.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ScheduleContorller {

    @GetMapping("/helloworld")
    public ResponseEntity schedule() {
    return ResponseEntity.ok("Hello world");
    }
}
