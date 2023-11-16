package Java_Basic;
public class Java_02 {
  // 定义一个全局变量
  static int a = 1;
  // 定义一个int类型但不赋值，在使用时默认值会是0
  static int b;

  public static void main(String[] args) {
    // 访问全局变量a
    System.out.println(a); // 1
    // 定义一个局部变量
    int b = 2;
    // 访问局部变量
    System.out.println(b); // 2
    // 访问全局变量b
    System.out.println(Java_02.b); // 0，因为没有赋值，默认值则会为0

    // 在一个代码块中定义一个局部变量
    {
      int c = 3;
      System.out.println(c); // 3
    }
    // System.out.println(c); // error: cannot find symbol

    // 不能重复定义变量
    int a = 1;
    // int a = 2; // error: variable a is already defined in method main(String[])

    // java命名规则
    // 1. 只能包含字母、数字、下划线、美元符号
    // 2. 不能以数字开头
    // 3. 不能是java关键字
    // 4. 区分大小写
    int a1 = 1;
    int a_1 = 1;
    int a$1 = 1;
    // int 1a = 1; // error: not a statement
  }
}