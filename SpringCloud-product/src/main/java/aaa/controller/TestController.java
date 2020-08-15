package aaa.controller;

import aaa.service.TestService;
import entity.Test;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WH
 * @date 2020/8/12 23:56
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    TestService testService;

    @RequestMapping("/selAll")
    public List<Test> selAll(){
        return testService.selAll();
    }

    @RequestMapping("/del")
    public int del(Integer tid){
        int del = testService.del(tid);
        return del;
    }

    @RequestMapping("/add")
    public int add(@RequestBody Test test){
        int add = testService.add(test);
        return add;
    }

    @RequestMapping("/upd")
    public int upd(@RequestBody Test test){
        System.out.println(test.getTname());
        int upd = testService.update(test);
        return upd;
    }
}
