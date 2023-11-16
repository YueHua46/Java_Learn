package Java_Basic;
// 定义一个公共类
class PublicClass {
  // 'public'修饰符：这个变量可以被任何其他类访问。
  public int publicField = 0;

  // 'private'修饰符：这个变量只能在其所在的类中被访问。
  private int privateField = 1;

  // 'protected'修饰符：这个变量可以在其所在的类中、同一个包中的其他类以及其子类中被访问。
  protected int protectedField = 2;

  // 'static'修饰符：这个变量属于类，而不是类的实例。无论类有多少个实例，静态变量只有一份。
  static int staticField = 3;

  // 'final'修饰符：这个变量的值一旦被初始化就不能被改变。
  final int finalField = 4;
}

// 定义一个继承自PublicClass的类
class SubClass extends PublicClass {
  void accessFields() {
    // 可以访问公共字段
    System.out.println(publicField);

    // 不能访问私有字段，因为它只能在其所在的类中被访问
    // System.out.println(privateField); // 编译错误

    // 可以访问受保护的字段，因为我们在其子类中
    System.out.println(protectedField);

    // 可以访问静态字段，因为它属于类，而不是类的实例
    System.out.println(staticField);

    // 可以访问最终字段，因为它的值一旦被初始化就不能被改变
    System.out.println(finalField);
  }
}

public class Java_12 {
  public static void main(String[] args) {
    SubClass subClass = new SubClass();
    subClass.accessFields();
  }
}