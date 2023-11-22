/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer to check if it's a prime or not: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            int to = 2;
            boolean pr = true;

            do {
                if (num % to == 0) {
                    pr = false;
                    break;
                }
                to++;
            } while (to <= Math.sqrt(num));

            if (pr) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
    
}
