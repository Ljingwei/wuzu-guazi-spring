package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author 王鹏焱
 * @Date 2019/5/17 14:00
 */
@FeignClient(value = "service-hi")
public interface BookService extends BookServiceApi  {

}
