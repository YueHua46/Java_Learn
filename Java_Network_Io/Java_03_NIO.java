
/**
 * Buffer缓冲区的分类
 * 1.本地直接内存缓冲区
 * 2.堆内存缓冲区
 * 每个子抽象类都会有DirectXxxBuffer、HeapXxxBuffer两个具体实现类
 * 这两者的主要区别在于：创建缓冲区的内存是位于堆空间之内还是之外。
 * 直接内存缓冲区的性能会高于堆内存缓冲区（没有经过两次本地内存），但是创建直接内存缓冲区的开销会比较大，同时需要手动释放内存（因为不会触发GC机制）。
 * 如若追求更好的IO性能，或IO数据过于庞大时，可通过xxxBuffer.allocateDirect()方法创建本地缓冲区使用
 * 也可以通过isDirect()方法来判断一个缓冲区是否基于本地内存创建。
 */

import java.nio.ByteBuffer;

public class Java_03_NIO {
  public static void main(String[] args) {
    // 创建DirectBuffer缓冲区
    ByteBuffer buffer = ByteBuffer.allocateDirect(10);

    // 创建HeapBuffer缓冲区
    ByteBuffer buffer2 = ByteBuffer.allocate(10);

    // 判断缓冲区是否基于本地内存创建
    System.out.println(buffer.isDirect()); // true
    System.out.println(buffer2.isDirect()); // false
  }
}
