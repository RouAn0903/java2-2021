package com.test;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes={new Box1(), new Box2(), new Box3(), new Box4(), new Box5()};

        int length=15;
        int width=10;
        int height=10;

        for (Box box:boxes) {
           for(box.validate(length, width, height)){
               System.out.println(box.name+" it is");
               break;
           }
        }
        /*
        if(b1.validate(length,width,height)){
            System.out.println("Box1 it is");
        }else if(b2.validate(length,width,height)){
            System.out.println("Box2 it is");
        }
         */
    }
}
