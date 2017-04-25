package com.github.lihengming.autoconfigure.test.dao;

import com.github.lihengming.autoconfigure.test.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {}

