package _01_Olympic_Rings;

import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot timmy = new Robot(200, 200);
		Robot tammy = new Robot(410, 410);
		Robot sammy = new Robot(620, 200);
		Robot simmy = new Robot(830, 410);
		Robot staimmy = new Robot(1040, 200);
		
		timmy.setSpeed(100);
		tammy.setSpeed(100);
		sammy.setSpeed(100);
		simmy.setSpeed(100);
		staimmy.setSpeed(100);
		
		timmy.penDown();
		tammy.penDown();
		sammy.penDown();
		simmy.penDown();
		staimmy.penDown();
		
		Thread r1a = new Thread(()->timmy.move(3));
		Thread r2a = new Thread(()->tammy.move(3));
		Thread r3a = new Thread(()->sammy.move(3));
		Thread r4a = new Thread(()->simmy.move(3));
		Thread r5a = new Thread(()->staimmy.move(3));
		
		Thread r1b = new Thread(()->timmy.turn(1));
		Thread r2b = new Thread(()->tammy.turn(1));
		Thread r3b = new Thread(()->sammy.turn(1));
		Thread r4b = new Thread(()->simmy.turn(1));
		Thread r5b = new Thread(()->staimmy.turn(1));
		
		for(int i = 0; i < 100; i++) {
			r1a.run();
			r1b.run();
			r2a.run();
			r2b.run();
			r3a.run();
			r3b.run();
			r4a.run();
			r4b.run();
			r5a.run();
			r5b.run();			
		}
		
	}
}

