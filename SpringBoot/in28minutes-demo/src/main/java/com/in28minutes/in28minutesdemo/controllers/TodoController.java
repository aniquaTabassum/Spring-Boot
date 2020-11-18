package com.in28minutes.in28minutesdemo.controllers;

import com.in28minutes.in28minutesdemo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String getTodos(ModelMap modelMap)
    {
        modelMap.put("todos", todoService.retrieveTodos("in28Minutes"));
        return "list-todos";
    }
}
