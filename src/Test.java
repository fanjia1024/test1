public class Test{
    public static void main(String args[]){
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        //菜鸟教程官网：www.runoob.com
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        //字符串的翻转
        System.out.println("反转后的字符串："+sBuffer.reverse());
        System.out.println(sBuffer.delete(1,3));
        System.out.println(sBuffer.replace(1,3,"WWW"));
        System.out.println(sBuffer.indexOf("WWW"));
        System.out.println(sBuffer.toString());
        StringBuilder stringBuilder=new StringBuilder("百度的官方网址：");
        stringBuilder.append("www.");
        stringBuilder.append("baidu.");
        stringBuilder.append("com");
        System.out.println(stringBuilder);
        System.out.println("反转后的字符串："+stringBuilder.reverse());
        System.out.println(stringBuilder.delete(1,3));
    }
}