package com.kaiming.liu.model2;

import java.io.Serializable;

/**
 * @author KaiMing
 * @version v1
 * @since 17/2/24
 */
public class Parent implements Serializable{

    private static final long serialVersionUID = 312126522456301095L;
    private String name;

    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
