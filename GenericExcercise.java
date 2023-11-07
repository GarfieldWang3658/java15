package com.hspedu.generic_;

import java.util.*;

public class GenericExcercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //ジェネリックを使用し、Hashsetに三つの学生のオブジェクトを入れます。
        //HashSet
        //k-》String，v-》Student
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jhon",12));
        students.add(new Student("Tom" ,28));
        students.add(new Student("Marry",19));

        //走査
        for (Student student :students) {
            System.out.println(student);

        }

        //ジェネリックを使用し、HashMapに三つの学生のオブジェクトを入れます。

        HashMap<String, Student> hm = new HashMap<>();
        /*
        public class HashMap<K,V>
         */

        hm.put("Milan",new Student("Milan",38));
        hm.put("smith",new Student("smith",48));
        hm.put("hsp",new Student("hsp",28));

        //イテレータ EntrySet
        /*
        public Set<Mqp.Entry<String,Student>>entrySet(){
        set<Map.Entry<K,V>>es;
        return(es = entrySet)==null?(entry = new EntrySet()):es;}
         */

        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        /*
         public final Iterator<Map.Entry<K,V>> iterator() {
         return new EntryIterator();}
         */
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        System.out.println("=========");
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next =  iterator1.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }


        //ジェネリックを使用すると、下記のコードはエラーが発生します。
        //students.add(100);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            //ジェネリックを使用することで,戻り値の型は指定されたStudentのクラスとメソッドになります。
            Student student =  iterator.next();
            System.out.println(student);
        }
        //HashMap
        HashMap<String, Student> hashMap = new HashMap<>();
        //keysetを使って走査します。
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
