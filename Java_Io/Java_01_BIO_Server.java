package Java_Io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Java网络编程 I/O
 * Java支持的3种IO模型
 * 1.Java-BIO(同步阻塞IO)
 * 2.Java-NIO(同步非阻塞IO)
 * 3.Java-AIO(异步非阻塞IO)
 */

// 1.Java-BIO使用案例

// BIO服务端
public class Java_01_BIO_Server {
  public static void main(String[] args) throws IOException {
    System.out.println("BIO服务端启动...");

    // 1.定义一个ServerSocket对象用于监听客户端的连接请求
    ServerSocket ss = new ServerSocket(8888);

    // 2.监听客户端的连接请求
    Socket socket = ss.accept();

    // 3.从套接字中得到字节输入流并封装成输入流对象
    InputStream is = socket.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    // 4.从Buffer中读取信息，如果读到信息则输出
    String msg;
    while ((msg = br.readLine()) != null) {
      System.out.println("收到客户端的消息：" + msg);
    }

    // 5.从套接字中得到字节输出流并封装成输出流对象
    OutputStream os = socket.getOutputStream();
    PrintStream ps = new PrintStream(os);

    // 6.通过输出对象往服务端传递信息
    ps.println("Hi, I am BIO Server!!!");

    // 7.发送完后清空输出流中的信息
    ps.flush();

    // 8.使用完成后关闭流对象与套接字
    ps.close();
    os.close();
    br.close();
    is.close();
    socket.close();
    ss.close();
  }
}
