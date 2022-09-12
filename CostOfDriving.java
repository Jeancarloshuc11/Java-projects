/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cost.of.driving;
import java.util.Scanner;

/*
 Jean Huc
  COP 2800 Homework 1.2
  8-26-2022
  This program prompts the user to enter the distance to drive, the fuel efficiency 
  of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 */
public class CostOfDriving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble(); // To hold the distance
        System.out.println("Enter miles per gallon: ");
        double mpg = input.nextDouble(); // To hold the miles per gallon
        System.out.println("Enter price per gallon: ");
        double gasPrice = input.nextDouble(); // To hold the gas price
        double drivingCost = (distance/mpg) * gasPrice; // calculates the cost of driving
        
        System.out.println("The cost of driving is $" + drivingCost); //Outputs the results
        
        
    }
    
}
