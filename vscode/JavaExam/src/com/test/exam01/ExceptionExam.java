// package com.test.exam01;

// class ErrorTest {

//     public void errormaking() throws ArithmeticException {

//         int a = 4/0;
//         System.out.println("a = " + a);

//     }


// }


// class FoolException extends Exception { }


// public class ExceptionExam {
    
//     public void sayNickname(String nickname){

//         if(nickname.equals("fool"))
//             try {
//                 throw new FoolException(); //강제적으로 예외를 발생
//             } catch (FoolException e) {
//                 // 
                
//                 System.err.println("FoolException이 발생했습니다.");
            
//             }
//         System.out.println("당신의 별명은 " + nickname + "입니다");
//     }


//     public static void main(String[] argv) {
        
//         int c;
//         try{
//             c = 4/0;
//         } catch(ArithmeticException e){
//             c = -1; //예외 발생시 조치할 부분
//         } finally { //예외가 발생하더라도 실행시켜야 할 부분
//             System.out.println("다행이다..");
//         }


//         System.out.println("c = " + c);

//         ErrorTest errorTest = new ErrorTest();

//         errorTest.errormaking();

//          ExceptionExam exam = new ExceptionExam();
//          //exam.sayNickname("fool");
//          exam.sayNickname("genius");


//     }

// }
