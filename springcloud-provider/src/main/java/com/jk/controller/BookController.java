package com.jk.controller;

import com.jk.dao.BookMapper;
import com.jk.model.Book;
import com.jk.model.CarBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 王鹏焱
 * @Date 2019/5/17 10:47
 */


@RestController
public class BookController {

	@Autowired
	private BookMapper bookMapper;

	/**
	 * 框架测试
	 *
	 * @return
	 */

	@GetMapping(value = "/querylist")
	public List<Book> querylist() {
		return bookMapper.querylist();
	}

	@RequestMapping("addSellCar")
	public Integer addSellCar(CarBean carBean) {

		return bookMapper.addSellCar(carBean);
	}


}