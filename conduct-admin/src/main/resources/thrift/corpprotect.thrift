namespace java com.ec.corpprotect.api
namespace cpp corpprotect
namespace php corpprotect



service CorpProtectApi {
    /**
     * 企业查询
     */
    string queryCorpProtect(1:i32 corpId)
    /**
    *心跳
    */
    string heart()

}