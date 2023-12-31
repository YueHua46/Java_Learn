package Java_Basic;
public class Java_05 {
  public static void main(String[] args) {
    // 1. 运算符优先级
    // 1.1 优先级从高到低依次为：
    // 1.1.1 后缀运算符：x++、x--
    // 1.1.2 一元运算符：++x、--x、+x、-x、~、!
    // 1.1.3 乘性运算符：*、/、%
    // 1.1.4 加性运算符：+、-
    // 1.1.5 移位运算符：<<、>>、>>>
    // 1.1.6 关系运算符：>、>=、<、<=、instanceof
    // 1.1.7 相等运算符：==、!=
    // 1.1.8 位与运算符：&
    // 1.1.9 位异或运算符：^
    // 1.1.10 位或运算符：|
    // 1.1.11 逻辑与运算符：&&
    // 1.1.12 逻辑或运算符：||
    // 1.1.13 条件运算符：?:
    // 1.1.14 赋值运算符：=、+=、-=、*=、/=、%=、&=、^=、|=、<<=、>>=、>>>=
    // 1.1.15 逗号运算符：,

    // 2. 运算符结合性
    // 2.1 从左到右的结合性
    System.out.println(1 + 2 + 3); // 6

    // 2.2 从右到左的结合性
    int a, b, c;
    a = b = c = 2;
    System.out.println(a); // 2

    // 2.3 无结合性
    boolean flag = true;
    System.out.println(!!flag); // true

    // 注意：一元减运算符（-）没有结合性，不能连续使用。例如，表达式- -1是非法的，因为两个减号不能连续使用。
    // 但是，如果我们在两个减号之间添加空格，那么它就变成了两个独立的一元减运算符，这是合法的。例如，表达式- -1等价于-(-1)，结果是1。
    System.out.println(- -1); // 1
    // 后缀或前缀运算符只能用于变量，不能用于常量或表达式。例如，表达式1++是非法的，因为1是常量，而不是变量。
  }
}
