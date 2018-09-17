package com.liuym.common.dubbo.classes.api;

import com.alibaba.fastjson.JSONObject;
import com.liuym.common.dubbo.classes.dto.AddAgentProtectDTO;
import com.liuym.common.dubbo.classes.dto.AgentProtectDTO;
import com.liuym.common.exception.CorpProtectException;

/**
 * @author LiuYiMing
 * @date 2018/8/7 11:23
 * @describe：
 */
public interface AgentProtectDubboService {

    /**
     * 新建客户保护
     *
     * @param addAgentProtectDTO
     * @return
     * @throws Exception
     */
    public JSONObject addProtect(long corpId, long userId, AddAgentProtectDTO addAgentProtectDTO)
            throws CorpProtectException;

    /**
     * 校验是否存在有效的客户保护名称
     *
     * @param corpName
     * @return
     */
    boolean hasValidProtect(String corpName) throws CorpProtectException;

    /**
     * 根据企业名获取保护信息
     *
     * @param corpName
     * @return
     */
    AgentProtectDTO getCorpProtectInfoByCName(String corpName) throws CorpProtectException;

    /**
     * 添加恶意保护
     *
     * @param protectId
     * @param userName
     * @param mobile
     * @return
     */
    boolean addConflict(int protectId, String userName, String mobile, long corpId,
            long userId) throws CorpProtectException;

    /**
     * 根据企业名获取有效的保护信息
     *
     * @param corpName
     * @return
     */
    AgentProtectDTO getValidCorpProtectInfoByCName(String corpName) throws CorpProtectException;
}
