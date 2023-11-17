package Java_Io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class Java_01_BIO_Client {
  public static void main(String args[]) throws IOException {
    System.out.println("BIO客户端启动");

    // 1.创建socket对象请求服务端的连接
    Socket socket = new Socket("127.0.0.1", 8888);

    // 2.从socket对象中获取字节输出流，并封装成输出对象
    OutputStream os = socket.getOutputStream();
    PrintStream ps = new PrintStream(os);

    // 3.通过输出对象往服务端发送信息
    ps.println("I am BIO Client!!!");

    // 4.通过下述方法告诉服务端已经完成发送，接下来只接收消息
    socket.shutdownOutput();

    // 5.从套接字中获取字节输入流，并封装成输入流对象
    InputStream is = socket.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    // 6.通过输入对象从Buffer中读取信息
    String msg;

    while ((msg = br.readLine()) != null) {
      System.out.println("收到服务端的消息：" + msg);
    }

    // 7.发送后清空输出流中的信息
    ps.flush();

    // 8.使用完成后关闭流对象与套接字
    ps.close();
    os.close();
    br.close();
    is.close();
    socket.close();
  }
}
