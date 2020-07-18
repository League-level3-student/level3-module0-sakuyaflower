package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] array = {"hi" , "hello", "huh", "what", "fhe" };
		//2. print the third element in the array
System.out.println(array[2]);
		//3. set the third element to a different value
array[2]="fe"; 
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < 4; i++) {
			array[i] = "" + i;	
			System.out.println(array[i]);
					}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers
int[] numbers = new int[50]; 
		//8. use a for loop to make every value of the integer array a random number
Random random = new Random();
int smallest = numbers[0];
int biggest = numbers[49];
for(int i = 0; i < 50; i++) {
	numbers[i] = random.nextInt(50);
             if(numbers[i] > biggest) {
                     biggest = numbers[i];
             }
             if(numbers[i] < smallest) {
                     smallest = numbers[i];
             }
             System.out.println(numbers[i]);
            
}

System.out.println(smallest);
System.out.println(biggest);
System.out.println(numbers[49]);

		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
