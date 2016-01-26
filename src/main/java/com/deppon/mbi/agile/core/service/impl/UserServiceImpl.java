package com.deppon.mbi.agile.core.service.impl;

import com.deppon.mbi.agile.core.dao.UserDao;
import com.deppon.mbi.agile.core.domain.auth.User;
import com.deppon.mbi.agile.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunyamorn on 1/27/16.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User query(String id) {
        return userDao.query(id);
    }
}
