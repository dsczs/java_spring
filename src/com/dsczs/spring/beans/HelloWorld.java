package com.dsczs.spring.beans;

public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void hello(){
        System.out.println("hello:"+name);
    }
    
    public HelloWorld(){
        System.out.println("Hello World");
    }
}
