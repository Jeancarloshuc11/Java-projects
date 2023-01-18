/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rolldice;

import java.util.Scanner;

/**
 *
 * @author jeanhuc
 */
public class RollDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rolls: ");
        int n = input.nextInt();
                int roll; //number of rolls
		int res[] = new int[6]; // to hold result of random number between 1-6
		 
		System.out.println("In " + n + " rolls "); 
		for(int i=0; i<n; i++) 
		{ 
			roll = (int)(Math.random() * 6)+1; //Generates random number for the entered number of rolls
			res[roll-1]++; 
		} 
                
                for(int i=0; i<6; i++){
 	System.out.println((i+1) + " appears " + res[i] + " times"); 
                }
 
        
        
        
        
    }
    
}
