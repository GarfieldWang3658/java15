package com.hspedu.generic_;

public class CustomGenericExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Tiger_<Double,String,Integer> g = new Tiger_<>("jhon");
        g.setT(10.9);//T
        //g.setT("yy");//F クラス違い
        System.out.println(g);
        Tiger_ g2 = new Tiger_("jhon~~~");//T T=Object,R=Object,M=Object
        g2.setT("yy");//T=Object "yy"=String StringはObjectの子クラス
        System.out.println(g2);

    }
}
class Tiger_<T,R,M>{
    String name;
    R r;//プロパティにジェネリックを使用可
    M m;
    T t;
    public Tiger_(String name) {
        this.name = name;
    }
    public Tiger_(String name, R r, M m, T t) {//コンストラクタにジェネリックを使用可
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

