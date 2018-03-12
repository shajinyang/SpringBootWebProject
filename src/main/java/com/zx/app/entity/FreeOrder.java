package com.zx.app.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * 免单活动实体类
 */
public class FreeOrder {
    private BigInteger id;
    private String activityTitle;
    private String activityDescription;
    private String activityDetail;
    private Integer activityTag;
    private Integer activityMaxJoinners;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Timestamp activityBegainTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Timestamp activityEndTime;
    private BigInteger activityLuckyId;
    private String activityCover;
    private String activityUnitTip;
    private BigDecimal activityPrice;
    private Integer activityState;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public String getActivityDetail() {
        return activityDetail;
    }

    public void setActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail;
    }

    public Integer getActivityTag() {
        return activityTag;
    }

    public void setActivityTag(Integer activityTag) {
        this.activityTag = activityTag;
    }

    public Integer getActivityMaxJoinners() {
        return activityMaxJoinners;
    }

    public void setActivityMaxJoinners(Integer activityMaxJoinners) {
        this.activityMaxJoinners = activityMaxJoinners;
    }

    public Timestamp getActivityBegainTime() {
        return activityBegainTime;
    }

    public void setActivityBegainTime(Timestamp activityBegainTime) {
        this.activityBegainTime = activityBegainTime;
    }

    public Timestamp getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Timestamp activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public BigInteger getActivityLuckyId() {
        return activityLuckyId;
    }

    public void setActivityLuckyId(BigInteger activityLuckyId) {
        this.activityLuckyId = activityLuckyId;
    }

    public String getActivityCover() {
        return activityCover;
    }

    public void setActivityCover(String activityCover) {
        this.activityCover = activityCover;
    }

    public String getActivityUnitTip() {
        return activityUnitTip;
    }

    public void setActivityUnitTip(String activityUnitTip) {
        this.activityUnitTip = activityUnitTip;
    }

    public BigDecimal getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(BigDecimal activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Integer getActivityState() {
        return activityState;
    }

    public void setActivityState(Integer activityState) {
        this.activityState = activityState;
    }
}
