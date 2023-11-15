class Java_01 {
  public static void main(String[] args) {
    System.out.printf("Hello World!");
    int age;
    age = 27;
    System.out.println(age);

    // 7种java基本类型
    byte aSingleByte = 100; // -2^7 - 2^7
    short aSmallNumber = 20000; // -2^15 - 2^15
    int aNumber = 1000000000; // -2^31 - 2^31
    long aLargeNumber = 1000000000000000000L; // -2^63 - 2^63
    float aDecimalNumber = 3.14f; // -2^31 - 2^31
    double aLargeDecimalNumber = 3.14159265358979323846264338327950288419716939937510582097494459230781640628620899d; // -2^63
                                                                                                                      // -
                                                                                                                      // 2^63
    boolean aTrueOrFalseValue = true; // true or false

    // 引用类型
    char aSingleCharacter = 'A'; //
    // 同时可以使用转义字符
    char aSingleCharacterWithEscape = '\n';
    // 也可以使用Unicode
    char aSingleCharacterWithUnicode = '\u0041';
    String aStringOfCharacters = "Hello World!"; // 一串字符

    // - 关于转换
    // 范围更小的数字允许赋值给范围更大的数字
    aSmallNumber = aSingleByte;
    // 反之，范围更大得数字不允许赋值给范围更小的数字
    // aSingleByte = aSmallNumber;

    // double到int
    double aDouble = 3.14;
    // 强制转换为int
    int aInt = (int) aDouble;

    System.out.println(aInt); // 3，因为将会丢失小数部分

    // 执行命令行参数，在执行时通过java Java_01 1 2 3 4 5传入
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }

    // 不能使用未初始化得变量
    int a;
    // System.out.println(a); // error: variable a might not have been initialized
  }
}