package com.test.thread;

class ExamClass implements Runnable{

    @Override
    public synchronized void run() {
        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread1가 실행");
        }  
    }
}


public class ThreadExam {
    
    public synchronized static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ExamClass());
        thread.start();

        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread2가 실행");
        }
    }
}
