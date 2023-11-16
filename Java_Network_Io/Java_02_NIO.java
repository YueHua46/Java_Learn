/**
 * Java-NIO是基于多路复用模型实现的，其中存在三大核心理念：
 * Buffer（缓冲区）、Channel（通道）、Selector（选择器）
 * 与BIO还有一点不同在于：由于BIO模型中数据传输是阻塞式的，因此必须得有一条线程维护对应的Socket连接
 * 在此期间如若未读取到数据，该线程就会一直阻塞下去
 * 而NIO中则可以用一条线程来处理多个Socket连接，不需要为每个连接都创建一条对应的线程维护。
 */

import java.nio.ByteBuffer;

class Java_02_NIO {
    public static void main(String[] args) {
        // 当需要使用缓冲区时，都是通过对应Buffer类实例的allocate()方法来创建的
        // 该方法接收一个int类型的参数，用于指定缓冲区的容量大小
        // 如：
        ByteBuffer buffer = ByteBuffer.allocate(20);
        
        // 使用buffer的基本方法
        // 1. put()方法
        // 该方法用于向缓冲区中写入数据，其有多个重载方法，如：
        // put(byte b)、put(byte[] src)、put(byte[] src, int offset, int length)
        // 其中offset表示从数组的第几个元素开始读取，length表示写入的元素个数
        buffer.put((byte) 1);
        buffer.put(new byte[]{1,2,3,4,5,6,7,8,9,10});
        // 2. get()方法
        // 该方法用于从缓冲区中读取数据，其有多个重载方法，如：
        // get()、get(byte[] dst)、get(byte[] dst, int offset, int length)
        // dst是用于存放读取数据的数组，offset表示从数组的第几个元素开始写入，length表示写入的元素个数
        byte[] dst = new byte[2];
        buffer.get(dst,0,dst.length);

        System.out.println("position : " + buffer.position());
        System.out.println("limit : " + buffer.limit());
        System.out.println("capacity : " + buffer.capacity());
        
        // 遍历缓冲区中的数据
        // 1. rewind()方法
        // 该方法用于将position置为0，limit不变
        buffer.rewind();
        // 2. hasRemaining()方法
        // 该方法用于判断是否还有剩余元素
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
        buffer.rewind();

        System.out.println("position : " + buffer.position());
        System.out.println("limit : " + buffer.limit());
        System.out.println("capacity : " + buffer.capacity());

        for (byte b : dst) {
            System.out.println("b :" + b);
        }
    }
}