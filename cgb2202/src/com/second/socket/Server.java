package com.second.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 聊天室服务端
 */
public class Server {
    /**
     * java.net.ServerSocket
     * ServerSocket是运行在服务端上的。其主要有两个作用
     * 1：向服务端申请服务端口(客户端Socket就是通过这个端口与服务端建立连接的)
     * 2：监听服务端口，一旦客户端连接会立即创建一个Socket，通过该Socket与客户端交互
     * <p>
     * 如果我们将Socket比喻为“电话”，那么ServiceSocket相当于“总机”
     */
    private ServerSocket serverSocket;  //申请服务端口，并监听来自客户端对此端口的连接，一旦连接就创建Socket与客户端交互

    public Server() {
        try {
                    /*
            ServerSocket在创建的时候要申请一个固定的端口号，客户端才能通过
            这个端口号建立连接
            如果该端口号被当前操作系统中其他程序使用了，那么这里实例化会抛出异常：
            java.BindException:address already in use
            绑定异常：地址被使用了
         */
            System.out.println("正在启动服务端。。。。");
            serverSocket = new ServerSocket(8088); //申请一个固定的端口号
            System.out.println("服务端启动完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        try {
            /*
                ServerSocket的accept方法是一个阻塞方法。
                开始等待客户端的连接，一旦一个客户端通过端口建立连接，
                此时accept方法会立即返回一个Socket实例。通过该实例可以与该客户端进行交互。
                相当于是接电话的动作。
                阻塞方法：调用后，程序就“卡住’不执行了。
             */

            System.out.println("等待客户端连接");
            Socket socket = serverSocket.accept();//接受连接,与该客户端(Socket实例)进行交互
            System.out.println("一个客户端连接了！");


            /*
                通过socket获取的字节输入流读取客户端发送过来的消息（字节流）
             */
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String line;
             /*
                这里的BufferedReader读取时低下连接的流是通过Socket获取的输入流，
                当远端计算机还处于连接状态，但是暂时没有发送内容时，readLine方法会
                处于阻塞状态，直到对方发送过来一行字符串为止。
                如果返回值为null，则表示对方断开了连接。
             */
            while ((line = br.readLine()) != null) {
                System.out.println("客户端说:" + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

}
