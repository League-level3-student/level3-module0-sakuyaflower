package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	static Random random = new Random();
	static int[] numbers = new int[50]; 
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
for(int i = 0; i < 5; i++) {
	robots[i] = new Robot();
	robots[i].setY(600);
	robots[i].setX(100 + (150 * i));	
	if(robots[i].getY() <= 0) {

	}
}
			//4. make each robot start at the bottom of the screen, side by side, facing up

		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
for(int r = 0; r < 193; r++){
for(int i = 0; i < robots.length; i++) {    	
    	robots[i].move(random.nextInt(50));
    	if(robots[i].getY() <= 0) {
    	    System.out.println("Robot Number " + robots[i] + "won!!!");	
    	    	}	
}
    	}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
}
