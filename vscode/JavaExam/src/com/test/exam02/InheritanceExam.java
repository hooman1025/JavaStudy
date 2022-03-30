package com.test.exam02;

class Fruit{

    int color;
    int taste;
    void pop(){ System.out.println("과일은 맛있어요.");}


}

class Apple extends Fruit{

    int price;
    int perfume;

    void cut(){ System.out.println("사과를 짤라요.");}


}


public class InheritanceExam {

    public static void main(String[] argv) {

        Apple apple = new Apple();

        apple.pop();
        
    }



}
