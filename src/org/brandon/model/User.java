package org.brandon.model;

public class User {
    private String name;
    private int age;
    private int something;
    private int j;
    private int test;
    
    private int devl4;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [name=" + name + "]";
    }

}
