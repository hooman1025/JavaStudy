package com.test.exam02;

public class Person {
    
    private String name;
    private int age;
    private String gender;

    public Person(){}

    public Person(String name, int age, String gender){

        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    //getter 메소드
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    //setter 메소드
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }



    public void smile(){ System.out.println("웃어요"); }
    public void anger(){ System.out.println("화 내지 마세요"); }




}
