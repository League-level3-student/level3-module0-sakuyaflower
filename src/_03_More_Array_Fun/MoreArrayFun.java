package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
	
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	String[] array = {"hi", "tomato", "silly", "cucumber", "phone"};

	
	for(int i = 0; i < array.length; i++) {
	//	System.out.println(array[i]);
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
for(int i = array.length-1; i >=0 ; i--) {
	
	//System.out.println(array[i]);
	}

	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
for(int i = 0; i< array.length; i+=2) {
	
	//System.out.println(array[i]);
}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
int numPrinted = 0;
int[] indexes = new int[array.length];
for(int i = 0; i < indexes.length; i++) {
	indexes[i] = -1;
}
Random rand = new Random();
boolean printed = false;
for(int i = 0; i < array.length; i++) {
		int answer = rand.nextInt(array.length);
		for(int r = 0; r < indexes.length; r++ ) {
			if(indexes[r] == answer) {
				printed = true;
				break;
			}
		}
		if(!printed) {
			System.out.println(array[answer]);
			indexes[answer] = answer;
		}
		else {
			i--;
		}
	printed = false;
	}
	
}
}