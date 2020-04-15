package org.brandon.model;

public class User {
    private String name;
    private int age;
    private int something;
    private int j;
    private int test;
    private int test2;
    private String newbranch;
    
    public User(String name, int age, int something, int j, int test, int devl4) {
        super();
        this.name = name;
        this.age = age;
        this.something = something;
        this.j = j;
        this.test = test;
        this.devl4 = devl4;
    }

    public User() {
        super();
    }

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
    
    public int toInterger() {
        return 2;
    }

}
