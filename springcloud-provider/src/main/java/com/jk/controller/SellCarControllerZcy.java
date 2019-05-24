package com.jk.controller;

import com.jk.model.*;
import com.jk.service.SellCarServiceZcy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sellcarzcy")
public class SellCarControllerZcy {

    @Autowired
    private SellCarServiceZcy sellCarServiceZcy;

    //查询车系品牌
    @PostMapping("querypinpaizcy")
    public List<BrandZcy> querypinpaizcy(){
        List<BrandZcy> list=sellCarServiceZcy.querypinpaizcy();
        return list;
    }


    //查询车系
    @PostMapping("querychexizcy")
    public List<SeriesZcy> querychexizcy(@RequestParam("pid") Integer pid){
        List<SeriesZcy> list=sellCarServiceZcy.querychexizcy(pid);
        return list;
    }
    //查询年份
    @PostMapping("queryyearzcy")
    public List<SptimeYearZcy> queryyearzcy(){
        List<SptimeYearZcy> list=sellCarServiceZcy.queryyearzcy();
        return list;
    }
    //查询月份
    @PostMapping("querymonthzcy")
    public List<SptimeMonthZcy> querymonthzcy(@RequestParam("pid") Integer pid){
        List<SptimeMonthZcy> list=sellCarServiceZcy.querymonthzcy(pid);
        return list;
    }
    //查询车源地
    @PostMapping("queryareazcy")
    public List<CarareaZcy> queryareazcy(@RequestParam("pid") Integer pid){
        List<CarareaZcy> list=sellCarServiceZcy.queryareazcy(pid);
        return list;
    }
}
