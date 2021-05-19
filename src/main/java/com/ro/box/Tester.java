package com.ro.box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes = { new Box1(), new Box2(), new Box3(), new Box4()};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter object's length; ");
        int length = Integer.parseInt(sc.next());
        System.out.println("Please enter object's width: ");
        int width = Integer.parseInt(sc.next());
        System.out.println("Please enter object's height:");
        int height = Integer.parseInt(sc.next());
        for (Box box: boxes) {
            if(box.validate(length, width, height)){
                System.out.println(box.getName()+" / "+box.getPrice());
                break;
            }
        }
    }
}
