package com.kenfo.demo.exception;

import com.kenfo.demo.enums.ResultEnum;

/**
 * Created by kenfo on 2017/9/22.
 *
 * RuntimeException 事务才会回滚
 */
public class GirlException extends RuntimeException{

    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
