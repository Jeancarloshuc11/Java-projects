/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package check.ssn;
import java.util.Scanner;

/**
 *Jean Huc
 * COP2800 HW 3
 * 9/10/2022
 * This program prompts the user to enter a Social Security Number in the format 
   DDD-DD-DDDD, where D is a digit, This program checks if the data is valid. 
 * 
 */
public class CheckSSN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Prompt user to enter a SSN
        System.out.println("Enter a social security number");
        Scanner input = new Scanner(System.in);
        String ssn = input.nextLine();
        // Checks whether the input is valid
		boolean isValid = 
			(ssn.length() == 11) && 
			(Character.isDigit(ssn.charAt(0))) &&
			(Character.isDigit(ssn.charAt(1))) &&
			(Character.isDigit(ssn.charAt(2))) &&
			(ssn.charAt(3) == '-') &&
			(Character.isDigit(ssn.charAt(4))) &&
			(Character.isDigit(ssn.charAt(5))) &&
			(Character.isDigit(ssn.charAt(7))) &&
			(ssn.charAt(6) == '-') &&
			(Character.isDigit(ssn.charAt(8))) &&
			(Character.isDigit(ssn.charAt(9))) &&
			(Character.isDigit(ssn.charAt(10)));

		// Display result by 
		System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")
			+ "social security number");
        
        
    }
    
}
