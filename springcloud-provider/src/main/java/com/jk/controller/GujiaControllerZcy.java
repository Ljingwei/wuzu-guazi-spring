package com.jk.controller;

import com.jk.model.CarareaZcy;
import com.jk.model.SptimeMonthZcy;
import com.jk.model.SptimeYearZcy;
import com.jk.service.GujiaserviceZcy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("gujiazcy")
public class GujiaControllerZcy {

    @Autowired
    private GujiaserviceZcy gujiaserviceZcy;


    //查询车源地
    @RequestMapping(value = "/queryshengzcy",method = RequestMethod.POST)
    @ResponseBody
    public List<CarareaZcy> queryshengzcy(@RequestParam("pid") Integer pid){
        List<CarareaZcy> list=gujiaserviceZcy.queryshengzcy(pid);
        return list;
    }
    //查询年
    @RequestMapping(value = "/queryYearzcy",method = RequestMethod.POST)
    @ResponseBody
    public List<SptimeYearZcy> queryYearzcy(){
        List<SptimeYearZcy> list=gujiaserviceZcy.queryYearzcy();
        return list;
    }
    //查询月份
    @RequestMapping(value = "/queryMonthzcy",method = RequestMethod.POST)
    @ResponseBody
    public List<SptimeMonthZcy> queryMonthzcy(@RequestParam("pid") Integer pid){
        if(pid==19){
            Integer id=-1;
            List<SptimeMonthZcy> list=gujiaserviceZcy.queryMonth2019zcy(id);
            return  list;
        }else{
            Integer id=0;
            List<SptimeMonthZcy> list2=gujiaserviceZcy.queryMonthzcy(id);
            return  list2;
        }
    }
}
