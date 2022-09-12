/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.of.the.week;
import java.util.Scanner;

/**
 *Jean Huc
 * 9/2/2022
 * COP 2800 Homework 2_2
 * This program calculates the day of week based on Zellers congruence formula
 * 
 */
public class DayOfTheWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		// Prompt the user to enter a year, month, and day of the month.
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int dayOfMonth = input.nextInt();

		// Convert January and February to months 13 and 14 of the previous year
		 if(month == 1){
                      month = 13;
                      year--;
                  }  
                  else if(month == 2){
                      month = 14;
                      year--;
                  }
                    
		
			

		// Calculate day of the week with Zellers congruence formula
		int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100) 
				+ (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7; 

		// Display reslut
		System.out.print("Day of the week is ");
		switch(dayOfWeek){
		
			case 0: System.out.println("Saturday"); break;
			case 1: System.out.println("Sunday"); break;
			case 2: System.out.println("Monday"); break;
			case 3: System.out.println("Tuesday"); break;
			case 4: System.out.println("Wednesday"); break;
			case 5: System.out.println("Thursday"); break;
			case 6: System.out.println("Friday");
                        
		}
	}
    }
    

