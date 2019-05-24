package com.jk.controller;

import com.jk.model.*;
import com.jk.service.SellCarServiceZcy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("sellcarzcy")
public class SellCarControllerZcy {

    @Autowired
    private SellCarServiceZcy sellCarServiceZcy;

    //查询车系品牌
    @RequestMapping("querypinpaizcy")
    @ResponseBody
    public List<BrandZcy> querypinpaizcy(){
        List<BrandZcy> list=sellCarServiceZcy.querypinpaizcy();
     return  list;
    }
    //查询车系
    @RequestMapping("querychexizcy")
    @ResponseBody
    public List<SeriesZcy> querychexizcy(Integer pid){
      //  System.out.println("pid"+pid);
        List<SeriesZcy> list=sellCarServiceZcy.querychexizcy(pid);
        return  list;
    }

    //查询年份
    @RequestMapping("queryyearzcy")
    @ResponseBody
    public List<SptimeYearZcy> queryyearzcy(){
        List<SptimeYearZcy> list=sellCarServiceZcy.queryyearzcy();
        return list;
    }
    //查询月份
    @RequestMapping("querymonthzcy")
    @ResponseBody
    public List<SptimeMonthZcy> querymonthzcy(Integer pid){
        List<SptimeMonthZcy> list=sellCarServiceZcy.querymonthzcy(pid);
        return list;
    }

    //查询车源地省市
    @RequestMapping("queryareazcy")
    @ResponseBody
    public List<CarareaZcy> queryareazcy(Integer pid){
        List<CarareaZcy> list=sellCarServiceZcy.queryareazcy(pid);
        return list;
    }



}
