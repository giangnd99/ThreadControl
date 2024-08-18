/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.multithread.synchronization;

/**
 *
 * @author Computer
 */
public class RaceCondition {

    static long count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {

        Thread[] threads = new Thread[20];

        for (int i = 0; i < threads.length; i++) {

            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    increment();
//                    count++;
                }
                System.out.println("Thread counted: " + count);
            });
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Current: " + count);
    }
}
