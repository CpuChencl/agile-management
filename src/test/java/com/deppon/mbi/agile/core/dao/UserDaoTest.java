package com.deppon.mbi.agile.core.dao;

import com.deppon.mbi.agile.core.domain.auth.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by sunyamorn on 1/27/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/application-context.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;
    @Test
    public void testQuery() throws Exception {
        User user = userDao.query("root");
        assertNotNull(user);
    }
}