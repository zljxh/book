package com.best.book.controller;


import com.best.book.dao.TestDao;
import com.best.book.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
    /**
     * 登陆页面
     */
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("user/login");
    }

    @Autowired
    TestDao testDao;

    @GetMapping("/getTest")
    public Test getTest() {
        return testDao.getTest();
    }

}
