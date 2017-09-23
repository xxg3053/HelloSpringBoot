package com.kenfo.demo.service;

import com.kenfo.demo.domain.Girl;
import com.kenfo.demo.enums.ResultEnum;
import com.kenfo.demo.exception.GirlException;
import com.kenfo.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by kenfo on 2017/9/22.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 事务控制
     */
    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("E");
        girlA.setAge(19);
        girlRepository.save(girlA);


        Girl girlB = new Girl();
        girlB.setCupSize("FM");
        girlB.setAge(20);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if(age < 10){
            //返回“你还在上小学”
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }else if(age > 10 && age < 16){
            //返回“你在上初中”
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else{
            throw new GirlException(ResultEnum.SUCCESS);
        }
    }

    /**
     * 通过ID查询
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }
}
