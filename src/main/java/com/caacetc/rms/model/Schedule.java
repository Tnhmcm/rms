package com.caacetc.rms.model;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author: XYH
 * @date: 7/8/2019 11:56 AM
 */
public class Schedule {

    private Integer id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String memo;
    private Integer staffId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof Schedule)) {
            return false;
        }
        Schedule that = (Schedule)o;
        return this.id.equals(that.id) &&
                this.startTime.isEqual(that.startTime) &&
                this.endTime.isEqual(that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, endTime);
    }

}
