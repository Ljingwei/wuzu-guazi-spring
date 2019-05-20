package com.jk.mapper;

import com.jk.model.Test;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestMapper {
    @Select("select * from t_test")
    public List<Test> query();

}
