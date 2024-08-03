package com.Y2024.August.vo;

import java.util.Objects;

/**
 * @Author Costar
 * @Date 周六 2024-08-03 10:26
 */
public class Cat {

    private String name;
    private int age;

    private Cat son;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getSon() {
        return son;
    }

    public void setSon(Cat son) {
        this.son = son;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (!Objects.equals(name, cat.name)) return false;
        return Objects.equals(son, cat.son);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSon());
    }
}
