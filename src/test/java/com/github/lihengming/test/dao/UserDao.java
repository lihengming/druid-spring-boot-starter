package com.github.lihengming.test.dao;

import com.github.lihengming.test.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {}

