package com.inhertiance;

public class Dog extends Animal {

    public Dog()
    {
        this.name = "Dog";
        this.age = 0;
    }

    @Override
    public void makeSound()
    {
        System.out.println("The " + name + " says WOOF!");
    }

}
