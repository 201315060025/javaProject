package org.example;

import org.apache.commons.lang3.StringUtils;

import javax.swing.text.Utilities;
import java.io.FilterOutputStream;
import java.util.*;

public class Train {
    public int getMaxGong(int num1, int num2){
        // 获取最大公约数
        int minNumber = num1 > num2? num2: num1;
        for(int a=minNumber; a >= 1; a--){
            if(num1 % a == 0 && num2 % a == 0) {
                return a;
            }
        }
        return 1;
    }

    public int getMinGongBeiShu(int num1, int num2){
        int maxNumber = num1 > num2? num1: num2;
        for(int i=maxNumber; ;i += maxNumber) {
            if (i % num1 == 0 & i % num2 == 0) {
                return i;
            }
        }
    }

    public static ArrayList generateList(int number){
        ArrayList<Integer> coll=new ArrayList<Integer>();
        for(int i=1; i < number; i++) {
            coll.add(i);
        }
        return coll;
    }
    /**
     * @param salary: 用户输入薪资
     * @return: 计算税后工资
     */
    public Double cal_salary(Double salary){
        Double statndSalary = 5000.0;
        Double curSalay = salary - statndSalary;
        Double lastSalay;
        if (curSalay < 0){
            lastSalay = 0.0;
        } else if (300.0 < curSalay & curSalay < 12000.0) {
            lastSalay = 0.03;
        } else if (12000 < curSalay & curSalay <25000) {
            lastSalay = 0.2;
        } else if (25000  < curSalay & curSalay < 35000) {
            lastSalay = 0.25;
        }else {
            lastSalay = 0.35;
        }
        return salary - salary * lastSalay;

    }

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
        //最大公约数和最小公倍数

        int [] num_list = {15, 24, 35};
        Collection<Integer>newList = generateList(10);
        System.out.println(StringUtils.center("数字生成列表", 50, "*"));
        System.out.println(newList);
        System.out.println(newList.toArray().length);
        Train train = new Train();
        int res2 = train.getMaxGong(8,3);
        System.out.println("最大公约数" + res2);
        int res3 = train.getMinGongBeiShu(6, 6);
        System.out.println("最小公倍数" + res3);
        int salary = 20000;
        Double res4 = train.cal_salary(new Double(salary));
        System.out.println("税后工资: " + res4);

        // <editor-fold des="分别通过for循环/While循环/do-While循环写一个死循环">
        // for
        for(int i=0; ; i++){
            System.out.print(i);
            break;
        }
//        while(1 == 1){
//            System.out.print(1);
//        }
        // do while 该怎么写
        // </editor-fold>

        // <editor-fold des="鸡兔共35只,共94只脚,那么鸡和兔各几只?">
        System.out.println("-------");
        int maxJiNumber = 94 / 2;
        for(int i=0; i < maxJiNumber; i++){
            if (i * 2 + (35 - i) * 4 == 94){
                System.out.println("鸡的个数： "+ i +", 图的个数: "+ (35-i));
            }
        }
        // </editor-fold>

    }
}
