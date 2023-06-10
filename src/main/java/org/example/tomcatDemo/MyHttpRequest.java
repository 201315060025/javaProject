package org.example.tomcatDemo;


import java.io.InputStream;

public class MyHttpRequest {
    private InputStream inputstream;
    private String url;

    public String getUrl(){
        return this.url;
    }

    public MyHttpRequest(InputStream inputstream){
        this.inputstream = inputstream;
    }
    public void parse() {
        try {
            byte [] bytes = new byte[1024];
            inputstream.read(bytes);
            System.out.println("----------");
            // 把bytes 类型装成字符串
            String string = new String(bytes);
            System.out.println(string);
            setUrl(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void setUrl(String request){
        int idx1 = request.indexOf(" ");
        int idx2 = request.indexOf(" ", idx1+1);
        String curStr = request.substring(idx1, idx2);
        System.out.println("当前的路径是：" + curStr);
        System.out.println("**********");
        System.out.println(idx1+ " "+ idx2);
        this.url = curStr;
    }

    public static void main(String[] args){

    }
}
