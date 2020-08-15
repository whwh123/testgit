package aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author WH
 * @date 2020/8/10 17:23
 */
@RestController
@RequestMapping("user")
public class Controller {

    @RequestMapping("getUser")
    public String getUser(){
        return "狗哒";
    }

    /*@RequestMapping("selAll")
    public List<Test> selAll(){
        return testService.selAll();
    }
    @RequestMapping("del")
    public int del(Integer id){
        return testService.del(id);
    }
    @RequestMapping("addorupd")
    public int addorupd(Test test){
        Long tid = test.getTid();
        int i = -1;
        if (tid==0 || tid==null){
            i = testService.add(test);
        }else {
             i = testService.update(test);
        }
        return i;
    }*/
}
