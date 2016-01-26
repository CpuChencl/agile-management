package com.deppon.mbi.agile.core.dao.impl;

import com.deppon.mbi.agile.core.dao.BaseDao;
import com.deppon.mbi.agile.core.dao.FunctionDao;
import com.deppon.mbi.agile.core.domain.auth.Function;
import org.springframework.stereotype.Repository;

/**
 * Created by sunyamorn on 1/27/16.
 */
@Repository
public class FunctionDaoImpl extends BaseDao implements FunctionDao {
    @Override
    public Function query(int id) {
        return getSqlSession().selectOne(buildStatement(NAMESPACE, "query"),
                getParamsBuilder()
                        .put("id", id)
                        .build()
        );
    }
}
