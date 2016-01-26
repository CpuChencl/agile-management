package com.deppon.mbi.agile.core.dao;

import com.deppon.mbi.agile.core.domain.auth.User;

/**
 * Created by sunyamorn on 1/27/16.
 */
public interface UserDao {

    String NAMESPACE = "com.deppon.mbi.agile.core.domain.auth.User";

    User query(String id);

}
