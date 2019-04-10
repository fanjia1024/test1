/**
 * Package: PACKAGE_NAME
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/9 20:59
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class TestString {
    public static void main(String[] args) {
        //string字符串的两种实现方式
        String greeting = "菜鸟教程";//第一种

        System.out.println(greeting);
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString.length()+"--------"+greeting.length());
                System.out.println( helloString+greeting );
        System.out.println( helloString.concat(greeting) );
        System.out.println( helloString.charAt(2) );//charAt方法的取值范围是0  -length-1
        int intVar =10;
        System.out.printf("整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s",  intVar, greeting);

    }

}
