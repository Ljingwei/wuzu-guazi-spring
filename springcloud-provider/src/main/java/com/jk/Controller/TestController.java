package com.jk.Controller;

import com.jk.mapper.TestMapper;
import com.jk.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
        @Autowired
        private TestMapper testMapper;

        @RequestMapping(value = "/query",method = RequestMethod.POST)
        public List<Test> query(){
                List<Test> query1 = testMapper.query();
                return query1;
        }
}
