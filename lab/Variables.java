public class Variables {
	public static void main(String[] args) {

		// Exercise 1
		// Define 5 different numerical variables
		int age = 26;
		int zipcode = 5000;
		float decimalNumber = 2.1f;
		double pi = 3.14159;
		int familySize = 4;
		
		// Print out the variables values
		System.out.println("I am " + age + " years old");
		System.out.println("My zipcode is " + zipcode);
		System.out.println("My favorite decimal number is " + decimalNumber);
		System.out.println("Pi is " + pi);
		System.out.println("My family consists of " + familySize + " people");
		

		// Exercise 2
		// Variable definition of i, j and k
		int i = 1;
		int j = 2;
		int k = 4;
		
		/* Find the average of the three (plus typecasting to get the 
		*  exact number in a double
		*/ 
		double average = (double)(i + j + k) / 3;
		
		// Print out the average
		System.out.println("The average is " + average);
	}
}