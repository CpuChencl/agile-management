package com.deppon.mbi.agile.core.dao.impl;

import com.deppon.mbi.agile.core.dao.BaseDao;
import com.deppon.mbi.agile.core.dao.RoleDao;
import com.deppon.mbi.agile.core.domain.auth.Role;
import org.springframework.stereotype.Repository;

/**
 * Created by sunyamorn on 1/27/16.
 */
@Repository
public class RoleDaoImpl extends BaseDao implements RoleDao {
    @Override
    public Role query(int id) {
        return getSqlSession().selectOne(buildStatement(NAMESPACE, "query"),
                getParamsBuilder()
                        .put("id", id)
                        .build()
        );
    }
}
