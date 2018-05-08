package com.thread;

/**
 * Created by ck140 on 2018/4/4.
 *
 */
public class Danli {
    public static void main(String[] args){
        JvmDemo01 j1=JvmDemo01.getInstance();
        JvmDemo01 j2=JvmDemo01.getInstance();
        System.out.println(j1+"==="+j2);
        JvmDemo02 j3=JvmDemo02.getInstance();
        JvmDemo02 j4=JvmDemo02.getInstance();
        System.out.println(j3+"==="+j4);
        JvmDemo03 j5=JvmDemo03.getInstance();
        JvmDemo03 j6=JvmDemo03.getInstance();
        System.out.println(j5+"==="+j6);

        System.out.println(JvmDemo04.INSTANCE+"===="+JvmDemo04.INSTANCE);

    }
}

/**
 * 懒汉式单例模式
 */
class JvmDemo01{
    private volatile static JvmDemo01 instance = null;

    private JvmDemo01(){

    }

    public static JvmDemo01 getInstance(){
        if(null==instance){
            synchronized (JvmDemo01.class){
                if(null==instance){
                    instance = new JvmDemo01();
                }
            }
        }
        return instance;
    }
}
/**
 * 饿汉式单例模式
 *双层检测锁
 */

class JvmDemo02{
    private static JvmDemo02 instance = new JvmDemo02();
    private JvmDemo02(){
        //防止反射破解单例模式
        if(instance!=null){
            throw new RuntimeException();
        }

    }
    public static JvmDemo02 getInstance(){
        return instance;
    }
}

/**
 * 静态内部类模式
 */
class JvmDemo03{
    private static class JvmDemo03Instance{
        private static JvmDemo03 instance = new JvmDemo03();
    }

    private JvmDemo03(){

    }
    public static JvmDemo03 getInstance(){
        return JvmDemo03Instance.instance;
    }
}

/**
 *
 * 枚举单例
 */
enum JvmDemo04{
    INSTANCE;
    public void function(){

    }
}
