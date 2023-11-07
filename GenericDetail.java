package com.hspedu.generic_;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //ジェネリックに指定するデータ型は引用型でなければなりません、
        // 基本データ型を指定する事はできません。
        List<Integer> list = new ArrayList<Integer>();//Integerは引用型
        //List<Int>list2 = new ArrayList<int>();//int　は基本データ型
        //2、说明
        //EはAのデータ型を指定しました、コンストラクタ
        //E指定了A类型，构造器传入了newA()
        //ジェネリックに具体的なデータ型を指定後、
        //該当のデータクラスもしくはその子クラスを導入する事は可能です。
        Pig<Animal> aPig = new Pig<Animal>(new Animal());
        Pig<Animal> aPig2 = new Pig<Animal>(new B());
        ArrayList arrayList = new ArrayList();

        List<Integer> list2 = new ArrayList<Integer>();
        //実際使用する時は簡略化します
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        //もし：List list = new ArrayList();
        //初期の<E>のデータ型はObject
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("XX");
        /*
        public boolean add(Object e) {
        modCount++;
        add(e, elementData, size);
        return true;
         */
        //->等价->
        // ArrayList<Object> arrayList1 = new ArrayList<>()；

        Tiger tiger = new Tiger();
/*
        class Tiger{
            Objecet e;
            public Tiger(){}
            public Tiger(Object e){
                        this.e = e;
              }
        }

 */

    }
}
class Animal{}
class B extends Animal{}
class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }
}
class Tiger<E>{
    E e;
    public Tiger(){}
    public Tiger(E e){
        this.e = e;

}}
