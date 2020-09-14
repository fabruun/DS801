// Exercise 3
// Impr the Scanner class for user input
import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		// Define the variables for hours, minutes and seconds
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		// Variables for hours in seconds and minutes in seconds;
		int hoursInSeconds, minutesInSeconds;
		
		// Print out a welcome message to the user
		System.out.println("Please input a time interval in hours, minutes and seconds");
		
		// Opens input from the user
		Scanner input = new Scanner(System.in);
		// Takes in the time interval input, in hours, minutes and seconds
		hours = input.nextInt();
		minutes = input.nextInt();
		seconds = input.nextInt();
		// Closes the user input
		input.close();
		// Converts the hours to seconds
		hours = hours * 3600;
		// Converts the minutes to seconds
		minutes = minutes * 60;
		// Print out the sum of all the seconds
		System.out.println(hours + minutes + seconds);
	}
}