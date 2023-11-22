/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mult;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Mult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to make a multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Here are the Multiplication table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
    }
}
