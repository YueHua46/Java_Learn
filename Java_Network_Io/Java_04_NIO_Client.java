import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Java_04_NIO_Client {
  public static void main(String[] args) throws IOException {
    // NIO客户端

    // 1.打开一个SocketChannel通道
    SocketChannel sc = SocketChannel.open();

    // 2.连接到服务端
    // 与ServerSocketChannel不同的是，SocketChannel是一个连接到TCP网络套接字的通道
    // 因此，我们需要调用connect()方法来连接到服务端
    // 该方法接收一个SocketAddress参数，该参数封装了服务端的IP地址和端口号
    // 该方法会阻塞，直到连接成功或者发生异常
    sc.connect(new InetSocketAddress("127.0.0.1", 8888));

    // 3.向通道写入数据
    // 3.1.创建缓冲区
    ByteBuffer buffer = ByteBuffer.allocate(1024);
    // 3.2.将数据写入缓冲区
    buffer.put("Hello, Server".getBytes());
    // 3.3.将缓冲区的数据写入通道
    buffer.flip();
    sc.write(buffer);

    // 4.从通道读取数据
    ByteBuffer[] bbs = new ByteBuffer[12];
    for (int i = 0; i < bbs.length; i++) {
      bbs[i] = ByteBuffer.allocate(1024);
    }
    sc.read(bbs, 0, bbs.length);
    // 输出通道数据
    for (ByteBuffer b : bbs) {
      System.out.println(new String(b.array()));
    }

    // 5.关闭通道
    sc.close();
  }
}
