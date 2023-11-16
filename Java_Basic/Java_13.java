package Java_Basic;
/**
 * 本文总结：
 * 
 * 1. 本文件展示了Java的类继承、方法重载和方法重写的基本概念和用法。
 * 2. Animal类是一个基类，它定义了一个eat方法和一个重载的eat方法，接收一个String类型的参数。
 * 3. Dog和Cat类都是Animal类的子类，它们继承了Animal类的方法，并且重写了eat方法。
 * 4. Dog类还定义了一个特有的bark方法，Cat类定义了一个特有的meow方法。
 * 5. @Override注解用于指示编译器该方法覆盖了父类中的方法。这个注解不是必需的，但可以提高可读性和编译器检查错误的能力。
 * 本文件展示了如何在子类中调用和重写父类的方法，以及如何使用方法重载来定义多个名称相同但参数列表不同的方法。
 */

// 父类
class Animal {
    void eat() {
        System.out.println("animal : eat");
    }
    // 重载eat方法，接收一个String类型的参数
    void eat(String s) {
        System.out.println("animal : eat " + s);
    }
}

// 子类
class Dog extends Animal {
    // 重写父类的eat方法
    // @Override注解用于指示编译器该方法覆盖了父类中的方法。这个注解不是必需的，但可以提高可读性和编译器检查错误的能力
    @Override
    void eat() {
        System.out.println("dog : eat");
    }

    // 子类特有的方法
    void bark() {
        System.out.println("dog : bark");
    }
}
// 子类
class Cat extends Animal {
    // 重写eat方法，并接收一个String类型的参数
    @Override
    void eat(String s) {
        System.out.println("cat : eat " + s);
    }

    void meow() {
        System.out.println("cat : meow");
    }
}

public class Java_13 {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象

        a.eat(); // 执行 Animal 类的方法
        b.eat(); //执行 Dog 类的方法

        // 编译时错误，因为b的引用类型Animal没有bark方法
        // b.bark();
        // 所以必须使用对应的子类类型才能调用子类特有的方法
        Dog d = new Dog();
        Cat c = new Cat();
        d.bark();
        c.meow();
    }
}