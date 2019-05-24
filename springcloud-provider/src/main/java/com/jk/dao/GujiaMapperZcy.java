package com.jk.dao;

import com.jk.model.CarareaZcy;
import com.jk.model.SptimeMonthZcy;
import com.jk.model.SptimeYearZcy;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GujiaMapperZcy {
    //查询车源地
    @Select(" select * from t_cararea where pid=#{pid}")
    List<CarareaZcy> queryshengzcy(Integer pid);
    //查询上牌年份
    @Select("   SELECT * from t_sptime where sptimepid=0")
    List<SptimeYearZcy> queryYearzcy();
    //查询年份2019月份
    @Select("  SELECT * FROM t_spcartime_month  WHERE  pid=#{value}")
    List<SptimeMonthZcy> queryMonth2019zcy(Integer id);
}
