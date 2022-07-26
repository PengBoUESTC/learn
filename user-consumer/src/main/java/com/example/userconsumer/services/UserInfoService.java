package com.example.userconsumer.services;

import com.example.commoninterface.UserInfo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService implements UserInfo {
    @DubboReference
    UserInfo userInfo;

    @Override
    public String getUserInfo(String name) {
        return userInfo.getUserInfo(name);
    }
}
