package com.github.lihengming.test.service;

import com.github.lihengming.test.dao.UserDao;
import com.github.lihengming.test.model.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService,InitializingBean {
    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        for (int i = 1; i <= 100; i++) {
            userDao.save(new User("TEST-NAME-" + i));
        }
    }
}
