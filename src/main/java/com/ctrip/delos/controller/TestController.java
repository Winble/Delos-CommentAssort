package com.ctrip.delos.controller;

import com.ctrip.delos.Repository.BlogRepository;
import com.ctrip.delos.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/main")
public class TestController {
    @Autowired
    private BlogRepository blogRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void test() {
        System.out.println("------test------");

        Blog blog = new Blog();
        System.out.println(blogRepository.findAll());
    }
}
