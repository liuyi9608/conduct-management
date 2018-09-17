package com.liuym.common.dubbo.admin.dto;

import java.io.Serializable;
import java.util.Date;

public class CreateCorpDubboDTO implements Serializable {

    //注册类型：1:PC官网;2:PV注册;3:m.workec.com;4:EC APP;10:代理商添加
    private Integer registerType;//对应NewCorpRegisterSourceEnum
    private Integer pwdType;//1：用户自己输入的密码 ;2：随机密码

    //代理商添加时需要
    private Integer agentType; //对应AgentTypeEnum
    private String operatorUserName;
    private String operatorAccount;

    //d_ec_corp.t_corp_info
    private Long corpId;
    private String corpName;//f_name
    private String shortname;
    private String addr;
    private String postcode;
    private String netaddr;
    private Integer countryId;
    private Integer provinceId;
    private Integer cityId;
    private Integer discardCorpInfo;
    private Date createTimeCorpInfo;
    private Date expireTime;
    private Date moveTime;
    private Integer status;
    private String contactName;
    private String contactTitle;
    private String contactMobile;
    private String contactPhone;
    private String contactEmail;
    private Long agentId;//代理商id，即操作人的corpId
    private Long agentCsid;//客服id，即操作人的userId
    private Long agentGjid;//业务员id
//    private Integer agentType;//上面已有
    private Integer contactId;
    private Integer vocation;
    private String logo;
    private String memo;
    private Integer typeCorpInfo;
    private Integer sznews;
    private Integer sznewsCs;
    private Integer sznewsClass;
    private Integer csScheme;
    private Integer isallywll;
    private Long firstAgent;
    private Integer revistClass;
    private Integer activeStatus;
    private Integer unite;
    private Integer totalUser;
    private Date loseTime;
    private Date freezeTime;
    //当registerType=4时，createBy为3；当registerType=10时，createBy为1；其他全为0
    private Integer createBy;
    private Date lastLogIntegerime;
    private Integer externalPriv;
    private Integer qixIntegerype;
    private Integer beLongType;
    private Integer issecAgent;

    //d_ec_user.t_user_account
    private Long userId;//id重命名为userId
    private Integer type;
    private String account;
    private Integer regType;
    private Integer authLevel;
    private Date createTime;
    private Date userAccountModifyTime;
    private Integer discard;
    private Integer logIntegerime;
    private Integer regFrom;
    private String regWebsite;
    private String pwd;

    //d_ec_user.t_user_detail
//    private Long id;//上面已有
    private String mobile;
    private String phone;
    private String email;
    private String nick;
    private String name;
    private Integer gender;
    private String title;
    private String desc;
    private Integer homeCountry;
    private Integer homeProvince;
    private Integer homeCity;
    private String homeAddr;
    private String homePostalcode;
    private String homePhone;
    private String homeEmail;
    private String homePhone2;
    private String homeEmail2;
    private String homeUrl;
    private Date birthday;
    private String mate;
    private Date rememberYear;
    private String company;
    private Integer companyCountry;
    private Integer companyProvince;
    private Integer companyCity;
    private String companyAddr;
    private String companyPostalcode;
    private Integer workTime;
    private String specialty;
    private String experience;
    private Integer workVocation;
    private String workMobile;
    private String workPhone;
    private String workEmail;
    private String workFax;
    private String companyUrl;
    private String other;
    private String remark;
    private Date userDetailModifyTime;
    private Integer smsnum;
    private String onlineMsg;
    private String offlineMsg;
    private Integer showMobile;
    private Integer remainInvitecount;
    private String face;
    private Integer mobileFlag;
    private Integer clickTotal;
    private String csName;
    private String csTitle;
    private String csTel;
    private String csMobile;
    private String csEmail;
    private Integer userType;
    private Integer noshow;
    private Integer qqSync;

    public Integer getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Integer registerType) {
        this.registerType = registerType;
    }

    public Integer getPwdType() {
        return pwdType;
    }

    public void setPwdType(Integer pwdType) {
        this.pwdType = pwdType;
    }

    public Integer getAgentType() {
        return agentType;
    }

    public void setAgentType(Integer agentType) {
        this.agentType = agentType;
    }

    public String getOperatorUserName() {
        return operatorUserName;
    }

    public void setOperatorUserName(String operatorUserName) {
        this.operatorUserName = operatorUserName;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getNetaddr() {
        return netaddr;
    }

    public void setNetaddr(String netaddr) {
        this.netaddr = netaddr;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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

    public Integer getDiscardCorpInfo() {
        return discardCorpInfo;
    }

    public void setDiscardCorpInfo(Integer discardCorpInfo) {
        this.discardCorpInfo = discardCorpInfo;
    }

    public Date getCreateTimeCorpInfo() {
        return createTimeCorpInfo;
    }

    public void setCreateTimeCorpInfo(Date createTimeCorpInfo) {
        this.createTimeCorpInfo = createTimeCorpInfo;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getMoveTime() {
        return moveTime;
    }

    public void setMoveTime(Date moveTime) {
        this.moveTime = moveTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Long getAgentCsid() {
        return agentCsid;
    }

    public void setAgentCsid(Long agentCsid) {
        this.agentCsid = agentCsid;
    }

    public Long getAgentGjid() {
        return agentGjid;
    }

    public void setAgentGjid(Long agentGjid) {
        this.agentGjid = agentGjid;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getVocation() {
        return vocation;
    }

    public void setVocation(Integer vocation) {
        this.vocation = vocation;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getTypeCorpInfo() {
        return typeCorpInfo;
    }

    public void setTypeCorpInfo(Integer typeCorpInfo) {
        this.typeCorpInfo = typeCorpInfo;
    }

    public Integer getSznews() {
        return sznews;
    }

    public void setSznews(Integer sznews) {
        this.sznews = sznews;
    }

    public Integer getSznewsCs() {
        return sznewsCs;
    }

    public void setSznewsCs(Integer sznewsCs) {
        this.sznewsCs = sznewsCs;
    }

    public Integer getSznewsClass() {
        return sznewsClass;
    }

    public void setSznewsClass(Integer sznewsClass) {
        this.sznewsClass = sznewsClass;
    }

    public Integer getCsScheme() {
        return csScheme;
    }

    public void setCsScheme(Integer csScheme) {
        this.csScheme = csScheme;
    }

    public Integer getIsallywll() {
        return isallywll;
    }

    public void setIsallywll(Integer isallywll) {
        this.isallywll = isallywll;
    }

    public Long getFirstAgent() {
        return firstAgent;
    }

    public void setFirstAgent(Long firstAgent) {
        this.firstAgent = firstAgent;
    }

    public Integer getRevistClass() {
        return revistClass;
    }

    public void setRevistClass(Integer revistClass) {
        this.revistClass = revistClass;
    }

    public Integer getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Integer getUnite() {
        return unite;
    }

    public void setUnite(Integer unite) {
        this.unite = unite;
    }

    public Integer getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(Integer totalUser) {
        this.totalUser = totalUser;
    }

    public Date getLoseTime() {
        return loseTime;
    }

    public void setLoseTime(Date loseTime) {
        this.loseTime = loseTime;
    }

    public Date getFreezeTime() {
        return freezeTime;
    }

    public void setFreezeTime(Date freezeTime) {
        this.freezeTime = freezeTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getLastLogIntegerime() {
        return lastLogIntegerime;
    }

    public void setLastLogIntegerime(Date lastLogIntegerime) {
        this.lastLogIntegerime = lastLogIntegerime;
    }

    public Integer getExternalPriv() {
        return externalPriv;
    }

    public void setExternalPriv(Integer externalPriv) {
        this.externalPriv = externalPriv;
    }

    public Integer getQixIntegerype() {
        return qixIntegerype;
    }

    public void setQixIntegerype(Integer qixIntegerype) {
        this.qixIntegerype = qixIntegerype;
    }

    public Integer getBeLongType() {
        return beLongType;
    }

    public void setBeLongType(Integer beLongType) {
        this.beLongType = beLongType;
    }

    public Integer getIssecAgent() {
        return issecAgent;
    }

    public void setIssecAgent(Integer issecAgent) {
        this.issecAgent = issecAgent;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getRegType() {
        return regType;
    }

    public void setRegType(Integer regType) {
        this.regType = regType;
    }

    public Integer getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(Integer authLevel) {
        this.authLevel = authLevel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUserAccountModifyTime() {
        return userAccountModifyTime;
    }

    public void setUserAccountModifyTime(Date userAccountModifyTime) {
        this.userAccountModifyTime = userAccountModifyTime;
    }

    public Integer getDiscard() {
        return discard;
    }

    public void setDiscard(Integer discard) {
        this.discard = discard;
    }

    public Integer getLogIntegerime() {
        return logIntegerime;
    }

    public void setLogIntegerime(Integer logIntegerime) {
        this.logIntegerime = logIntegerime;
    }

    public Integer getRegFrom() {
        return regFrom;
    }

    public void setRegFrom(Integer regFrom) {
        this.regFrom = regFrom;
    }

    public String getRegWebsite() {
        return regWebsite;
    }

    public void setRegWebsite(String regWebsite) {
        this.regWebsite = regWebsite;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(Integer homeCountry) {
        this.homeCountry = homeCountry;
    }

    public Integer getHomeProvince() {
        return homeProvince;
    }

    public void setHomeProvince(Integer homeProvince) {
        this.homeProvince = homeProvince;
    }

    public Integer getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(Integer homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getHomePostalcode() {
        return homePostalcode;
    }

    public void setHomePostalcode(String homePostalcode) {
        this.homePostalcode = homePostalcode;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getHomeEmail() {
        return homeEmail;
    }

    public void setHomeEmail(String homeEmail) {
        this.homeEmail = homeEmail;
    }

    public String getHomePhone2() {
        return homePhone2;
    }

    public void setHomePhone2(String homePhone2) {
        this.homePhone2 = homePhone2;
    }

    public String getHomeEmail2() {
        return homeEmail2;
    }

    public void setHomeEmail2(String homeEmail2) {
        this.homeEmail2 = homeEmail2;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMate() {
        return mate;
    }

    public void setMate(String mate) {
        this.mate = mate;
    }

    public Date getRememberYear() {
        return rememberYear;
    }

    public void setRememberYear(Date rememberYear) {
        this.rememberYear = rememberYear;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getCompanyCountry() {
        return companyCountry;
    }

    public void setCompanyCountry(Integer companyCountry) {
        this.companyCountry = companyCountry;
    }

    public Integer getCompanyProvince() {
        return companyProvince;
    }

    public void setCompanyProvince(Integer companyProvince) {
        this.companyProvince = companyProvince;
    }

    public Integer getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(Integer companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    public String getCompanyPostalcode() {
        return companyPostalcode;
    }

    public void setCompanyPostalcode(String companyPostalcode) {
        this.companyPostalcode = companyPostalcode;
    }

    public Integer getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Integer getWorkVocation() {
        return workVocation;
    }

    public void setWorkVocation(Integer workVocation) {
        this.workVocation = workVocation;
    }

    public String getWorkMobile() {
        return workMobile;
    }

    public void setWorkMobile(String workMobile) {
        this.workMobile = workMobile;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getWorkFax() {
        return workFax;
    }

    public void setWorkFax(String workFax) {
        this.workFax = workFax;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUserDetailModifyTime() {
        return userDetailModifyTime;
    }

    public void setUserDetailModifyTime(Date userDetailModifyTime) {
        this.userDetailModifyTime = userDetailModifyTime;
    }

    public Integer getSmsnum() {
        return smsnum;
    }

    public void setSmsnum(Integer smsnum) {
        this.smsnum = smsnum;
    }

    public String getOnlineMsg() {
        return onlineMsg;
    }

    public void setOnlineMsg(String onlineMsg) {
        this.onlineMsg = onlineMsg;
    }

    public String getOfflineMsg() {
        return offlineMsg;
    }

    public void setOfflineMsg(String offlineMsg) {
        this.offlineMsg = offlineMsg;
    }

    public Integer getShowMobile() {
        return showMobile;
    }

    public void setShowMobile(Integer showMobile) {
        this.showMobile = showMobile;
    }

    public Integer getRemainInvitecount() {
        return remainInvitecount;
    }

    public void setRemainInvitecount(Integer remainInvitecount) {
        this.remainInvitecount = remainInvitecount;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Integer getMobileFlag() {
        return mobileFlag;
    }

    public void setMobileFlag(Integer mobileFlag) {
        this.mobileFlag = mobileFlag;
    }

    public Integer getClickTotal() {
        return clickTotal;
    }

    public void setClickTotal(Integer clickTotal) {
        this.clickTotal = clickTotal;
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    public String getCsTitle() {
        return csTitle;
    }

    public void setCsTitle(String csTitle) {
        this.csTitle = csTitle;
    }

    public String getCsTel() {
        return csTel;
    }

    public void setCsTel(String csTel) {
        this.csTel = csTel;
    }

    public String getCsMobile() {
        return csMobile;
    }

    public void setCsMobile(String csMobile) {
        this.csMobile = csMobile;
    }

    public String getCsEmail() {
        return csEmail;
    }

    public void setCsEmail(String csEmail) {
        this.csEmail = csEmail;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getNoshow() {
        return noshow;
    }

    public void setNoshow(Integer noshow) {
        this.noshow = noshow;
    }

    public Integer getQqSync() {
        return qqSync;
    }

    public void setQqSync(Integer qqSync) {
        this.qqSync = qqSync;
    }
}
