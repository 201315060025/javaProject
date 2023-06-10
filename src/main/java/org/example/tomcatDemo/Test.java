package org.example.tomcatDemo;

import org.example.tomcatDemo.MyHttpServer;

public class Test {
    public static void main(String[] args){
        System.out.println("server is string");
        MyHttpServer httpServer = new MyHttpServer();
        httpServer.receiving();
    }
}