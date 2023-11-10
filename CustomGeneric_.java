package com.hspedu.generic_;

public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}

class Tiger＿<T,R,M>{
    String name;
    R r;//プロパティにジェネリックを使用可
    M m;
    T t;

    public Tiger＿(String name, R r, M m, T t) {//コンストラクタにジェネリックを使用可
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }


    //メソッドにジェネリックを使用可

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {//戻り値にジェネリックを使用可
        return r;
    }

    public void setR(R r) {//メソッドにジェネリックを使用可
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
