package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SellCarMapper {
    //查询车系品牌
    @Select("select * from t_brand")
    List<BrandZcy> querypinpaizcy();
    //查询车系
    @Select("select * from t_series where brandid=#{value}")
    List<SeriesZcy> querychexizcy(Integer pid);
    //查询年份
    @Select("  select * from t_sptime GROUP BY sptimeid desc")
    List<SptimeYearZcy> queryyearzcy();

    //查询年份为2019月份
    @Select(" select * from t_spcartime_month a where pid=-1 ")
    List<SptimeMonthZcy> querymonthzcy2019();
    //查询其他月份
    @Select(" select * from t_spcartime_month a where pid=1 ")
    List<SptimeMonthZcy> querymonthzcy();

    //查询车源地
    @Select(" select * from t_cararea a where pid=#{value} ")
    List<CarareaZcy> queryareazcy(Integer pid);
}
