public class Java_03 {
  public static void main(String[] args) {
    // 1. 逻辑运算符
    // 1.1 与运算符 (&&)
    // 1.1.1 与运算符的两个操作数都为true时，结果才为true
    System.out.println(true && true); // true
    System.out.println(true && false); // false
    System.out.println(false && true); // false
    System.out.println(false && false); // false

    // 1.2 或运算符 (||)
    // 1.2.1 或运算符的两个操作数只要有一个为true，结果就为true
    System.out.println(true || true); // true
    System.out.println(true || false); // true
    System.out.println(false || true); // true
    System.out.println(false || false); // false

    // 1.3 非运算符 (!)
    // 1.3.1 非运算符的操作数为true时，结果为false；操作数为false时，结果为true
    System.out.println(!true); // false
    System.out.println(!false); // true

    // 1.4 短路运算符
    // 1.4.1 与运算符和或运算符都是短路运算符，即如果第一个操作数已经能够确定结果时，就不会再计算第二个操作数
    // 示例：如果第一个操作数为false，那么&&运算符就不会计算第二个操作数
    boolean result = false && (10 / 0 == 0); // 这里不会发生除以零的错误，因为&&运算符短路了第二个操作数的计算

    // 1.5 非短路与运算符 (&)
    // 1.5.1 与运算符的两个操作数都为true时，结果才为true
    // 1.5.2 无论第一个操作数的值是什么，都会计算第二个操作数
    System.out.println(true & true); // true
    System.out.println(true & false); // false
    System.out.println(false & true); // false
    System.out.println(false & false); // false
    boolean result2 = false & (10 / 0 == 0); // 这里会发生除以零的错误，因为&运算符没有短路第二个操作数的计算

    // 1.6 非短路或运算符 (|)
    // 1.6.1 或运算符的两个操作数只要有一个为true，结果就为true
    // 1.6.2 无论第一个操作数的值是什么，都会计算第二个操作数
    System.out.println(true | true); // true
    System.out.println(true | false); // true
    System.out.println(false | true); // true
    System.out.println(false | false); // false
    boolean result3 = true | (10 / 0 == 0); // 这里会发生除以零的错误，因为|运算符没有短路第二个操作数的计算

    // 2. 条件运算符 (?:)
    // 2.1 如果条件为真，返回第一个值，否则返回第二个值
    int a = 10;
    int b = 20;
    int max = (a > b) ? a : b;
    System.out.println(max); // 输出较大的数

    String str = (a > b) ? "a is greater" : "b is greater";
    System.out.println(str); // 输出 "b is greater"

  }
}