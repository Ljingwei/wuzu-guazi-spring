package com.jk.controller;

import com.jk.model.Book;
import com.jk.model.CarBean;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 王鹏焱
 * @Date 2019/5/17 10:53
 */


@Controller
@RequestMapping("addindex")
public class BookController {
	 @Autowired
	 private BookService bookService;

	@RequestMapping("tolist")
	public  String tolist(){
		return "list";
	}
	@RequestMapping("toindex")
	public  String tophoto(){
		return "index";
	}
	@RequestMapping("test")
	public String test(){
		return  "test";
	}

	@GetMapping(value = "/querylist")
	@ResponseBody
	public List<Book> querylist(){
		return bookService.querylist();
	}

	/**
	 * 框架测试
	 * @return
	 */
	@RequestMapping("toSellCarPage")
	public String toSellCarPage(){
		return "SellCar";
	}
	/**
	 * 新增提交卖车信息
	 */
	@RequestMapping("addSellCar")
	@ResponseBody
	public Integer addSellCar(CarBean carBean){

		return bookService.addSellCar(carBean);
	}
	/**
	 * 跳转瓜子服务页面
	 * @return
	 */
	@RequestMapping("toServicePage")
	public String toServicePage(){
		return "CarService";
	}
}