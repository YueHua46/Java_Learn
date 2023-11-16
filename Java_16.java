// 导入java.io包，它包含了Java的文件和流操作类
import java.io.*;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

/**
 * Java文件操作的主要特点：
 * 1. Java的java.io包提供了一套用于文件和流操作的类和接口。
 * 2. File类表示文件和目录路径名的抽象表示形式。
 * 3. FileWriter类是用于写入字符文件的便捷类，FileReader类是用于读取字符文件的便捷类。
 * Java的异常处理机制可以用来处理IO操作可能出现的错误。
*/

public class Java_16 {
    public static void main(String[] args) {
        // 创建一个File文件
        // File类表示文件和目录路径名的抽象表示形式。
        // 如下列代码所示，File类的构造函数接受一个字符串参数，表示文件的路径，这将创建一个名为test的文本文件
        File file = new File("test.txt");

        // 这行代码的作用是创建一个新的 FileWriter 对象，用于将数据写入到指定的 File 对象所代表的文件中
        /**
         * FileWriter和try-with-resources的主要特点：
         * 1. FileWriter是Java的一个类，用于写入字符到文件。创建FileWriter对象时需要传入一个File对象，表示要写入的文件。
         * 2. try-with-resources语句是Java 7引入的一个新特性，用于自动管理资源。在try括号内声明的资源会在try语句结束时自动被关闭。
         * 3. 使用try-with-resources语句可以确保即使发生异常，文件也会被正确关闭，防止了资源泄露。
         */
        // 使用try-with-resources语句创建一个FileWriter用于写入字符文件
        // FileWriter类是用于写入字符文件的便捷类
        try (FileWriter writer = new FileWriter(file)) {
            // 写入字符串到文件
            writer.write("Hello World!");
        } catch (IOException e) {
            // 处理IO异常
            e.printStackTrace();
        }

         // 使用try-with-resources语句创建一个FileReader对象
        // FileReader类是用于读取字符文件的便捷类
        try(FileReader reader = new FileReader(file)) {
            // 创建一个长度为1024的“竹筒”
            char[] chars = new char[1024];
            // 用于保存实际读取到的字符数，用于后续的输出
            int count = 0;
            // 如果文件没有读完，继续读取下一个字符
            // read()方法用于读取单个字符。如果读取到文件末尾，返回-1
            /**
             * reader.read() 方法是通过内部的文件指针来跟踪当前读取到哪个字符的。
             * 当你打开一个文件并开始读取时，文件指针会被设置在文件的开始处。
             * 每次调用 read() 方法，文件指针都会向前移动一个字符位置。
             * 所以，read() 方法总是读取文件指针当前指向的字符，并将文件指针向前移动一个位置。
             * 
             * 在这里，如果read接受到的是一个char[]
             * 当你调用 read(char[] cbuf) 方法时，它会从文件指针当前的位置开始
             * 尝试读取 cbuf.length 个字符到 cbuf 数组中。
             * 然后，文件指针会向前移动实际读取的字符数。
             * 所以，如果你再次调用 read(char[] cbuf) 方法，它会从文件指针当前的位置开始，继续读取更多的字符。
             */
            while ((count = reader.read(chars)) != -1) {
                System.out.println(1); // 实际只执行了一次，因为reader.read一次性读取了1024长度的字符
                // 将读取的字符数组转换为字符串输出
                System.out.println(new String(chars, 0, count));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}