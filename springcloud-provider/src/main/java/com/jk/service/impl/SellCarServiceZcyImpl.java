package com.jk.service.impl;

import com.jk.mapper.SellCarMapper;
import com.jk.model.*;
import com.jk.service.SellCarServiceZcy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellCarServiceZcyImpl implements SellCarServiceZcy {


    @Autowired
    private SellCarMapper sellCarMapper;
    //查询车系品牌
    @Override
    public List<BrandZcy> querypinpaizcy() {
        return sellCarMapper.querypinpaizcy();
    }
   //查询年份
    @Override
    public List<SptimeYearZcy> queryyearzcy() {
        return sellCarMapper.queryyearzcy();
    }
 //查询月份
    @Override
    public List<SptimeMonthZcy> querymonthzcy(Integer pid) {
        if(pid==19){
            return sellCarMapper.querymonthzcy2019();
        }else{
            return sellCarMapper.querymonthzcy();
        }
    }
    //查询车源地
    @Override
    public List<CarareaZcy> queryareazcy(Integer pid) {
        return sellCarMapper.queryareazcy(pid);
    }

    //查询车系
    @Override
    public List<SeriesZcy> querychexizcy(Integer pid) {
        return sellCarMapper.querychexizcy(pid);
    }
}
