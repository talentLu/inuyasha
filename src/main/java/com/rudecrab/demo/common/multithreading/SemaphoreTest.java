package com.rudecrab.demo.common.multithreading;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/16 15:22
 **/
class SemaphoreTest {
    private final Semaphore semaphore;
    private final int permits;

    public SemaphoreTest(int permits) {
        semaphore = new Semaphore(permits);
        this.permits = permits;
    }
    public void use() throws InterruptedException {
        semaphore.acquire();
        try {
            doUse();
        }finally {
            semaphore.release();
        }
    }

    private void doUse() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() +"begin:used = :" + (permits - semaphore.availablePermits()));
        Thread.sleep(new Random().nextInt(500));
        System.out.println(Thread.currentThread().getName() +"end:used = :" + (permits - semaphore.availablePermits()));
    }

}

class MyThread extends Thread {
    private final SemaphoreTest semaphoreTest ;

    public MyThread(SemaphoreTest semaphoreTest) {
        this.semaphoreTest = semaphoreTest;
    }

    @Override
    public void run() {
        try {
            while (true) {
                semaphoreTest.use();
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        SemaphoreTest semaphoreTest = new SemaphoreTest(3);
        for (int i = 0; i < 10; i++) {
            new MyThread(semaphoreTest).start();
        }
    }
}
