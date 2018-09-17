package com.liuym.common.dubbo.classes.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 代理商-客户保护的 DTO 数据层
 *
 * @author LiuYiMing
 * @date 2018/09/05 10:53
 */
public class AgentProtectDTO implements Serializable {
    private static final long serialVersionUID = -2440183676786327160L;
    /**
     * 客户保护 id
     */
    private Integer protectId;
    /**
     * 代理商id
     */
    private Integer agentCorpId;
    /**
     * 代理商对应的操作员
     */
    private Long agentUserId;
    /**
     * 本来保护的状态值
     */
    private Integer status;
    /**
     * 保护生效的开始时间
     */
    private Date startTime;
    /**
     * 保护生效的截止时间
     */
    private Date endTime;
    /**
     * 省份 id
     */
    private Integer province;
    /**
     * 城市 id
     */
    private Integer city;
    /**
     * 业务员id
     */
    private Long salesId;

    private String companyName;

    private String companyAlias;

    private String website;

    private Integer industry;
    /**
     * 意向产品
     */
    private String intent;
    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人手机
     */
    private String contactPhone;
    /**
     * 联系人其他信息
     */
    private String contactMore;
    /**
     * 联系人职位
     */
    private String title;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 是否续签
     */
    private Integer isRenew;
    /**
     * 取消操作-对应的取消时间
     */
    private Date cancelTime;
    /**
     * 取消的操作人id
     */
    private Long cancelUserId;

    private Integer cancelCorpId;
    /**
     * 是否标记为恶意
     */
    private Byte markAnimus;

    public Integer getProtectId() {
        return protectId;
    }

    public void setProtectId(Integer protectId) {
        this.protectId = protectId;
    }


    public Long getAgentUserId() {
        return agentUserId;
    }

    public void setAgentUserId(Long agentUserId) {
        this.agentUserId = agentUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyAlias() {
        return companyAlias;
    }

    public void setCompanyAlias(String companyAlias) {
        this.companyAlias = companyAlias == null ? null : companyAlias.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent == null ? null : intent.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactMore() {
        return contactMore;
    }

    public void setContactMore(String contactMore) {
        this.contactMore = contactMore == null ? null : contactMore.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsRenew() {
        return isRenew;
    }

    public void setIsRenew(Integer isRenew) {
        this.isRenew = isRenew;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getAgentCorpId() {
        return agentCorpId;
    }

    public void setAgentCorpId(Integer agentCorpId) {
        this.agentCorpId = agentCorpId;
    }

    public Long getCancelUserId() {
        return cancelUserId;
    }

    public void setCancelUserId(Long cancelUserId) {
        this.cancelUserId = cancelUserId;
    }

    public Integer getCancelCorpId() {
        return cancelCorpId;
    }

    public void setCancelCorpId(Integer cancelCorpId) {
        this.cancelCorpId = cancelCorpId;
    }

    public Byte getMarkAnimus() {
        return markAnimus;
    }

    public void setMarkAnimus(Byte markAnimus) {
        this.markAnimus = markAnimus;
    }

    @Override
    public String toString() {
        return "AgentProtectDTO{" + "protectId=" + protectId + ", agentCorpId=" + agentCorpId + ", agentUserId="
                + agentUserId + ", status=" + status + ", startTime=" + startTime + ", endTime=" + endTime
                + ", province=" + province + ", city=" + city + ", salesId=" + salesId + ", companyName='" + companyName
                + '\'' + ", companyAlias='" + companyAlias + '\'' + ", website='" + website + '\'' + ", industry="
                + industry + ", intent='" + intent + '\'' + ", contactName='" + contactName + '\'' + ", contactPhone='"
                + contactPhone + '\'' + ", contactMore='" + contactMore + '\'' + ", title='" + title + '\''
                + ", createTime=" + createTime + ", isRenew=" + isRenew + ", cancelTime=" + cancelTime
                + ", cancelUserId=" + cancelUserId + ", cancelCorpId=" + cancelCorpId + ", markAnimus=" + markAnimus
                + '}';
    }
}