package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pageyw")
public class PageYw {

    @RequestMapping("showyw")
   public String showyw(){

        return "mainyw";
   }

   //买车
    @RequestMapping("addyw")
    public String addyw(){

        return "buycar";
    }

    @RequestMapping("maicar")
    public String maicar(){

        return "showCarList";
    }

    @RequestMapping("yecar")
    public String yecar(){

        return "bootoop";
    }





}
