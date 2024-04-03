package com.xaut.Jan20_2024;

/**
 * @Author Costar
 * @Date Sat 1/20/2024 10:45 PM
 */
public class AdvanceDog implements Skill {
    @Override
    public void climbTree() {
        System.out.println("Advance dog climbing");
    }

    @Override
    public void dance() {
        System.out.println("Advance dog dancing");

    }

    public void speak() {
        System.out.println("Advance dog speaking");
        Skill.speak();
    }

    public static void main(String[] args) {
        AdvanceDog advanceDog = new AdvanceDog();
        advanceDog.climbTree();
        advanceDog.dance();
        advanceDog.speak();

        Skill.speak();
    }
}
