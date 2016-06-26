package com.ssm.questionnaire.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.questionnaire.base.IBaseDao;
import com.ssm.questionnaire.model.User;

@Repository
public interface UserDao extends IBaseDao<User, Integer> {

	List<User> find();
}
