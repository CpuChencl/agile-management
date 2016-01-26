package com.deppon.mbi.agile.core.service;

import com.deppon.mbi.agile.core.domain.auth.User;

/**
 * Created by sunyamorn on 1/27/16.
 */
public interface UserService {

    User query(String id);
}
