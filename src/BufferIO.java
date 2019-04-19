import java.io.*;

public class BufferIO {
    public static void main(String args[])  {
//        char c;
//        // 使用 System.in 创建 BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符, 按下 'q' 键退出。");
//        // 读取字符
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');
        // 使用 System.in 创建 BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str;
//        System.out.println("Enter lines of text.");
//        System.out.println("Enter 'end' to quit.");
//        do {
//            str = br.readLine();
//            String s=(str.split(","))[0];
//            System.out.println(s);
//            System.out.println(str);
//        } while (!str.equals("end"));
        try {


        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        writer.append("中文输入");
        // 写入到缓冲区

        writer.append("\r\n");
        // 换行

        writer.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        fop.close();
        // 关闭输出流,释放系统资源

        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流

        fip.close();
        }catch (Exception e){
            throw  new RuntimeException("出错了");
//            System.out.println(e.getMessage());
//            System.out.println(e.getStackTrace());
        }
        // 关闭输入流,释放系统资源
    }
}