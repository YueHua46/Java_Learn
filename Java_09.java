public class Java_09 {
  public static void main(String[] args) {
    // 创建一个Student对象
    Student student1 = new Student();
    student1.name = "Alice"; // 设置student1的name属性为"Alice"
    student1.age = 20; // 设置student1的age属性为20
    student1.sayHello(); // 调用student1的sayHello方法

    // 创建另一个Student对象
    Student student2 = new Student();
    student2.name = "Bob"; // 设置student2的name属性为"Bob"
    student2.age = 22; // 设置student2的age属性为22
    student2.sayHello(); // 调用student2的sayHello方法
  }
}

// 定义一个Student类
class Student {
  // 属性
  String name; // name属性，用来存储学生的名字
  int age; // age属性，用来存储学生的年龄

  // 方法
  void sayHello() { // sayHello方法，用来打印学生的问候语
    System.out.println("Hello, my name is " + name + ", I am " + age + " years old.");
  }
}