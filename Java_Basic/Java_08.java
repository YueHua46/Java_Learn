package Java_Basic;
public class Java_08 {
  public static void main(String[] args) {
    // 调用函数
    int sum = add(1, 2);
    System.out.println("The sum is: " + sum);

    // 调用函数
    sayHello("World");
  }

  // 定义一个函数，用于计算两个整数的和
  public static int add(int a, int b) {
    return a + b;
  }

  // 定义一个函数，用于打印一条问候语
  public static void sayHello(String name) {
    System.out.println("Hello, " + name + "!");
  }
}
