# java 学习
## 2023-01-06
### java 比较使用的工具
    StringUnits包
        1. 首先明白倒入方法， 直接在pom.xml中添加即可。和python 导包方式不一样
        2. 常用方法
            a. 匹配结尾后缀
            b. 字符串首字母大小写转换
            b. 字符串扩充至指定大小且居中
            c. 判断一字符串是否包含另一字符串
            d. 计一字符串在另一字符串中出现次数
            e. 删除字符串中的梭有空格
            f. 比较两字符串，返回不同之处。确切的说是返回第二个参数中与第一个参数所不同的字符串
            g. ....
            h. 参考地址：参考地址： https://www.cnblogs.com/zknublx/p/17031245.html
    

## 2023-06-12
## java 文件基本操作
    tomcat demo的实现案例方法：
        前提： 使用了socket, io
        思路：
            1. 启动server ，循环接受浏览器请求
            2. 接受接收浏览器请求， 并且解析url
            3. 判断目标资源是否存在
            4. 如果存在就返回
    使用文件类FIle， 创建文件路径，声明文件类
    1. 文件是否存在  file.exists()
    文件读写操作：
    1.  读取文件传操作FileInputStream 参数传入文件对象file
    2.  二进制读取， byte [] bytes = new byte[(int)file.length()]
    3: fileInputStream.read(bytes)
    4: 二进制转string, String st = new String(bytes)

