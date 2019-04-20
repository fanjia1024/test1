package com.object;

/**
 * Package: com.object
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/21 0:20
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class TaiJianSon  {
    //final修饰的类不允许继承俗称太监类，没有后代
    //final修饰的变量不允许修改。创建之日起不能再次修改，创建时需要在类内部进行初始化
    public static void main(String[] args) {
        String name=FinalDemo.name;
//        FinalDemo.name="魏忠贤";
        System.out.println(name);
        FinalDemo.print();
    }
}
