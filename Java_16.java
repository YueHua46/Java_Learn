// 导入java.io包，它包含了Java的文件和流操作类
import java.io.*;

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
        File file = new File("test.txt");

        // 使用try-with-resources语句创建一个FileWriter用于写入字符文件
        // FileWriter类是用于写入字符文件的便捷类

        try (FileWriter writer = new FileWriter(file)) {
            // 写入字符串到文件
            writer.write("Hello World!");
        } catch (IOException e) {
            // 处理IO异常
            e.printStackTrace();
        }
    }
}