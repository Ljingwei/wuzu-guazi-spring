package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.BuyCarBean;
import com.jk.model.CarBeanYw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

   @Autowired
    private UserMapper userMapper;

   /*//分页查询
    @Override
    public Easyuipage carqueryYw(Integer page,Integer rows,CarBeanYw carBeanYw) {
        Easyuipage result = new Easyuipage();
        HashMap<String, Object> params = new HashMap<>();

        return result;
    }*/

    //查询
    @Override
    public List<CarBeanYw> carqueryYwa() {

        return userMapper.carqueryYwa();
    }


    /**
     * 查询买车列表
     * @return
     */
    @Override
    public List<BuyCarBean> getBuyCarLista(BuyCarBean buyCarBean) {
        System.out.println(buyCarBean);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("buyCarBean",buyCarBean);
        List<BuyCarBean> list=userMapper.getBuyCarLista(map);
        return list;
    }


    @Override
    public BuyCarBean getBuyCarListOne(Integer id) {

        return userMapper.getBuyCarListOne(id);
    }


}
