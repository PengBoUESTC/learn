package com.example.userprovider.services;

import com.example.commoninterface.UserInfo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService
@Service
public class UserInfoImpl implements UserInfo {
    @Override
    public String getUserInfo(String name) {
        System.out.println("provider getUserInfo 调用");
        return name;
    }
}
