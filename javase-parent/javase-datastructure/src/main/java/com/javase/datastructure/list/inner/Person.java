package com.javase.datastructure.list.inner;

/**
 * Created by zhangWeiJie on 2017/12/25.
 */
public class Person {
    private String userName;
    private String name;

    public Person() {
    }

    public Person(String userName, String name) {
        this.userName = userName;
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
