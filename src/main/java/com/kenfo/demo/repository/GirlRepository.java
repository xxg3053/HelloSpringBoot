package com.kenfo.demo.repository;

import com.kenfo.demo.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kenfo on 2017/9/21.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer>{

    //通过年龄查询
    public List<Girl> findByAge(Integer age);
}
