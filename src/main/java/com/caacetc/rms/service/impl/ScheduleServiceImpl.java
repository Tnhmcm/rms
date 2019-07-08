package com.caacetc.rms.service.impl;

import com.caacetc.rms.mapper.ScheduleMapper;
import com.caacetc.rms.model.Schedule;
import com.caacetc.rms.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: XYH
 * @date: 7/8/2019 2:30 PM
 * @description:
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleMapper scheduleMapper;

    @Override
    public Schedule findById(int id) {
        return scheduleMapper.findById(id);
    }
}
