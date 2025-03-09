/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dollars;

/**
 *
 * @author raphu
 */
import java.util.Scanner;

public class Dollars {
   public static void main(String[] args) {
         // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter an amount in dollars
        System.out.print("Enter the amount in dollars: ");
        int amount = scan.nextInt();
        
        // Calculate the number of 20s, 10s, 5s, and 1s
        int twenties = amount / 20;
        amount %= 20;
        
        int tens = amount / 10;
        amount %= 10;
        
        int fives = amount / 5;
        amount %= 5;
        
        int ones = amount;
        
        // Display the results
        System.out.println("Currency denominations:");
        System.out.println("20s: " + twenties);
        System.out.println("10s: " + tens);
        System.out.println("5s: " + fives);
        System.out.println("1s: " + ones);
        
       
    }
}
