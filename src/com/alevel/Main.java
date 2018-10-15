package com.alevel;

public class Main {

    public static void main(String[] args) {


        Parrot parrot = new Parrot("Jonh");

        Flyable jonh = new Parrot("Jonh");
        Flyable maria = new Butterfly();

        Flyable [] someones = {jonh, maria};

        for (Flyable f: someones){
            f.fly();
            System.out.println(f.getClass());
        }
    }
}
