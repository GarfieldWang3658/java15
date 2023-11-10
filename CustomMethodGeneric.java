package com.hspedu.generic_;

import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("BMW",100);//メソッドを使用時に
        car.fly(123,100.123);

        Car.Fish<String, ArrayList> fish = new Car.Fish<>();
        fish.hello(new ArrayList<>(),11.2f);


    }
}
//class Bird<T,R,M>{
//    public<E>void fly(E t){
//
//    }

class Car {//ノーマルクラス

    public void run() {//ノーマルメソッド
    }
    //1、<T,R>就是泛型
    //2、是提供给fly方法使用的

    public <T, R> void fly(T t, R r) {//泛型方法
        System.out.println(t.getClass());//String
        System.out.println(r.getClass());//Integer
    }

    static class Fish<T, R> {
        public <U, M> void eat(U u, M m) {//泛型方法
//            System.out.println(u);
//            System.out.println(u.getClass().getSimpleName());
//            return 0;
        }
        //1、下面的hi方法不是泛型方法
        //2、是hi方法使用了类声明的泛型
        public void hi(T t){
        }
        //泛型方法可以使用类声明的泛型，也可以使用后自己声明的泛型。
        public<K> void hello(R r,K k){
            //K来自于泛型方法
            //R来自于泛型类
            System.out.println(r.getClass());//String
            System.out.println(k.getClass());//Integer
        }
    }
}
