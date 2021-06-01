package com.sda;

public class Zoo {
    public String name;
    public int age;

    public void setVal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Zebra zebra = new Zebra();
        zebra.setVal("Friday", 7);

        Bear bear = new Bear();
        bear.setVal("Baloo", 22);

        zebra.sayMessage();
        bear.sayMessage();


    }



}
