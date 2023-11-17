package Java_Io;

/**
 * Channel通道
 * 通道是用于在buffer和数据源之间进行传输的，其本身不存储数据，因此需要配合缓冲区进行传输
 * NIO中的通道与BIO中的流对象类似，但BIO中要么是输入流，要么是输出流，通常流操作都是单向传输的。
 * 而通道的功能也是用于传输数据，但它却是一个双向通道，代表着我们即可以从通道中读取对端数据，也可以使用通道向对端发送数据。
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Java_04_NIO_Server {
  public static void main(String[] args) throws IOException {
    // channel是一个接口，其主要提供了如下几个实现类：
    // FileChannel、DatagramChannel、SocketChannel、ServerSocketChannel
    // 其中 FileChannel 用于本地文件中的数据传输
    // DatagramChannel 用于网络IO中UDP数据传输
    // SocketChannel 和 ServerSocketChannel 用于网络IO中TCP数据传输
    // 实现Channel接口的都是抽象类，最终具体的功能则是这些抽象类的实现类 xxxChannelImpl 去完成的
    // 所以Channel通道在Java中是三层定义：顶级接口→二级抽象类→三级实现类。
    // 类似于ServerSocketChannel这些channel实现类，它们只负责管理客户端连接，并不负责数据传输，这与BIO的socket有些许不同

    // 1.NIO服务端打开一个ServerSocketChannel通道
    ServerSocketChannel ssc = ServerSocketChannel.open();

    // 2.绑定端口
    // InetSocketAddress的作用是封装端口号和IP地址，其中IP地址可以不指定，如果不指定IP地址，则默认为本机地址
    // 其构造函数可以接收两个参数，分别是主机名和端口号
    ssc.bind(new InetSocketAddress("127.0.0.1", 8888));

    // 3.监听客户端连接
    while (true) {
      SocketChannel sc = ssc.accept();

      if (sc != null) {
        // 处理客户端连接...

        // getLocalAddress() 获取本地地址
        System.out.println(sc.getLocalAddress());

        // getRemoteAddress() 获取远程地址
        System.out.println(sc.getRemoteAddress());

        // 设置为非阻塞模式
        // 通道默认是阻塞模式，如果要使用非阻塞模式，则需要调用configureBlocking(false)方法
        // 非阻塞模式下，如果没有数据传输，则read()方法会立即返回0，而不是一直等待
        sc.configureBlocking(false);

        // 4.获取通道数据
        // 4.1.创建缓冲区
        ByteBuffer[] bbs = new ByteBuffer[12];
        for (int i = 0; i < bbs.length; i++) {
          bbs[i] = ByteBuffer.allocate(1024);
        }
        // 4.2.从通道获取数据
        // 散射读（Scattering Reads）。散射读是指数据从一个通道读取到多个缓冲区
        sc.read(bbs, 0, bbs.length);
        // 4.3.输出通道数据
        for (ByteBuffer b : bbs) {
          System.out.println(new String(b.array()));
        }

        // 5.向通道写入数据
        // 5.1.创建缓冲区
        ByteBuffer b = ByteBuffer.allocate(1024);
        // 5.2.向缓冲区写入数据
        b.put("I am server".getBytes());
        // 5.3.将缓冲区的写模式切换为读模式
        b.flip();
        // 5.4.将缓冲区的数据写入通道
        sc.write(b);

        // 6.关闭通道
        // sc.close();

        // 7.关闭服务端通道
        // ssc.close();
      }
    }

  }
}
