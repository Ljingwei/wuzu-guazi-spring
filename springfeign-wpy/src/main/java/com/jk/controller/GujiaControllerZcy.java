package com.jk.controller;


import com.jk.model.CarareaZcy;
import com.jk.model.SptimeMonthZcy;
import com.jk.model.SptimeYearZcy;
import com.jk.service.GujiaServicezcy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("gujiazcy")
public class GujiaControllerZcy{

    @Autowired
    private GujiaServicezcy gujiaService;


    //查询车源地
    @RequestMapping("queryshengzcy")
    @ResponseBody
    public List<CarareaZcy> queryshengzcy(Integer pid){
        List<CarareaZcy> list=gujiaService.queryshengzcy(pid);
        return  list;
    }
    //查询年份
    @RequestMapping("queryYearzcy")
    @ResponseBody
    public List<SptimeYearZcy> queryYearzcy(){
        List<SptimeYearZcy> list=gujiaService.queryYearzcy();
        return  list;
    }
    //查询月份
    @RequestMapping("queryMonthzcy")
    @ResponseBody
    public List<SptimeMonthZcy> queryMonthzcy(Integer pid){
            List<SptimeMonthZcy> list=gujiaService.queryMonthzcy(pid);
            return  list;
        }

    }
