package ru.GB.Java2.Lesson5;

public class Java2lesson5Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread - " + Thread.currentThread().getName() + " " + i + " sec");
            }
            System.out.println("END thread t1");
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread - " + Thread.currentThread().getName() + " " + i + " sec");
            }
            System.out.println("END thread t2");
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("END thread t3");
            }
        });



        t1.start();
        t2.start();
        t3.start();


        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main end");
    }
}
