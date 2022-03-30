package com.test.thread;

public class ThreadExam3 {
    
    public static void main(String[] args) {
        
        new Thread(new Runnable() {

            @Override
            public synchronized void run() {
                for(int i=0; i<5; i++) {
                    try {
                        Thread.sleep(10);
                        System.out.println("Thread1이 실행");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(10);
                System.out.println("Thread2이 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
