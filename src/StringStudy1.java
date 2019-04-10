import java.util.UUID;

/**
 * Package: PACKAGE_NAME
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/9 21:19
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class StringStudy1 {
    public static void main(String[] args) {
        String str1 = "Strings.tst";
        String str2 = "strings";
        String str3 = "Strings123";

        int result = str1.compareToIgnoreCase( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);

        result = str3.compareTo( str1 );
        System.out.println(result);

        System.out.println(str1.endsWith("txt"));//判断字符串是否意某个字符串结尾
        System.out.println(str1.startsWith("Str"));//判断字符串是否意某个字符串开始
        String str4="abcerdc";//JVM共享内存中变量
        String str5="ABC";
        String str6="abc";
        String str7=new String("abc");//工作内存中对象
        System.out.println(str4.equals(str5));

        System.out.println(str4.equals(str6));
        System.out.println(str4==str6);//==判断的变量值引用
        System.out.println(str4==str7);//==判断了对象类型，内存地址
        System.out.println(str4.equals(str7));
        System.out.println(str4.hashCode());
        System.out.println(str5.hashCode());
        System.out.println(str4.indexOf(1));
        System.out.println(str4.indexOf("c",4));
        System.out.println(str4.lastIndexOf("c",4));
        String Str = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)runoob(.*)"));

        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)google(.*)"));

        System.out.print("返回值 :" );
        System.out.println(Str.matches("^www(.*)runoob(.*)com"));
        System.out.println((Str.replace('r','c')));//替换的是字符
        System.out.println(Str.replaceAll("www","q"));//替换整个字符串
        String strDemo="1|2,3,4,5,6,7,8,9";
        System.out.println(strDemo.substring(3,4));
        String[] strs=strDemo.split("|");
        String strDemo1=" str i   ng ";
        System.out.println(strDemo1);
        System.out.println(strDemo1.trim().replaceAll(" ",""));
        String id=UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(id);
        String shu="123456";
        int shu2=Integer.parseInt(shu);//String -->int
        String shu1=String.valueOf(123456);//int-->String

        for (int i=0;i<strs.length;i++){
//            System.out.println(strs[i]+i);
//            String[] strs2=strs[1].split(",");
//            for (String s:strs2
//                 ) {
//                System.out.println(s);
//
//            }
        }
    }
}
