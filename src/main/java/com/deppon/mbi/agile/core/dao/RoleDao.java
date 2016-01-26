package com.deppon.mbi.agile.core.dao;

import com.deppon.mbi.agile.core.domain.auth.Role;

/**
 * Created by sunyamorn on 1/27/16.
 */
public interface RoleDao {
    String NAMESPACE = "com.deppon.mbi.agile.core.domain.auth.Role";

    Role query(int id);
}
