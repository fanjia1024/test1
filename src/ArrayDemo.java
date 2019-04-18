import java.util.Arrays;

/**
 * Package: PACKAGE_NAME
 * Description：
 * Author: 范佳
 * Date: Created in 2019/4/18 22:32
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class ArrayDemo {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] shus=new int[2];
        shus[0]=10;
        shus[1]=20;
        printArray(shus);
        //面向对象的创建方式
//        ArrayDemo arrayDemo=new ArrayDemo();
//        arrayDemo.printArray(shus);
        System.out.println(Arrays.toString(shus));//使用Arrays.toString方法进行整体的输出
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList1 = new double[size];
        myList1[0] = 5.6;
        myList1[1] = 4.5;
        myList1[2] = 3.3;
        myList1[3] = 13.2;
        myList1[4] = 4.0;
        myList1[5] = 34.33;
        myList1[6] = 34.0;
        myList1[7] = 45.45;
        myList1[8] = 99.993;
        myList1[9] = 11123;
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        for (Double i: myList
             ) {
            System.out.println(i);

        }
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
        // 查找最大元素
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
        String s[][] = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
        System.out.println(Arrays.toString(s));

    }
}
