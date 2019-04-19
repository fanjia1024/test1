import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Package: PACKAGE_NAME
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/19 21:32
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat smt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1 = smt.format(date);
        System.out.println(date1);
        System.out.println(date.getTime());
        Date date3=new Date(1555681237863L);
        System.out.println(date3);

        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");

        Date t;

        try {
            t = ft.parse(input);//解析
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(1000*3);   // 休眠3秒
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
