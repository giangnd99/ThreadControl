/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.multithread.synchronization;

/**
 *
 * @author Computer
 */
public class SynchronizedDemo {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5};

        int threadQuantity = 3;
        SumThreadImpl[] threads = new SumThreadImpl[threadQuantity];
        
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new SumThreadImpl("Luong "+ (i+1), array);
        }
        try {
            for (SumThreadImpl thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Luong chinh da bi ngat");
        }

    }
}
