package com.indata.openapi.model;

import java.util.List;

/**
 *
 * 创建任务的参数
 * @author indata
 * @create 2018/2/5
 **/
public class CreateTaskParamVO {
    //公司id
    private Integer companyId;
    //任务名称
    private String taskName;
    //任务类型, 1-定时,2-手动
    private Integer taskType;
    //任务开始日期
    private String startDate;
    //可拨打开始时间
    private String workingStartTime;
    //可拨打结束时间
    private String workingEndTime;
    //主叫电话号码id列表，详见获取公司的主叫电话列表(getPhones)接口
    private List<Integer> userPhoneIds;
    //机器人话术id，详见获取公司的机器人话术列表(getRobots)接口
    private Integer robotDefId;
    //机器人话术场景id
    private Integer sceneDefId;
    //机器人话术录音id
    private Integer sceneRecordId;
    private String breakStartTime;
    private String breakEndTime;
    //注释
    Integer concurrencyQuota = 1;
    Integer callType ;
    String remark;
    Integer smsType;
    String smsCondition;
    Integer smsTemplateId;
    String userLevelPush;

    public String getBreakStartTime() {
        return breakStartTime;
    }

    public void setBreakStartTime(String breakStartTime) {
        this.breakStartTime = breakStartTime;
    }

    public String getBreakEndTime() {
        return breakEndTime;
    }

    public void setBreakEndTime(String breakEndTime) {
        this.breakEndTime = breakEndTime;
    }

    public Integer getConcurrencyQuota() {
        return concurrencyQuota;
    }

    public void setConcurrencyQuota(Integer concurrencyQuota) {
        this.concurrencyQuota = concurrencyQuota;
    }

    public Integer getCallType() {
        return callType;
    }

    public void setCallType(Integer callType) {
        this.callType = callType;
    }

    public String getUserLevelPush() {
        return userLevelPush;
    }

    public void setUserLevelPush(String userLevelPush) {
        this.userLevelPush = userLevelPush;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getWorkingStartTime() {
        return workingStartTime;
    }

    public void setWorkingStartTime(String workingStartTime) {
        this.workingStartTime = workingStartTime;
    }

    public String getWorkingEndTime() {
        return workingEndTime;
    }

    public void setWorkingEndTime(String workingEndTime) {
        this.workingEndTime = workingEndTime;
    }

    public List<Integer> getUserPhoneIds() {
        return userPhoneIds;
    }

    public void setUserPhoneIds(List<Integer> userPhoneIds) {
        this.userPhoneIds = userPhoneIds;
    }

    public Integer getRobotDefId() {
        return robotDefId;
    }

    public void setRobotDefId(Integer robotDefId) {
        this.robotDefId = robotDefId;
    }

    public Integer getSceneDefId() {
        return sceneDefId;
    }

    public void setSceneDefId(Integer sceneDefId) {
        this.sceneDefId = sceneDefId;
    }

    public Integer getSceneRecordId() {
        return sceneRecordId;
    }

    public void setSceneRecordId(Integer sceneRecordId) {
        this.sceneRecordId = sceneRecordId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSmsType() {
        return smsType;
    }

    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }

    public String getSmsCondition() {
        return smsCondition;
    }

    public void setSmsCondition(String smsCondition) {
        this.smsCondition = smsCondition;
    }

    public Integer getSmsTemplateId() {
        return smsTemplateId;
    }

    public void setSmsTemplateId(Integer smsTemplateId) {
        this.smsTemplateId = smsTemplateId;
    }

}
