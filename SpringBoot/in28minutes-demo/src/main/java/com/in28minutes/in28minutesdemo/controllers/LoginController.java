package com.in28minutes.in28minutesdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.modelmbean.ModelMBean;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginMessage(ModelMap model)
    {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcomeMessage(@RequestParam String name, ModelMap model)
    {
        model.put("name", name);
        return "welcome";
    }
}
