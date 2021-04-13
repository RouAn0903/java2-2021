package com.ro.inter.box;

public class Box5 extends Box{
    public Box5(){
        length =15;
        width =20;
        height =25;
    }

    @Override
    public String getName() {
        return "Box5";
    }

    public int getPrice(){
        return 100;
    }
}
