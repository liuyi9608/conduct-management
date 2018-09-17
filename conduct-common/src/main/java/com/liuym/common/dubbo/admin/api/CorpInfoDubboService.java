package com.liuym.common.dubbo.admin.api;


import com.alibaba.fastjson.JSONObject;
import com.liuym.common.dubbo.admin.dto.CorpInfoDTO;
import com.liuym.common.dubbo.admin.dto.CreateCorpDubboDTO;
import com.liuym.common.exception.CorpInfoException;

public interface CorpInfoDubboService {

    CorpInfoDTO getCorpInfoById(int corpId) throws CorpInfoException;

//    public int addMigrateLog(long agentId, CorpInfo corpInfo);
//
//    public int updateByPrimaryKeySelective(CorpInfo record);

    /**
     * 新建企业
     * @param createCorpDubboDTO
     * @return
     * @throws Exception
     */
    public JSONObject createCorp(CreateCorpDubboDTO createCorpDubboDTO) throws CorpInfoException;

    /**
     * 企业名是否存在
     *
     * @param corpName
     * @return
     */
    boolean isExsitCorpName(String corpName) throws CorpInfoException;

    /**
     * 企业联系方式是否存在
     *
     * @param mobile
     * @return
     */
    boolean isExsitContactMobile(String mobile) throws CorpInfoException;

    CorpInfoDTO getCorpInfoByMobile(String mobile) throws CorpInfoException;

    /**
     * 根据企业名字查询企业信息
     *
     * @param corpName
     * @return
     * @throws CorpInfoException
     */
    CorpInfoDTO getCorpInfoByCorpName(String corpName) throws CorpInfoException;

    int saveOrUpdateCorpExtra(CorpInfoDTO corpInfoDTO);

    int addMigrateLog(long agentId, CorpInfoDTO corpInfoDTO);

    int updateByPrimaryKeySelective(CorpInfoDTO corpInfoDTO);
}
