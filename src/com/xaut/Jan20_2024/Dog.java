package com.xaut.Jan20_2024;

/**
 * @Author Costar
 * @Date Sat 1/20/2024 10:23 PM
 */
public class Dog extends Animal{
    public static void run() {
        System.out.println("Dog running...");
    }

    public void eat() {
        System.out.println("Dog eating...");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.run();
        dog.eat();
    }
}
