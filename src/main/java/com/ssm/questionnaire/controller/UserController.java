package com.ssm.questionnaire.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.questionnaire.base.BaseController;
import com.ssm.questionnaire.model.User;
import com.ssm.questionnaire.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Resource
    UserService userService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public String sayHi() {
        System.out.println("hi");
        return "ok";
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void getById(@PathVariable("id") int id) {
         User user = userService.getById(id);
         System.out.println(user);
    }
}
