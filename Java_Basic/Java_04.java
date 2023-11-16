package Java_Basic;
public class Java_04 {
  public static void main(String[] args) {
    // 1. 位运算符
    // 1.1 位与运算符 (&)
    // 1.1.1 两个操作数中位都为1，结果才为1，否则结果为0
    System.out.println(1 & 1); // 1
    System.out.println(1 & 0); // 0
    System.out.println(0 & 1); // 0
    System.out.println(0 & 0); // 0

    // 1.2 位或运算符 (|)
    // 1.2.1 两个操作数的位中，只要有一个为1，那么结果就是1，否则就为0
    System.out.println(1 | 1); // 1
    System.out.println(1 | 0); // 1
    System.out.println(0 | 1); // 1
    System.out.println(0 | 0); // 0

    // 1.3 位异或运算符 (^)
    // 1.3.1 两个操作数的位中，相同则结果为0，不同则结果为1
    System.out.println(1 ^ 1); // 0
    System.out.println(1 ^ 0); // 1
    System.out.println(0 ^ 1); // 1
    System.out.println(0 ^ 0); // 0

    // 1.4 位非运算符 (~)
    // 1.4.1 如果位为0，结果是1，如果位为1，结果是0，结果是以补码的形式展示，所以是-2
    System.out.println(~1); // -2
    System.out.println(~0); // -1

    // 1.5 位左移运算符 (<<)
    // 1.5.1 将二进制位向左移动指定的位数，右侧插入零
    System.out.println(2 << 1); // 4
    System.out.println(2 << 2); // 8
    System.out.println(2 << 3); // 16

    // 1.6 位右移运算符 (>>)
    // 1.6.1 将二进制位向右移动指定的位数，左侧插入符号位
    System.out.println(8 >> 1); // 4
    System.out.println(8 >> 2); // 2
    System.out.println(8 >> 3); // 1

    // 1.7 无符号右移运算符 (>>>)
    // 1.7.1 将二进制位向右移动指定的位数，左侧插入零
    System.out.println(-8 >>> 1); // 2147483644
    System.out.println(-8 >>> 2); // 1073741822
    System.out.println(-8 >>> 3); // 536870911
  }
}
