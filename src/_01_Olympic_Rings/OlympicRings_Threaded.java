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
		
		timmy.setSpeed(1000);
		tammy.setSpeed(1000);
		sammy.setSpeed(1000);
		simmy.setSpeed(1000);
		staimmy.setSpeed(1000);
		
		timmy.penDown();
		tammy.penDown();
		sammy.penDown();
		simmy.penDown();
		staimmy.penDown();
		
		timmy.setPenColor(0, 0, 255);
		tammy.setPenColor(255, 255, 0);
		sammy.setPenColor(0, 0, 0);
		simmy.setPenColor(0, 255, 0);
		staimmy.setPenColor(255, 0, 0);
		
		Thread r1a = new Thread(()->timmy.move(6));
		Thread r2a = new Thread(()->tammy.move(6));
		Thread r3a = new Thread(()->sammy.move(6));
		Thread r4a = new Thread(()->simmy.move(6));
		Thread r5a = new Thread(()->staimmy.move(6));
		
		Thread r1b = new Thread(()->timmy.turn(2));
		Thread r2b = new Thread(()->tammy.turn(2));
		Thread r3b = new Thread(()->sammy.turn(2));
		Thread r4b = new Thread(()->simmy.turn(2));
		Thread r5b = new Thread(()->staimmy.turn(2));
		
		for(int i = 0; i < 170; i++) {
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

