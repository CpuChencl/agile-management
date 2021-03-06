package com.deppon.mbi.agile.core.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sunyamorn on 1/27/16.
 *
 * The base class of DAO which provided some convenient utilities.
 */
public abstract class BaseDao extends SqlSessionDaoSupport {
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    /**
     * Concatenate mybatis mapper namespace and execute sql id.
     * This is a convenient method.
     */
    protected String buildStatement(String namespace, String id) {
        return namespace + "." + id;
    }

    /**
     * Convenient method for mybatis used with map params
     */
    protected ParamsBuilder getParamsBuilder() {
        return new ParamsBuilder();
    }


    protected class ParamsBuilder {
        Map<String, Object> map = new ConcurrentHashMap<>();

        private ParamsBuilder() {
        }

        public ParamsBuilder put(String key, Object value) {
            this.map.put(key, value);
            return this;
        }

        public Map<String, Object> build() {
            return this.map;
        }

    }

}
