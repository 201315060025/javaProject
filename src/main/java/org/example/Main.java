package org.example;
import java.io.*;
import java.lang.annotation.ElementType;

import org.example.Employee;

import javax.swing.text.Element;

class FreshJuice {
    // 声明枚举
    enum FreshLength {SMALL, LARGE, BIG}
    FreshLength size;
}

class Dog {
    // 品种
    String breed;
    // 年龄
    int age;
    // 大小
    int size;
    // 颜色
    String color;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    };

    void eat(){
        System.out.println("具有吃的动作");
    }
    void run(){
        System.out.println("具有跑的动作");
    }
    void sleep(){
        System.out.println("具有跑的动作");
    }

}

// 构造方法
//public class Puppy{
//    public Puppy(){
//    }
//
//    public Puppy(String name){
//        // 这个构造器仅有一个参数：name
//    }
//}

public class Main {
    public static void main(String[] args) {
        // 枚举
        FreshJuice fresh = new FreshJuice();
        fresh.size = FreshJuice.FreshLength.BIG;

        System.out.println(fresh);
        System.out.println("hello world");
        // 面向对象练习
        Dog dg1 = new Dog();
        dg1.setAge(12);
        System.out.println("当前狗狗年龄: "+ dg1.getAge());

        System.out.println("\n");
        System.out.println("当前输入学员的信息 ");

        Employee em1 = new Employee("t1");
        em1.empAge(12);
        em1.empSalary(12.0);
        System.out.println("当前雇员的年龄: "+ em1.age);

        // 基本数据类型
        System.out.println("整型数据大小： "+ Integer.SIZE);
        System.out.println("整形的Integer");
        System.out.println("最大值： "+ Integer.MAX_VALUE);
        System.out.println("最小值； "+ Integer.MIN_VALUE);

        // 局部变量
        int age = 0;
        age = age + 7;
        System.out.println("小狗年龄是"+age);


    }
}