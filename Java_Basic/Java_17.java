package Java_Basic;
import java.lang.reflect.Method; // 导入Method类，它代表类的方法
import java.lang.reflect.Field; // 导入Field类，它代表类的字段

/**
 * Java 反射是一个强大的工具，它允许我们在运行时检查类、接口、字段和方法的信息，还可以创建对象，调用方法和访问字段
 * 
 * Java反射的主要特点：
 * 1. Java的java.lang.reflect包提供了一套用于反射操作的类和接口。
 * 2. Class类代表类的实例，可以用来获取类的信息。
 * 3. Method类代表类的方法，Field类代表类的字段。
 * 4. 反射可以在运行时检查类、接口、字段和方法的信息，还可以创建对象，调用方法和访问字段。
 * 5. Java的异常处理机制可以用来处理反射操作可能出现的错误。
 */

public class Java_17 {
    public static void main(String[] args) {
        try {
            // <>中的内容是泛型，?表示不确定的java类型，具体类型由调用的代码来确定
            // 泛型就是解决类、接口、方法的复用性、以及对不特定数据类型的支持（类型校验），因为它可以动态地接收不同类型的参数（类似于TS的泛型）
            // 在这里，Class的泛型能够决定返回的类型，比如Class<String>就是返回String类型的Class对象
            Class<?> cls = Class.forName("java.util.ArrayList"); // 获取ArrayList类的Class对象

            // 获取并打印类的名称
            System.out.println(cls.getName());

            // 获取并打印类的所有公共方法
            Method[] method = cls.getMethods();
            System.out.println("类的所有公共方法：");
            for (Method m : method) {
                System.out.println(m.getName());
            }

            // 获取并打印类的所有公共字段
            System.out.println("类的所有公共字段：");
            Field[] field = cls.getFields();
            for (Field f : field) {
                System.out.println(f.getName());
            }

        } catch (ClassNotFoundException c) {
            // TODO: handle exception
            // printStackTrace方法用于打印异常信息
            c.printStackTrace();
        }
    }
}