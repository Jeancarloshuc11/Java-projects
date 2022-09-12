/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plate.number;

/**Jean Huc
 * COP2800 HW3_2
 * 9/11/2001
 * This program generates a random vehicle plate number
 *
 * 
 */
public class PlateNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generate three random uppercase letters
		int letter1 = 65 + (int)(Math.random() * (90 - 65));
		int letter2 = 65 + (int)(Math.random() * (90 - 65));
		int letter3 = 65 + (int)(Math.random() * (90 - 65));	

		// Generate three random digits
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		

		// Display number plate
		System.out.println("" + (char)(letter1) + ((char)(letter2)) + 
			((char)(letter3)) + number1 + number2 + number3);
    }
    
}
