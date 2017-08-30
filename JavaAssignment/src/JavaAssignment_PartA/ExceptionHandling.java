package JavaAssignment_PartA;

import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {

		int size;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array you would like");
		size = input.nextInt();
		
		int numbers[] = new int[size];
		/* So line 8 addresses taking size as an input for the array, Scanner is used to to identify
		 * and look for integers in the array. Line 14 states the array accepts numbers and prints a new array identified as Size with the inputs from user
		 * Line 11 is giving the user instructions to state how large they want array to be
		 */
		
		System.out.println("Enter the elements into the array");
		for(int i = 0; i< size; i++) {
			numbers[i] = input.nextInt();
		}
		/*Line 20 tells the user to enter elements/numbers in the array. Beginning at index of zero it will increment each place by 1 hence ++
		 * As a number is inputed it adds to array and moves on to being ready for next integer on line 22
		 */
		
		System.out.println("Enter the index of the element you wish to access");
		int index = input.nextInt(); 
		input.close();
		try {
			for(int h = 0; h < size; h++) {
				if(numbers[h] == numbers[index]) {
					System.out.println("The array element at " + index + " = " + numbers[h]);
					System.out.println("Successful");
				}
			}
		}catch(Exception e) {
			System.out.println("The number is out of Bound");
		}
	}
}

/* Line 28 is giving the user instructions on how to access elements in array, so if they type 1 for instance it will return the number located at index 1
 * Line 30 input close is stopping the input of more integers...i believe...
 * The try and Catch on lines 31 thru 39 is what allows the user to access elements in array specifically
 * Starting at index of 0 amd incrementing by 1 each time via line 32 .. Line 34 is just outputting a String with the specific element user accessed and explaining 
 * The FOR statement in the Try block is looping throught the elements of the array which user entered into array 
 */

