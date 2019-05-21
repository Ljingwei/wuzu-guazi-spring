package com.jk.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("page")
public class PageController {

    //跳转主页面
    @RequestMapping("tocarsare")
    public String tocarsare(){
        return  "CarSareView/carsareMain";
    }

   //加载估价脚本 不要动
    @RequestMapping("togujiascript")
    public String togujiascript(){
        return  "CarSareView/gujiascript";
    }

    //加载估价页面
    @RequestMapping("togujiaview")
    public String togujiaview(){
        return  "CarSareView/gujiaview";
    }


    @RequestMapping("totest")
    public String totest(){
        return  "CarSareView/test";
    }
    /*---------------------------------------------------------------------------*/
  //跳转前台卖车主页面
    @RequestMapping("toSellCar")
    public String toSellCar(){
        return  "CarSareView/SellCar";
    }
}
