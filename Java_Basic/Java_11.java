package Java_Basic;
public class Java_11 {
  public static void main(String[] args) {
    try {
      // 尝试执行可能会抛出异常的代码
      int result = divide(10, 0);
      System.out.println(result);
    } catch (ArithmeticException e) {
      // 捕获并处理ArithmeticException异常
      System.out.println("捕获异常: " + e.getMessage());
    } finally {
      // 无论是否发生异常，finally块中的代码都会被执行
      System.out.println("Finished");
    }
  }

  // 定义一个方法，用于计算两个整数的商
  public static int divide(int a, int b) throws ArithmeticException {
    if (a == 0 || b == 0) {
      throw new ArithmeticException("算数错误：除数不能为0");
    }
    return a / b;
  }
}
