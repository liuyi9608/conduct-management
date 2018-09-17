package com.liuym.common.dubbo.student.dto;

import java.io.Serializable;
import org.springframework.stereotype.Component;

@Component
public class BusinessDubboDTO implements Serializable {

    private static final long serialVersionUID = 2338174909590514749L;

    // 企业id
    private Integer corpId;

    // 企业名称
    private String corpName;

    // 联系人手机号
    private String contactMobile;

    // 联系人名称
    private String contactName;

    // 联系人职业
    private String contactPosition;

    // 企业所在省份id
    private Integer provinceId;

    // 企业所在城市id
    private Integer cityId;

    // 行业id
    private Integer vocation;

    // 操作人id
    private Integer userId;

    // 迁移代理商id(成功进行客户保护)
    private Integer agentId;

    // 商机入库类型
    private Integer type;

    // 商机入库来源
    private Integer sourceId;

    @Override
    public String toString() {
        return "BusinessDubboDTO{" +
                "corpId=" + corpId +
                ", corpName='" + corpName + '\'' +
                ", contactMobile='" + contactMobile + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactPosition='" + contactPosition + '\'' +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", vocation=" + vocation +
                ", userId=" + userId +
                ", agentId=" + agentId +
                ", type=" + type +
                ", sourceId=" + sourceId +
                '}';
    }

    public Integer getCorpId() {
        return corpId;
    }

    public void setCorpId(Integer corpId) {
        this.corpId = corpId;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPosition() {
        return contactPosition;
    }

    public void setContactPosition(String contactPosition) {
        this.contactPosition = contactPosition;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getVocation() {
        return vocation;
    }

    public void setVocation(Integer vocation) {
        this.vocation = vocation;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }
}
