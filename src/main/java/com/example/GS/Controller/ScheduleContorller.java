package com.example.GS.Controller;

import org.Ivoyant.model.Schedule;
import org.Ivoyant.service.ScheduleImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;

@RestController
public class ScheduleContorller {

    @GetMapping("/helloworld")
    public ResponseEntity schedule() {
    return ResponseEntity.ok("Hello world");
    }
}
