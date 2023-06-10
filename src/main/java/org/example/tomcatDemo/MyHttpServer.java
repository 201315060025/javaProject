package org.example.tomcatDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyHttpServer {
    // 端口 -- 服务器启动的端口
    private  int port = 8001;
    // 定义接受请求方法
    public void receiving(){
        try {
            // 接受浏览器发送的请求
            // 1: 创建 sockerserver 服务
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket);
                InputStream inputStream = socket.getInputStream();
                System.out.println(inputStream);
                // 解析请求
                MyHttpRequest myHttpRequest = new MyHttpRequest(inputStream);
                myHttpRequest.parse();
                // 创建 输出流和响应
                OutputStream outputStream = socket.getOutputStream();
                String url = myHttpRequest.getUrl();

            }
        } catch(Exception e) {
            e.printStackTrace();

        }

    }
    // 定义和一个响应的方法
    public void response() {

    }

}