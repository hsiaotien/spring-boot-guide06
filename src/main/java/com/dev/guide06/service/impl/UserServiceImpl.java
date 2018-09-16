package com.dev.guide06.service.impl;

import com.dev.guide06.mapper.UserMapper;
import com.dev.guide06.pojo.User;
import com.dev.guide06.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public Boolean addUser(String userName, Integer age) {
        User record = new User();
        record.setUserName(userName);
        record.setAge(18);
        int numRow = userMapper.insert(record);
//        System.out.println("人为错误,测试事务:"+1/0);
        return numRow > 0 ? true : false;
    }
}
