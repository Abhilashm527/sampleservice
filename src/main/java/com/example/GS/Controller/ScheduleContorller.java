package com.example.GS.Controller;

import org.Ivoyant.model.Schedule;
import org.Ivoyant.service.ScheduleImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;

@RestController
public class ScheduleContorller {
    ScheduleImpl schedule = new ScheduleImpl("jdbc:postgresql://localhost:5432/testingdb","nkharvi","123");

    @GetMapping("/getScheduleById/{id}")
    public ResponseEntity schedule(@PathVariable int id) throws SQLException {
        Schedule schedule1 = schedule.getSchedule(id);
        if(schedule1 == null)
            return ResponseEntity.status(404).body("Not found");
        return ResponseEntity.ok(schedule1);
    }
    @PostMapping("/createSchedule")
    public  ResponseEntity create(@RequestBody Schedule cschedule) throws SQLException {
        Schedule schedule1 = schedule.create(cschedule);
        return ResponseEntity.status(201).body("created");
    }
}
