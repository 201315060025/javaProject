package org.example.tomcatDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyHttpResponse {
    private OutputStream outputStream;
    public MyHttpResponse(OutputStream outputStream){
        this.outputStream = outputStream;
    }
    public void response(String url) throws IOException {
        String rootDir = System.getProperty("user.dir");
        String htmlDir = rootDir + "/webContext" + url;
        System.out.println(htmlDir);
        File file = new File(htmlDir);
        if(file.exists()){
            System.out.println("exist");
            FileInputStream fileinputStream = new FileInputStream(file);
            byte [] bytes = new byte[(int)file.length()];
            fileinputStream.read(bytes);
            String st = new String(bytes);

            this.outputStream.write(getMessage("200", st).getBytes());
        }else{

            this.outputStream.write(getMessage("404", "file not exist").getBytes());
//            System.out.println("not exists");
        }



        // 响应函数的主要作用就是判断资源是不是存在
        // 如果纯在

        // 如果不存在？


    }

    public String getMessage(String code, String message){
        String tmpMessage = "HTTP/1.1 " + code +"\r\n"
                +"Content-type: " + "text/html\r\n"
                +"Content-length: " + message.length()
                + "\r\n"
                + "\r\n"
                + message;
        // System.out.println(tmpMessage);
        return tmpMessage;
    }

    public static void main(String[] args) {
        // 获取系统工程路径
        System.out.println(System.getProperty("user.dir"));
    }
}
