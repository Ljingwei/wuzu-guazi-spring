package com.jk.service;

import com.jk.model.BuyCarBean;
import com.jk.model.CarBeanYw;

import java.util.List;


public interface UserService {

  /*  Easyuipage carqueryYw(Integer page, Integer rows, CarBeanYw carBeanYw);*/


    List<CarBeanYw> carqueryYwa();


    List<BuyCarBean> getBuyCarLista(BuyCarBean buyCarBean);

    BuyCarBean getBuyCarListOne(Integer id);
}
