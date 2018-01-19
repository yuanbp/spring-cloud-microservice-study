package com.itmuch.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.mapper.UserMapper;
import com.itmuch.cloud.service.IUserService;

/**
 * Created by Richard on 2017/12/27 0027.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public int deleteByPrimaryKey(String id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
