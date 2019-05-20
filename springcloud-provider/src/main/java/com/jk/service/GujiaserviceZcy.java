package com.jk.service;

import com.jk.model.CarareaZcy;
import com.jk.model.SptimeMonthZcy;
import com.jk.model.SptimeYearZcy;

import java.util.List;

public interface GujiaserviceZcy {
    //查询车源地
    List<CarareaZcy> queryshengzcy(Integer pid);
    //查询年份
    List<SptimeYearZcy> queryYearzcy();
    //查询年份2019月份
    List<SptimeMonthZcy> queryMonth2019zcy(Integer id);
   //查询其他月份
    List<SptimeMonthZcy> queryMonthzcy(Integer id);
}
