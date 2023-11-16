// 父类
class Animal {
    void eat() {
        System.out.println("animal : eat");
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
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("cat : eat");
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