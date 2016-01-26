package com.deppon.mbi.agile.core.dao.impl;

import com.deppon.mbi.agile.core.dao.BaseDao;
import com.deppon.mbi.agile.core.dao.UserDao;
import com.deppon.mbi.agile.core.domain.auth.User;
import org.springframework.stereotype.Repository;

/**
 * Created by sunyamorn on 1/27/16.
 */
@Repository
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User query(String id) {
        return getSqlSession().selectOne(buildStatement(NAMESPACE, "query"),
                getParamsBuilder()
                        .put("id", id)
                        .build()
        );
    }
}
