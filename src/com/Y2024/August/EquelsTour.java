package com.Y2024.August;

import com.Y2024.August.vo.Cat;

/**
 * @Author Costar
 * @Date 周六 2024-08-03 10:25
 */
public class EquelsTour {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Cat son1 = new Cat();
        son1.setName("小小怪");
        Cat son2 = new Cat();
        son2.setName("小小怪");

        cat1.setName("小怪");
        cat1.setAge(30);
        cat1.setSon(son1);

        cat2.setName("小怪");
        cat2.setAge(30);
        cat2.setSon(son2);

        Cat grandson1 = new Cat();
        Cat grandson2 = new Cat();
        son1.setSon(grandson1);
        son2.setSon(grandson2);

        System.out.println(cat1.equals(cat2));
    }
}
