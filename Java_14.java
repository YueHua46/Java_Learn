/**
 * 接口和抽象类的主要区别在于：
 * 一个类可以实现多个接口，但只能继承一个抽象类。
 * 接口中的方法默认是public和abstract的，不能有方法体。抽象类中可以有普通方法和抽象方法。
 * 接口不能包含实例变量，只能包含静态和最终变量。抽象类可以包含实例变量。
 */

// 定义一个接口
interface Flyable {
    // 接口中的方法默认是public和abstract的，可以省略这两个修饰符
    void fly();
}

// 定义一个抽象类
abstract class Animal {
    // 抽象方法，没有方法体
    abstract void eat();

    // 普通方法
    void breathe() {
        System.out.println("Animal : breathe");
    }
}

// Bird类继承了Animal类并实现了Flyable接口
class Bird extends Animal implements Flyable {
    // 构造方法
    Bird() {
        super();
    }
    // 实现接口中的方法
    @Override
    public void fly() {
        System.out.println("Bird : fly");
    }

    // 实现抽象类中的方法
    @Override
    void eat() {
        System.out.println("Bird : eat");
    }
}

public class Java_14 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // 输出：Bird : fly
        bird.eat(); // 输出：Bird : eat
        bird.breathe(); // 输出：Animal : breathe
    }
}