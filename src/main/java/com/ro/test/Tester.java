package com.ro.test;

public class Tester {
    public static void main(String[] args) {

        Box[] boxes = new Box[5];
        boxes[0]= new Box1();
        boxes[1]= new Box2();
        boxes[2]= new Box3();
        boxes[3]= new Box4();
        boxes[4]= new Box5();
        System.out.println(boxes[3].price);

        //Box[] boxes={new Box1(), new Box2(), new Box3(), new Box4(), new Box5()};

        int length=15;
        int width=10;
        int height=10;

        for (Box box:boxes) {
            //Box1 b1 =(Box1) box;
           for(box.validate(length, width, height);;){
               System.out.println(box.name+" it is, "+box.price);
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
