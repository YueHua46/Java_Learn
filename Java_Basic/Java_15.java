package Java_Basic;
// 导入java.util包，它包含了Java的集合框架，以及日期和时间类、随机数生成器等实用工具类
import java.util.*;

/**
 * Java集合框架的主要特点：
 * 1. Java集合框架提供了一套用于处理数据的类和接口。
 * 2. 集合框架定义了几种类型的集合，包括List、Set和Map。List是有序的集合，Set是唯一元素的集合，Map是键值对的集合。
 * 3. 集合框架中的类和接口都在java.util包中。
 * 4. 集合框架提供了一些用于操作集合的算法，如排序和搜索。
 */

public class Java_15 {
    public static void main(String[] args) {
        // 创建一个ArrayList，它是List接口的一个实现
        // ArrayList是一个列表，它可以存储有序的元素
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list); // 输出：[Apple, Banana, Cherry]

        // 创建一个HashSet，它是Set接口的一个实现
        // HashSet是一个集合，它只存储唯一的元素
        /**
         * Integer是Java中的一个包装类，用于封装基本数据类型int的数据。
         * Java为每个基本数据类型都提供了一个预定义的类，这些类被称为包装类（Wrapper Class）。
         * Integer类就是int数据类型的包装类。
         * Integer包装类和Int的区别在于，Integer是一个类，而int是一个基本数据类型。
         * 所以因为Integer是一个类，所以它可以调用类的方法，而int是一个基本数据类型，它不能调用方法。（这点和js中的Number和number是一样的）
         * 例如，Integer类有一个方法叫做parseInt()，它可以将字符串转换为整数，而int没有这个方法。
         */

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println(set); // 输出：[20, 10]，因为value是唯一的，所以重复的10被去掉了

        // 创建一个HashMap，它是Map接口的一个实现
        // HashMap是一个映射，它存储键值对
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        System.out.println(map); // 输出：{Alice=25, Bob=30, Charlie=35}
    }
}