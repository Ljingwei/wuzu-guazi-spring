package com.jk.service;

import com.jk.model.BuyCarBean;
import com.jk.model.CarBeanYw;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("springcloud-yw")
public interface UserService {



    @GetMapping("carqueryYwa")
    List<CarBeanYw> carqueryYwa();


    @GetMapping("getBuyCarList")
    List<BuyCarBean> getBuyCarLista(@RequestBody BuyCarBean buyCarBean);


    @GetMapping("getBuyCarListOne")
    BuyCarBean getBuyCarListOne(@RequestParam Integer id);


   /* @GetMapping("carqueryYw")
    Easyuipage carqueryYw(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows,@RequestParam("carBeanYw") CarBeanYw carBeanYw);
*/


}
