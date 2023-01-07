package org.example;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.xml.stream.FactoryConfigurationError;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.concurrent.Flow;

class CalHeight{
    public Double calSonHeight(Double fatherHeight, Double motherHeight){
        Double height = new Double((fatherHeight + motherHeight) * 1.08 + 2);
        return height;
    }

    public float calDaughterHeight(Float fatherHeight, Float motherHeight) {
        Float height = new Float((fatherHeight + motherHeight) * 1.08 + 2);
        return height;
    }
}

class Bank{
    public Double calIncomeInBank(Integer years, Double money){
        Double incomeBank = years * money * 1.2;
        return incomeBank;
    }
    public Integer rankTest(Integer number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return rankTest(number - 1) + rankTest(number - 2);

    }
}

//class listOption {
//    public void Add(Integer number, Aarray result) {
//
//    }
//
//}


public class Pubby {
    public void PubbyAge(){
        int age = 0;
        age = age + 1;
        System.out.println("年龄"+ age);
    }
    public void foreachArray(int [] ListA){
        for(var i=0; i<ListA.length; i++){
            System.out.print(ListA[i] + " ");
        }
    }



    public static void main(String[] args){
        Pubby test = new Pubby();
        test.PubbyAge();
        String fs;
        Integer intVar = 10;

        Double floatVar = 1.2;
        String name = "blx";
        fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s", floatVar, intVar, name);
        System.out.println(fs);

        // 字符串创建
        StringBuilder sb1 = new StringBuilder(3);
        sb1.append("我是");
        sb1.append("中国");
        sb1.append("人");
        sb1.append(5);
        sb1.append(5);
        System.out.println(sb1);

        // 计算数组的综合
        Double [] b1 = new Double[3];
        b1[0] = 1.2;
        b1[1] = 1.12;
        b1[2] = 1.12;
        double sumRes = 0.0;
        for(var i = 0; i < b1.length; i++){
            sumRes += b1[i];
        }
        System.out.println("多个数的和是：" + sumRes);

        // 计算两个数的加减乘除
        Integer a = new Integer(10);
        Integer b = new Integer(20);
        Integer sum = a + b;
        Integer ji = a * b;
        Float shang = a.floatValue() / b;

        System.out.println("输出两个数的和: " + sum.toString());
        System.out.println("输出两个数的⬆商: " + shang.toString());
        System.out.println("输出子女身高");
        CalHeight heightObj = new CalHeight();

//        Flow res1 = heightObj.calSonHeight(1.67, 1.60);
        Double res1 = heightObj.calSonHeight(1.67, 1.60);
        System.out.println("儿子升高是： " + res1.toString());

        // 银行收入计算
        Bank bk = new Bank();
        Double res  = bk.calIncomeInBank(10, 1000.12);

        System.out.println("结果值是" + res.toString() + "元");

        System.out.println("递归");
        Integer aa = bk.rankTest(0);
        System.out.println(aa.toString());
        /*
        * 字符串转列表
        * */
       String st1 = "hello world";
       char [] stList = st1.toCharArray();

       System.out.println(stList);
       for (int i = 0; i < stList.length; i++) {
            System.out.println(stList[i]);    // 输出1 2 3 a b c
       }

        // <editor-fold des ="列表转字符串">
        char[] l1 = { '1', '2', '3' };
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String s2 = new String(l1);
        System.out.println(s2);
        // </editor-fold>

        // <editor-fold des="字符串反转">
        String s1 = "hello world";
        System.out.println("初始值：" + s1);
        char [] s1List2 = s1.toCharArray();
        char [] newS1List = new char[stList.length];
        for(int i=0; i < s1List2.length; i++) {
            newS1List[s1List2.length-i-1] = s1List2[i];
        }
        String res2 = new String(newS1List);
        System.out.println("翻转后的值：" + res2);
        // </editor-fold>

        // <editor-fold des="java中倒入新包测试">

        String st3 = StringUtils.abbreviate("abcdefg", 6);
        System.out.println(st3);
        // 1： 字符串以某一个东西做后缀， 如果没有直接添加，如果有就忽略
        String t1 = StringUtils.appendIfMissing("hello worldBLX", "blx");
        System.out.println(t1);

        String t2 = StringUtils.appendIfMissingIgnoreCase("12 hello worldBLX", "blx");
        System.out.println(t2);
        // 2: 首字母大小写转换
        String t3 = StringUtils.capitalize("cat");
        String t4 = StringUtils.uncapitalize("Dog");
        System.out.println("cat 小写转大写："+ t3 + " Dog 大写转小写： " + t4);

        System.out.println(StringUtils.center("abc", 100, "*"));

        System.out.println(StringUtils.contains("ablx", "abc"));
        // 重复字符串
        String repeatStr = StringUtils.repeat("*", 5);
        System.out.println(repeatStr);

        Map map = ArrayUtils.toMap(new String[][] {
                { "RED", "#FF0000" }, { "GREEN", "#00FF00" }, { "BLUE", "#0000FF" } });
        System.out.println(map);
        // </editor-fold >

        String[] str = { "1", "2", "a", "b" };
        // 将数组变成字符串
        System.out.println(StringUtils.join(str));
        // 将数组用逗号分隔变成字符串
        System.out.println(StringUtils.join(str, ","));


    }
}
