package com.ssm.questionnaire.dao;

import org.springframework.stereotype.Repository;

import com.ssm.questionnaire.model.User;

@Repository
public interface UserDao {

    User getById(int id);

}
