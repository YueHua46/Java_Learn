// 定义一个接口
interface Animal {
  void eat(); // 所有的动物都需要吃

  void sound(); // 所有的动物都会发出声音
}

// 定义一个Dog类，它实现了Animal接口
class Dog implements Animal {
  // 实现Animal接口的方法
  public void eat() {
    System.out.println("Dog eats");
  }

  public void sound() {
    System.out.println("Dog barks");
  }
}

// 定义一个Cat类，它也实现了Animal接口
class Cat implements Animal {
  // 实现Animal接口的方法
  public void eat() {
    System.out.println("Cat eats");
  }

  public void sound() {
    System.out.println("Cat meows");
  }
}

public class Java_10 {
  public static void main(String[] args) {
    // 创建一个Dog对象
    Dog dog = new Dog();
    dog.eat(); // Dog eats
    dog.sound(); // Dog barks

    // 创建一个Cat对象
    Cat cat = new Cat();
    cat.eat(); // Cat eats
    cat.sound(); // Cat meows
  }
}