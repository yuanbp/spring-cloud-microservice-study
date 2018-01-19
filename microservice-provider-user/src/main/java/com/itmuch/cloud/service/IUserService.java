package com.itmuch.cloud.service;

import com.itmuch.cloud.entity.User;

/**
 * Created by Richard on 2017/12/27 0027.
 */
public interface IUserService {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
