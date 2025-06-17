package com.sai;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;


    //@Qualifier("com2")
    private Computer com;

    public  Alien(){
        System.out.println("Object is created..");
    }
     /* public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    } */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("Settter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
