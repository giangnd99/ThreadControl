/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.multithread.synchronization;

/**
 *
 * @author Computer
 */
public class SumArray {

    private int sum;

    synchronized int sumArray(int numbers[]) {
        sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Tong hien tai cua " + Thread.currentThread().getName() + " la: " + sum);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Luong da bi ngat");
        }
        return sum;
    }

}
