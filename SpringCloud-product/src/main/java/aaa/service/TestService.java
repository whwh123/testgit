package aaa.service;

import aaa.dao.TestDao;
import entity.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WH
 * @date 2020/8/12 23:54
 */
@Service
public class TestService {
    @Resource
    TestDao testDao;

    public List<Test> selAll(){
        return testDao.selectAll();
    };

    public int del(Integer tid){
        int i = testDao.deleteByPrimaryKey(tid);
        return i;
    }
    public int add(Test test){
        int insert = testDao.insert(test);
        return insert;
    }

    public int update(Test test){
        int i = testDao.updateByPrimaryKey(test);
        return i;
    }

}
