package com.object;

/**
 * Package: com.object
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/20 23:56
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class ShiCaoDongWu extends Animal {
    public boolean isShiRou;
    ShiCaoDongWu(){
        super();
        super.color="whiteAndBlack";
        this.isShiRou=true;
    }
    public void chiZhuZi(){
        System.out.println("panda eating ZhuZi!");
    }

    public static void main(String[] args) {
        ShiCaoDongWu shiCaoDongWu=new ShiCaoDongWu();
        shiCaoDongWu.chiZhuZi();
        shiCaoDongWu.run();
        System.out.println(shiCaoDongWu.isShiCao);
    }
}
