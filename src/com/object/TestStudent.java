package com.object;

/**
 * Package: com.object
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/21 0:49
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student=Student.getInstance();//单例模式
        String name =student.getName();
        student.setAge(20);
        System.out.println(name+student.getAge()+student.isSex());
    }
}
