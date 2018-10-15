package com.alevel;


public class Parrot extends Pet implements Flyable{

    public static final int wings;
    static {
        wings = 2;
    }


    public Parrot(String name){
        super(name, "");

    }



    public void talk(){
        System.out.println("Попка - дурак!");
    }


    public void sleep(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("ZZZ");
        }
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly");
    }
}
