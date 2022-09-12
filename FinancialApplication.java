/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*Jean Huc
COP 2800 Homework 1
8-26-2022
This program reads the subtotal and the gratuity rate, then computes the 
gratuity and total
*/
package financial.application;
import java.util.Scanner;



public class FinancialApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratituity rate");
        float subtotal = input.nextFloat(); // To hold subtotal value
        float gratituityRate = input.nextFloat(); // To hold tip rate
        float tip = gratituityRate/100; // calculates the tip percentage
        float totalTip = tip * subtotal; // calculates the the tip in a dollar amount
        float grandTotal = totalTip + subtotal; // Calculates grand total 
        
        System.out.print("The gratituity is $" + totalTip + " and the total is $" + grandTotal);
    }
    
}
