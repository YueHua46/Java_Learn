package Java_Io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Java_05_NIO_Client {
  public static void main(String[] args) {
    // 1. 打开SocketChannel
    try (SocketChannel sc = SocketChannel.open()) {
      // 2. 连接到服务器
      sc.connect(new InetSocketAddress("127.0.0.1", 8888));

      // 3. 创建ByteBuffer
      ByteBuffer bb = ByteBuffer.allocate(1024);

      // 4. 将数据写入到ByteBuffer
      bb.put("Hello, Server!".getBytes());

      // 5. 切换ByteBuffer为读模式
      bb.flip();

      // 6. 将ByteBuffer的数据写入到SocketChannel，发送到服务器
      sc.write(bb);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}