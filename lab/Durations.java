// Exercise 4
// Imports the Scanner class for using input
import java.util.Scanner;

public class Durations {

	public static void main(String[] args) {
		// defines the variables for hh:mm:ss
		int hours = 0;
		int minutes = 0;
		int seconds = 0;

		// Welcome message for the user
		System.out.println("Please input a time interval in seconds");
		
		// Opens the input from the keyboard
		Scanner input = new Scanner(System.in);
		// Takes in the total numbber of seconds
		seconds = input.nextInt();
		// Closes the input from the keyboard
		input.close();

		/*
		* Algorithm that converts a time interval in seconds to hh:mm:ss
		*/
		// Convertss hours to seconds
		hours = seconds / 3600;
		/* Redefines the seconds variables by subtracting
		*  total seconds with  hours in seconds
		*/
		seconds = seconds - (hours * 3600);
		// Converts the new redefines to minutes
		minutes = seconds / 60;
		// Redefines seconds again now subtracting minutes in seconds
		seconds = seconds - (minutes * 60);
		// Print out the time interval:
		System.out.println("The time interval is: " + hours+":"+minutes+":"+seconds);
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}
	
}