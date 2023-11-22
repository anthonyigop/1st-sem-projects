/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hfg;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Hfg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int a = 0, b = 1;

            System.out.print("The first " + n + " numbers in the Fibonacci sequence are: ");

            int i = 0;
            while (i < n) {
                System.out.print(a + " ");

                int s = a + b;
                a = b;
                b = s;

                i++;
            }
        }
    }
    
}
