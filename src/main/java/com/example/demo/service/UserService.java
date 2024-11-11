package com.example.demo.service;

import com.example.demo.entity.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserInfo getUser(int id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setUsername("ccc");
        return userInfo;
    }
}
