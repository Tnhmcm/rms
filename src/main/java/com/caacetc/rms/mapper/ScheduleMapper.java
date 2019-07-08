package com.caacetc.rms.mapper;

import com.caacetc.rms.model.Schedule;
import org.springframework.stereotype.Repository;

/**
 * @author: XYH
 * @date: 7/8/2019 2:21 PM
 * @description:
 */
@Repository
public interface ScheduleMapper {

    Schedule findById(int id);
}
