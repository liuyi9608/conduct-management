package com.liuym.common.dubbo.classes.dto;

import java.io.Serializable;

/**
 * 添加代理商-客户保护的 DTO 数据层
 *
 * @author LiuYiMing
 * @date 2018/8/7 11:23
 */
public class AddAgentProtectDTO implements Serializable {

    private static final long serialVersionUID = 2034836152021229590L;
    /**
     * 公司名称
     */
    private String corpname;
    /**
     * 公司简称
     */
    private String corpshotname;
    /**
     * 意向购买产品
     */
    private String intent;
    /**
     * 联系人姓名
     */
    private String txtname;
    /**
     * 联系人手机
     */
    private String txtphone;
    /**
     * 联系人职位
     */
    private String txttitle;
    /**
     * 公司所在省份
     */
    private Integer province;
    /**
     * 公司所在城市
     */
    private Integer city;
    /**
     * 业务员id
     */
    private Long sales_id;
    /**
     * 行业
     */
    private Integer industry;
    /**
     * 企业网站
     */
    private String website;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname;
    }

    public String getCorpshotname() {
        return corpshotname;
    }

    public void setCorpshotname(String corpshotname) {
        this.corpshotname = corpshotname;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getTxtname() {
        return txtname;
    }

    public void setTxtname(String txtname) {
        this.txtname = txtname;
    }

    public String getTxtphone() {
        return txtphone;
    }

    public void setTxtphone(String txtphone) {
        this.txtphone = txtphone;
    }

    public String getTxttitle() {
        return txttitle;
    }

    public void setTxttitle(String txttitle) {
        this.txttitle = txttitle;
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


    public Long getSales_id() {
        return sales_id;
    }

    public void setSales_id(Long sales_id) {
        this.sales_id = sales_id;
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }


    @Override
    public String toString() {
        return "AddAgentProtectDTO{" + "corpname='" + corpname + '\'' + ", corpshotname='" + corpshotname + '\''
                + ", intent='" + intent + '\'' + ", txtname='" + txtname + '\'' + ", txtphone='" + txtphone + '\''
                + ", txttitle='" + txttitle + '\'' + ", province=" + province + ", city=" + city + ", sales_id="
                + sales_id + ", industry=" + industry + '}';
    }
}
