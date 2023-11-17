package Java_Network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Java_01_Socket_Server {

  public static void main(String[] args) throws IOException {
    // Socket套接字是通过TCP协议进行通信的一种机制
    // Socket套接字通过三个参数来确定一个连接：IP地址、端口号、传输协议
    // 1.创建Socket对象
    ServerSocket server = new ServerSocket();

    // 2.绑定端口号
    server.bind(new InetSocketAddress("127.0.0.1", 8888));
    System.out.println("服务端启动中...");
    // 3.得到连接，程序进入到阻塞状态（Socket是client的实例）
    Socket client = server.accept();

    // 通过PrintStream传递client的输出流，可以实例化出打印流对象，通过该对象可以直接将数据发送到client
    PrintStream ps = new PrintStream(client.getOutputStream());
    // 通过PrintStream对象将数据发送到client
    ps.println("Hello, Client");

    // 关闭客户端连接
    client.close();
    // 关闭服务端连接
    server.close();

    System.out.println("服务端已向客户端发送信息，退出。");
  }
}
