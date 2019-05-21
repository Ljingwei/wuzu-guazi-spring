package com.jk.controller;

import com.jk.model.Test;
import com.jk.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodController {

    @Autowired
    private GoodService goodService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return goodService.hello( name );
    }

    @RequestMapping(value = "/query")
    public List<Test> query(){
        List<Test> list=goodService.query();
        return  list;
    }
}
