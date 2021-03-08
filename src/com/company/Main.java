package com.company;
class A{
    void show(){
        System.out.println("Show");
    }
}
class B{
    void Play(){
        System.out.println("Play");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");

        A ob = new A();
        ob.show();
        new B().Play();
    }
}
