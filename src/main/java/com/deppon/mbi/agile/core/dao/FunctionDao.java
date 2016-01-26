package com.deppon.mbi.agile.core.dao;

import com.deppon.mbi.agile.core.domain.auth.Function;

/**
 * Created by sunyamorn on 1/27/16.
 */
public interface FunctionDao {

    String NAMESPACE = "com.deppon.mbi.agile.core.domain.auth.Function";

    Function query(int id);
}
