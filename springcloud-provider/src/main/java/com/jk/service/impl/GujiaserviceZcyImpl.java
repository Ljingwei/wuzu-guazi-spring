package com.jk.service.impl;

import com.jk.dao.GujiaMapperZcy;
import com.jk.model.CarareaZcy;
import com.jk.model.SptimeMonthZcy;
import com.jk.model.SptimeYearZcy;
import com.jk.service.GujiaserviceZcy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GujiaserviceZcyImpl implements GujiaserviceZcy {

    @Autowired
    private GujiaMapperZcy gujiaMapperZcy;
    //查询车源地
    @Override
    public List<CarareaZcy> queryshengzcy(Integer pid) {
        return gujiaMapperZcy.queryshengzcy(pid);
    }
    //查询年份
    @Override
    public List<SptimeYearZcy> queryYearzcy() {
        return gujiaMapperZcy.queryYearzcy();
    }
    //查询年份2019月份
    @Override
    public List<SptimeMonthZcy> queryMonth2019zcy(Integer id) {
        return gujiaMapperZcy.queryMonth2019zcy(id);
    }
    //查询其他月份

    @Override
    public List<SptimeMonthZcy> queryMonthzcy(Integer id) {
        return null;
    }


}
