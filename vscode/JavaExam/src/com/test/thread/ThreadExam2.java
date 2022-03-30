package com.test.thread;

class ExamClass2 extends Thread {
    
    @Override
    public synchronized void run() {
        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(10);
                System.out.println("Thread1이 실행중");
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    }
}

public class ThreadExam2 {
    
    public synchronized static void main(String[] args) {
        ExamClass2 examClass2 = new ExamClass2();
        examClass2.start();

        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(10);
                System.out.println("Thread2가 실행중");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
