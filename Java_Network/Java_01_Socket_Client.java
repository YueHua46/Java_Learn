package Java_Network;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Java_01_Socket_Client {
  public static void main(String[] args) {
    // 1.创建一个和ServerSocket的连接
    try (Socket socket = new Socket("127.0.0.1", 8888)) {
      // 2.获取输入流
      InputStreamReader isp = new InputStreamReader(socket.getInputStream());
      // 3.创建一个buffer用来储存输入流数据
      char[] buffer = new char[1024];
      isp.read(buffer, 0, buffer.length);

      System.out.println("接收到服务端的数据：" + new String(buffer));

    } catch (IOException e) {
      // TODO: handle exception
      e.printStackTrace();
    }

  }
}
