package com.liuym.common.dubbo.admin.dto;

import java.io.Serializable;

public class CorpInfoDTO implements Serializable {
    private static final long serialVersionUID = -8828953364309919465L;
    private int corpId;
    private String name;
    private String shortname;
    private Byte agentType;
    private Byte belongType;
    private Integer agentId;
    private Long agentCsid;
    private Long agentGjid;

    public Byte getBelongType() {
        return belongType;
    }

    public void setBelongType(Byte belongType) {
        this.belongType = belongType;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
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

    public Byte getAgentType() {
        return agentType;
    }

    public void setAgentType(Byte agentType) {
        this.agentType = agentType;
    }

    private int discard;

    public int getCorpId() {
        return corpId;
    }

    public void setCorpId(int corpId) {
        this.corpId = corpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public int getDiscard() {
        return discard;
    }

    public void setDiscard(int discard) {
        this.discard = discard;
    }
}
