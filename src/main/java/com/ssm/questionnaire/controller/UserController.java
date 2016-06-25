package com.ssm.questionnaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.questionnaire.base.BaseController;

@Controller
public class UserController extends BaseController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public String sayHi() {
        System.out.println("hi");
        return "ok";
    }
}
