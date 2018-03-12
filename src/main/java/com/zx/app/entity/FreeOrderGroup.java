package com.zx.app.entity;

import java.math.BigInteger;

/**
 * 参与免单活动
 */
public class FreeOrderGroup {
    private Integer id;
    private Integer joinnerId;
    private Integer activityId;
    private Integer payOrderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJoinnerId() {
        return joinnerId;
    }

    public void setJoinnerId(Integer joinnerId) {
        this.joinnerId = joinnerId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(Integer payOrderId) {
        this.payOrderId = payOrderId;
    }
}
