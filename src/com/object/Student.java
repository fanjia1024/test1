package com.object;

/**
 * Package: com.object
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/21 0:47
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class Student {
    private String name;
    private int age;
    private boolean sex;

    private Student(){
        this.name="lily";
        this.age=18;
        this.sex=false;
    }
    public static Student getInstance(){

        return new Student();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
