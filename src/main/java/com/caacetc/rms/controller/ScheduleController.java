package com.caacetc.rms.controller;

import com.caacetc.rms.model.Schedule;
import com.caacetc.rms.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: XYH
 * @date: 7/8/2019 2:33 PM
 * @description:
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @GetMapping("/{id}")
    public Schedule findById(@PathVariable int id) {
        return scheduleService.findById(id);
    }
}
