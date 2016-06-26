package com.ssm.questionnaire.dao.mybatis;

import java.util.List;

import com.ssm.questionnaire.base.BaseDao;
import com.ssm.questionnaire.dao.UserDao;
import com.ssm.questionnaire.model.User;

public class UserDaoImpl extends BaseDao<User, Integer> implements UserDao  {

	public static final String CLASS_NAME = User.class.getName();
	
	public List<User> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
