package com.ro;

import com.ro.stu.Student;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        //Student st = new Student("1101","Eric", 60,80);\
        //st.print();
        Student[] sts = new Student[]{
            new Student("1101","Eric", 60,80),
                new Student("1102","Tomy", 60,80),
                new Student("1103","Roro", 60,80),
                new Student("1104","Alice", 60,80)
        };
        for (int i = 0; i < sts.length ; i++) {
            sts[i].print();
        }
    }
}
