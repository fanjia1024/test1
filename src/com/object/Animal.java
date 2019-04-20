package com.object;

/**
 * Package: com.object
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/20 23:38
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 * 动物的父类
 */
public class Animal {
    public String color;
    public boolean isBuRu;
    public boolean isShiCao;
    public int tui;
    //构造器、构造函数、构造方法必须与类名一致
    public  Animal(){
        this.color="blue";
        this.isBuRu=true;
        this.isShiCao=false;
    }
    public  Animal(String color){
        this.color=color;
    }
    //方法
    public void run(){
        System.out.println("this animal can run !");
    }

    public void run(String str){
        System.out.println("this animal can run !");
    }

    public static void main(String[] args) {
        //创建对象： 类名 对象名称=new 对象(xx xx);
        Animal animal=new Animal();
        String color=animal.color;
        System.out.println(color);
        Animal animal1=new Animal("black");
        System.out.println(animal1.color);
        System.out.println(animal1.isBuRu);
        System.out.println(animal1.tui);
    }
}
