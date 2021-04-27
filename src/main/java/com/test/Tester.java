package com.test;

public class Tester {
    public static void main(String[] args) {
        Box1 b1 = new Box1();
        Box2 b2 = new Box2();
        Box[] boxes={new Box1(), new Box2()};
        System.out.println(b1.validate(15,10,10));
        System.out.println(b2.validate(15,10,10));
        int length=15;
        int width=10;
        int height=10;
        if(b1.validate(length,width,height)){
            System.out.println("Box1 it is");
        }else if(b2.validate(length,width,height)){
            System.out.println("Box2 it is");
        }
    }
}
