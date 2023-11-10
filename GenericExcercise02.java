package com.hspedu.generic_;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExcercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",5000,new MyDate(1991,11,01)));
        employees.add(new Employee("tom",7000,new MyDate(1993,8,25)));
        employees.add(new Employee("tom",8000,new MyDate(1988,6,25)));

        System.out.println(employees);

        System.out.println("===順番===");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //按照name排序，如果那么相同，就按照生日日期先后排序
                //先对传入的参数进行验证
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
                //
                //封装后的可维护性和复用性大大增强
                return emp1.getBirthday().compareTo(emp2.getBirthday());
                //如果name 相同，就比较 birthday-year
                //最好把Birthday的比较放到Myadate中
//                int yearMinus = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
//                if (yearMinus !=0){
//                    return yearMinus;
//                }
//                //如果year相同，就比较month
//                int monthMinus = emp1.getBirthday().getMonth() - emp2.getBirthday().getMonth();
//                if (monthMinus !=0){
//                    return monthMinus;
//                }
//                return emp1.getBirthday().getDay()-emp2.getBirthday().getDay();
            }
        });
        System.out.println("===排序后===");
        System.out.println(employees);





    }
}
class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\n名前：" + name + "\t給料：" + sal + birthday;
    }
}
class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "\t生年月日:" + year + "-" + month + "-" + day;
    }

    @Override
    public int compareTo(MyDate o) {//把对年月日的比较放这里
        int yearMinus = year -o.getYear();
        if (yearMinus !=0){
            return yearMinus;
        }
        int monthMinus = month - o.getMonth();
        if (monthMinus !=0){
            return monthMinus;
        }
        return day-o.getDay();
    }
}