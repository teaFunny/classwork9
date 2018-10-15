package com.alevel;

public class Pet {

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    protected String name;

    public Pet(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected int dateOfBirth;
    protected  String surname;

    public void getNewName(){
        name = "New";
    }

    public void getOldName(){
        name = "Old";
    }

    public void sleep(){
        System.out.println("ZZZ");
    }
}
