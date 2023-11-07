package com.hspedu.generic_;

public class Generic03 {
    //ジェネリックの具ただい的なデータ型はPerson対象を定義する時に指定されました、
    //つまりジェネリックのデータ型はコンパイル時に決められた。
    public static void main(String[] args) {
        Person<String> person = new Person<>("hspedu");

        /*
        Person类
        class Person<String> {
        String s；
    public Person(String s) {
        this.s = s;
    }
    public String f(){
        return s;
}
}
         */
        Person<Integer> person2 = new Person<Integer>(100);
        /*
        Person类
        class Person<Integer> {
        String s；
    public Person(Integer s) {
        this.s = s;
    }
    public Integer f(){
        return s;
}
}
         */
    }
}
//ジェネリクスの主な役割は、クラスの宣言時に識別子を使用して、
// クラス内の特定の属性の型、または特定のメソッドの戻り値の型、
// またはパラメータの型を表現できることです。
//泛型的作为是：可以在类声明时通过一个标识表示类中某个属性的类型，或者是某个方法的返回的值的类型，或者是参数类型。
class Person<E> {
    E s;
    //Eはsのデータタイプ，そのデータタイプはPerson対象を定義する時に指定され、
    //つまりEのデータ型はコンパイル時に定義された

    public Person(E s) {//Eは引数の型にもなれます
        this.s = s;
    }
public E f(){//リターンのデータ型はEになります。
        return s;
}
}
