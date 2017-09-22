package com.kenfo.demo.service;

import com.kenfo.demo.domain.Girl;
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
}
