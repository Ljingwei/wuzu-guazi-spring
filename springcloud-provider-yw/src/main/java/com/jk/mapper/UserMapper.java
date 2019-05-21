package com.jk.mapper;

import com.jk.model.BuyCarBean;
import com.jk.model.CarBeanYw;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;



public interface UserMapper {


   /* int userMapperYw(HashMap<String, Object> params);


    List<CarBeanYw> rownumqueryYw(HashMap<String, Object> params);*/

    @Select("select * from c_car")
    List<CarBeanYw> carqueryYwa();

    List<BuyCarBean> getBuyCarLista(HashMap<Object, Object> map);

    BuyCarBean getBuyCarListOne(Integer id);

}
