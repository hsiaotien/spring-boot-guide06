package com.dev.guide06.pojo;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "t_user")
public class User {
    @Column(name = "userName")
    private String userName;
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
