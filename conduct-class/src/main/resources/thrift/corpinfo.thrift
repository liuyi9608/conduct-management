namespace java com.ec.corpinfo.api
namespace cpp corpprotect
namespace php corpprotect

service CorpInfoApi {

    /**
    *心跳
    */
    string heart()

    /**
     * 企业查询
     */
    string queryCorpInfo(1:i32 corpId)

    /**
     * 新建企业
     */
    string createCorp(1:string content)

}