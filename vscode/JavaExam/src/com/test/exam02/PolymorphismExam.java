package com.test.exam02;

class Family{
    void hello() { }
}

class KimFamily extends Family{
    void hello(){System.out.println("김선생님 안녕하세요?");}
    void dinner(){System.out.println("식사나 하시죠.");}
    void drink(){System.out.println("술 ㄱ?");}
}

class ParkFamily extends Family{
    void hello(){System.out.println("박선생님 안녕하세요?");}
    void fishing(){System.out.println("낚시 ㄱ?");}
}


public class PolymorphismExam {
    
    public static void main(String[] argv) {

        Family kimF = new KimFamily();
        kimF.hello();

        Family parkF = new ParkFamily();
        parkF.hello();


    }


}
