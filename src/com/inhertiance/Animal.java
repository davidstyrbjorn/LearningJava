package com.inhertiance;

public abstract class Animal {

    /*
    Base class Animal
     */

    String name;
    int age;

    // Unique abstract method
    public abstract void makeSound();

    // Shared methods for every derived animal
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void birthday()
    {
        age++;
        System.out.println(name + " is now " + age);
    }
}
