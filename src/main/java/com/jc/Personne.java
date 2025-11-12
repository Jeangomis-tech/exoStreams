package com.jc;

import java.util.Arrays;
import java.util.List;

public class Personne {
    String name;
    int age;

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
    }
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
    @Override
    public String toString() {
        return "Personne{" + "name=" + name + ", age=" + age + '}';
    }
}
