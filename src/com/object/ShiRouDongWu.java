package com.object;

/**
 * Package: com.object
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/21 0:08
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 * java类只支持单继承，但是可以多实现
 */
public class ShiRouDongWu extends Animal implements AnimalInterface,DemoInterface{
    @Override//覆盖
    public void fly() {
        System.out.println(" i can fly");
    }

    @Override
    public void fastRun() {
        System.out.println(" i can run like rocket");
    }

    @Override
    public void eat() {
        System.out.println("i can eat anymore");
    }

    @Override
    public void run() {
        super.run();//调用父类中的方法super   this
        System.out.println("i can fly ,so i can run");
        this.color="pink";
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        ShiRouDongWu shiRouDongWu=new ShiRouDongWu();
        shiRouDongWu.run();
        shiRouDongWu.luanPao();
    }

    @Override
    public void luanPao() {
        System.out.println("乱跑");
    }
}
