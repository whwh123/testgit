package com.aaa.controller;

import com.aaa.dao.TestDao;
import entity.Test;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WH
 * @date 2020/8/10 20:29
 */
@CrossOrigin
@RestController
public class TestController {
    @Resource
    TestDao testDao;

    @RequestMapping("test")
    public String test(){
        return testDao.test();
    }

    @RequestMapping("selAll")
    public List<Test> selAll(){
        return testDao.selAll();
    }
    @RequestMapping("del/{tid}")
    public List<Test> del(@PathVariable("tid") Integer tid){
        int del = testDao.del(tid);
        if (del>0){
            return selAll();
        }else{
            return null;
        }
    }

    @RequestMapping("add")
    public List<Test> add(@RequestBody Test test){
        int add = testDao.add(test);
        if (add>0){
            return selAll();
        }else{
            return null;
        }
    }

    @RequestMapping("upd")
    public List<Test> upd(@RequestBody Test test){
        System.out.println(test.getTname());
        int add = testDao.upd(test);
        if (add>0){
            return selAll();
        }else{
            return null;
        }
    }
}
