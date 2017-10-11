package com.test.start.mapper;

import com.test.start.model.User;

public interface UserMapper {
    User selectUser(int id);
    int insertUser(User user);
}
