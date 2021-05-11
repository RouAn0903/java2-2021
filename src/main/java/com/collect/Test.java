package com.collect;

import com.test.Box;
import com.test.Box1;
import com.test.Box2;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> aa =new TreeSet<>();
        System.out.println(aa.size());
        aa.add(1);
        aa.add(2);
        aa.add(3);
        aa.add(4);
        System.out.println(aa.size());
        System.out.println(aa);


        int[] nums = new int[5];
        nums[0] =3;
        //nums[3] ="Roro";
        //nums[1] = true;

        ArrayList list = new ArrayList();
        list.add("Roro");
        list.add(123);  // Boxing
        list.add(true);
        Box1 box = new Box1();
        list.add(box);
        //  Heterogeneous NG!?
        String name = (String) list.get(0);
        String kk = (String) list.get(1);

        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.get(0);
    }
}
