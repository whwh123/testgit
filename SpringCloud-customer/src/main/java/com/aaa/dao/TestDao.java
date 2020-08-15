package com.aaa.dao;

import entity.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author WH
 * @date 2020/8/10 20:27
 */
@FeignClient(value = "cloud-product")
public interface TestDao {
    @RequestMapping("user/getUser")
    String test();
    @RequestMapping("test/selAll")
    List<Test> selAll();
    @RequestMapping("test/del")
    int del(@RequestParam("tid") Integer tid);
    @RequestMapping("test/add")
    int add(@RequestBody Test test);
    @RequestMapping("test/upd")
    int upd(@RequestBody Test test);

}
