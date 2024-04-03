package com.xaut.Jan20_2024;

/**
 * @Author Costar
 * @Date Sat 1/20/2024 10:41 PM
 */
public interface Skill {
    static void speak() {
        System.out.println("Speaking...");
    }

    void climbTree();

    default void dance() {
        System.out.println("Dancing...");
    }

    private void sing() {
        System.out.println("Singing...");
    }

}
