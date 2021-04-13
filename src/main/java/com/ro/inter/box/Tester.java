package com.ro.inter.box;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();

        System.out.println("Please enter object's length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Please enter object's width: ");
        int width = sc.nextInt();
        System.out.println("Please enter object's height: ");
        int height = sc.nextInt();
        System.out.println(length+"\t"+width+"\t"+height);

        if(box3.validate(length, width, height)){
           System.out.print(box3.getName()+ "\t"+ box3.getPrice());
        }else if(box5.validate(length, width, height)){
            System.out.print(box5.getName()+ "\t"+ box5.getPrice());
        }





        /*
        if(length<=10 && width<=10 && height<=10){
            System.out.println("Box3");
        }else if(length<=10 && width<=20 && height<=20){
            System.out.println("Box5");
        }

 */
    }
}
