package com.jk.dao;

import com.jk.model.CarBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import com.jk.model.Book;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @Author 王鹏焱
 * @Date 2019/5/17 10:51
 */
@Repository
public interface BookMapper {
	/**
	 * 框架测试
	 * @return
	 */
	@Select("select * from t_book3")
	List<Book> querylist();

    @Insert("insert into c_car(brandid,seriesid,sptimeid,mileage,sptimemonthid,plataid,chekuang,yanchetime,yanchedz)\n" +
			"        values(#{brandid},#{seriesid},#{sptimeid},#{mileage},#{sptimemonthid},#{plataid},#{chekuang},#{yanchetime},#{yanchedz})")
	Integer addSellCar(CarBean carBean);
}
