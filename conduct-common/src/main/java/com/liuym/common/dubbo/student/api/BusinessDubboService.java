package com.liuym.common.dubbo.student.api;

import com.liuym.common.dubbo.student.dto.BusinessDubboDTO;
import com.liuym.common.exception.CorpBizException;

public interface BusinessDubboService {

    /**
     * 新增企业商机
     *
     * @param businessDubboDTO 商机需要的参数dto
     * @return
     */
    Boolean addCorpInBusiness(BusinessDubboDTO businessDubboDTO) throws CorpBizException;

    /**
     * 创建企业时候的同名迁移
     *
     * @param corpName 企业名称
     * @param agentId  待迁移的代理商
     * @return 结果
     */
    boolean addSameNameMove(String corpName, int agentId) throws CorpBizException;


}
