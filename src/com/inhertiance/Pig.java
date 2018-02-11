package com.inhertiance;

public class Pig extends Animal {

    public Pig()
    {
        super.name = "Pig";
        super.age = 0;
    }

    @Override
    public void makeSound()
    {
        System.out.println("The " + name + " says HOOONK");
    }
}
