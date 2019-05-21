package com.jk.controller;

import com.jk.model.BuyCarBean;
import com.jk.model.CarBeanYw;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserControllerYw {


    @Autowired
    private UserService userService;

   /* //分页查询
    @GetMapping("carqueryYw")
    @ResponseBody
    public Easyuipage carqueryYw(Integer page, Integer rows, CarBeanYw carBeanYw){

        return userService.carqueryYw(page,rows,carBeanYw);
    }*/

    //查询
    @GetMapping("carqueryYwa")
    @ResponseBody
    public List<CarBeanYw> carqueryYwa(){

        return userService.carqueryYwa();
    }

    /**
     * 查询买车列表
     * @return
     */
   // @RequestMapping(value = "getBuyCarList",method = RequestMethod.GET)
    @RequestMapping("getBuyCarList")
    @ResponseBody
    public List<BuyCarBean> getBuyCarLista(BuyCarBean buyCarBean){
        System.out.println(buyCarBean);
        List<BuyCarBean> buyCarBeanList= userService.getBuyCarLista(buyCarBean);
        return buyCarBeanList;
    }

    /**
     * 单个查询列表
     * @return
     */
    @RequestMapping("getBuyCarListOne")
    public String getBuyCarListOne(Integer id, Model model){
        BuyCarBean buyCarOne=  userService.getBuyCarListOne(id);
        System.out.println(buyCarOne);
        model.addAttribute("buyCarOne",buyCarOne);
        model.addAttribute("id",id);
        return "buyCars";
    }












}
