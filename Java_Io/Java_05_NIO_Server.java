package Java_Io;

/**
 * 结合Selector实现NIO服务器
 * NIO在结合Selector后可实现：
 * 1.单线程管理多个通道
 * 2.非阻塞式的管理通道（需要通道为非阻塞模式）
 * 3.事件驱动的管理通道
 */

import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Java_05_NIO_Server {
  public static void main(String[] args) throws IOException {
    System.out.println("NIO Server is running...");
    // 1.创建服务端通道、连接器与字节缓冲区（用于读取数据）
    ServerSocketChannel ssc = ServerSocketChannel.open();
    Selector selector = Selector.open();
    ByteBuffer buffer = ByteBuffer.allocate(1024);

    // 绑定ip和端口
    ssc.bind(new InetSocketAddress("127.0.0.1", 8888));

    // 2.设置服务端通道为非阻塞模式，因为Selector只能管理非阻塞模式的通道
    ssc.configureBlocking(false);

    // 3.将服务端通道注册到选择器上，监听连接事件
    ssc.register(selector, SelectionKey.OP_ACCEPT);

    // 4.通过选择器轮询监听所有已就绪的事件（已经就绪的事件可能是连接事件、读事件、写事件）
    // select()方法返回值为已就绪的事件数量
    while (selector.select() > 0) {
      // 5.获取当前选择器中所有注册的已就绪的监听事件
      // Iterator是一个迭代器，用于遍历集合中的元素，其泛型参数为集合中元素的类型
      Iterator<SelectionKey> it = selector.selectedKeys().iterator();

      // 6.遍历所有已就绪的事件
      // 迭代器的hasNext()方法用于判断是否还有下一个元素
      while (it.hasNext()) {
        SelectionKey key = it.next();

        // 7.如果是接收事件就绪，则获取对应客户端的连接
        // isAcceptable()方法用于判断是否是接收事件就绪
        if (key.isAcceptable()) {
          // 8.获取客户端连接
          SocketChannel channel = ssc.accept();

          // 9.将获取到的客户端连接设置为非阻塞模式
          channel.configureBlocking(false);

          // 10.将客户端连接注册到选择器上，监听读事件
          int event = SelectionKey.OP_READ | SelectionKey.OP_WRITE;
          channel.register(selector, event);
          System.out.println("客户端连接成功：" + channel.getRemoteAddress());
        } else if (key.isReadable()) {
          // 11.如果是读事件就绪，则读取客户端发送的数据
          // isReadable()方法用于判断是否是读事件就绪
          SocketChannel channel = (SocketChannel) key.channel();
          int len = -1;
          while ((len = channel.read(buffer)) > 0) {
            buffer.flip();
            System.out.println("收到信息：" + new String(buffer.array(), 0, len));
          }
          buffer.clear();
        }
      }
      // 12.将已经处理后的事件从选择器上移除（选择器不会自动移除）
      it.remove();
    }
  }
}
