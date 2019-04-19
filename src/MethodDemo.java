/**
 * Package: PACKAGE_NAME
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/19 22:00
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class MethodDemo {

    private static  String print(String str){
        System.out.println(str);//2
        return str+" is big !";//3
    }
    private static  int print(String str,String str2){
        System.out.println(str);//2
        return 12;//3
    }

    public static void main(String[] args) {
        String result=print("China");//1.
        int result1=print("123","456");
        System.out.println(result1);
        System.out.println(result);//4
    }

}
