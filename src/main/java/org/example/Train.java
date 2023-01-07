package org.example;

import org.apache.commons.lang3.StringUtils;

import javax.swing.text.Utilities;
import java.io.FilterOutputStream;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        System.out.println("单元测试");
        while (true) {
            System.out.println("请输入数字星期几：");
            // int days = new Scanner(System.in).nextInt();
            int days = 1;
            StringUtils.contains("星期：", days);
            System.out.println(days);
            if (days == 1) {
                System.out.println("今天星期一" );
            } else if (days == 2) {
                System.out.println("今天星期二" );
            } else {
                System.out.println("其他" );
            }
            break;
        }

        // 小明买手机那种方式比较划算
        System.out.println(StringUtils.center("小明买手机那种方式比较划算", 100, "*"));
        int sourcePrice = 8888, secondPrice = 1880;
        Double zheKou = 0.75, res = sourcePrice * (1- zheKou);
        if (res > sourcePrice) {
            System.out.println("适合打折");
        } else {
            System.out.println("适合卖二手");
        }
        System.out.println("结果是：" + res);

        /*
        * 绝对值是指一个数在数轴上所对应点到原点的距离，
        * 用“| |”来表示。负数的绝对值是他去掉负号以后的值，
        * 而非负数（0和正数）的绝对值是他本身。请定义一个方法，接收用户输入的数字，输出绝对值结果。
        * */
        StringUtils.center("绝对值", 50, "*");
        // int number = new Scanner(System.in).nextInt();
        int number = 12;
        if (number > 0) {
            System.out.println(number);
        } else {
            System.out.println(-number);
        }
        StringUtils.center("手机选号:根据用户输入的手机号来确认用户实际支付的价格", 10, "*");
        int lastNumber = 10;
        Double money;

        if (lastNumber == 8) {
            money = 50.0;
        } else if (lastNumber == 4) {
            money = 30.0;
        } else {
            money = 10.0;
        }
        System.out.println("需支付办卡费用 "+  money.toString() +" 元");

        System.out.println(StringUtils.center("输出邮箱名称", 50, "*"));

        String email = "1392133@aqq.com";
        // 先判断是否存在
        if (email.indexOf("@") == -1) {
            System.out.println("输入邮箱错误");
        } else {
            String [] emailList = StringUtils.split(email, "@");
            System.out.println(StringUtils.join(emailList, ","));
        }




    }
}
