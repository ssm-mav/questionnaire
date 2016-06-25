package com.ssm.questionnaire.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.questionnaire.base.BaseService;
import com.ssm.questionnaire.dao.UserDao;
import com.ssm.questionnaire.model.User;
import com.ssm.questionnaire.service.UserService;

@Service
public class UserServiceImpl extends BaseService implements UserService {
    @Resource
    UserDao userDao;

    public User getById(int id) {
        
        return userDao.getById(id);
    }

}
