package com.hae.datasource.service;

import com.hae.datasource.config.TargetDataSource;
import com.hae.datasource.dao.DemoRepository;
import com.hae.datasource.dao.TestDao;
import com.hae.datasource.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class TestService {



    @Resource

    private TestDao testDao;

    @Autowired
    private DemoRepository demoRepository;



    /**

     * 不指定数据源使用默认数据源

     * @return

     */
    @TargetDataSource("read1")
    public List<Demo> getList(){

        return demoRepository.findAll();

    }
    public void save(Demo demo){
        demoRepository.save(demo);
    }



    /**

     * 指定数据源

     * @return

     */

    @TargetDataSource("ds1")

    public List<Demo> getListByDs1(){

        return testDao.getListByDs1();

    }

}
