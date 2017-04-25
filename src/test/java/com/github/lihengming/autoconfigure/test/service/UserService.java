package com.github.lihengming.autoconfigure.test.service;

import com.github.lihengming.autoconfigure.test.model.User;

public interface UserService {
    User findById(Long id);
}
