package com.generation;

public class Person {
    private final String name;

    private final int age;

    private final String id;

    public Person( String name, int age, String id )
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", id='" + id + '\'' + '}';
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getId(){
        return id;
    }
}
