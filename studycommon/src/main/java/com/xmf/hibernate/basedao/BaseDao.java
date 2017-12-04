package com.xmf.hibernate.basedao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {

    /**
     * 单表单条记录查询
     * @param clazz
     * @param varables
     * @return
     */
    public <T> T querySingleResult(Class<T> clazz, Map<String, Object> varables);

    /**
     * 单表多条记录查询
     * @param className 要查询的对象
     * @param varables 封装查询条件的map
     * @return 返回查询结果的List集合
     */
    public <T> List<T> queryResultList(Class<T> className, Map<String,Object> varables);

}
