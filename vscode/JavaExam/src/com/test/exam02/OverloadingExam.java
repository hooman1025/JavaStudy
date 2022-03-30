package com.test.exam02;

class A{

    public void a() { System.out.println("파라미터가 없음");}
    public void a(int i, int j) { 
        System.out.println("파라미터가 있음" + i + " " + j);}
    


}

public class OverloadingExam {
    
    public static void main(String[] argv) {
        A a = new A();
        a.a();
        a.a(1,2);


    }


}
