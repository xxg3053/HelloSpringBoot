package com.kenfo.demo;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Created by kenfo on 2017/9/21.
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String cupSize;
    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
