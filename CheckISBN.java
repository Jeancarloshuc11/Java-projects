/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package check.isbn;
import java.util.Scanner;

/**
 *Jean Huc
 * COP2800 HomeWork #2
 * 9/1/2022
 * This program displays an ISBN number with last digit derived from user input
 */
public class CheckISBN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompt the user to enter the first 9 digits of a 10-digit ISBN
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
                int isbn = input.nextInt();

		// Extract the digits of the ISBN
		int d1 = isbn / 100000000;
		int remainingDigits = isbn % 100000000;
		int d2 = remainingDigits / 10000000;
		remainingDigits %= 10000000;
		int d3 = remainingDigits / 1000000;
		remainingDigits %= 1000000;
		int d4 = remainingDigits / 100000;
		remainingDigits %= 100000;
		int d5 = remainingDigits / 10000;
		remainingDigits %= 10000;
		int d6 = remainingDigits / 1000;
		remainingDigits %= 1000;
		int d7 = remainingDigits / 100;
		remainingDigits %= 100;
		int d8 = remainingDigits / 10;
		remainingDigits %= 10;
		int d9 = remainingDigits;

            //compute tenth digit which is calculated from the 
            //other 9 digits using the following formula:
            //(d1 x 1 + d2 x 2 + d3 x 3 + d4 x 4 + d5 x 5 + d6 x 6 + d7 x 7 + d8 x 8 + d9 x 9) % 11
            //If the checksum is 10, the last digit is denoted as X according to the ISBN-10 
            //convention.
                int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
				 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		//Output result based on value 0f 10th digit
		if (d10 == 10){
                    System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 
								 + d6 + d7 + d8 + d9 + "X");
			
                }
                else 
                    System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 
								 + d6 + d7 + d8 + d9 + d10);
			

        
    }
    
}
