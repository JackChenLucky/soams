package com.hzsckj.soams.service;

import com.hzsckj.soams.entity.User;
import com.hzsckj.soams.service.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;
/**
 * Created by Бъ on 2015/9/24.
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserByLoginName(String loginName) {
        return userMapper.findUserByLoginName(loginName);
    }
}
