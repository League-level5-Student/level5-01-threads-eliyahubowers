package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot timmy = new Robot(200, 200);
		Robot tammy = new Robot(410, 410);
		Robot sammy = new Robot(620, 200);
		Robot simmy = new Robot(830, 410);
		Robot staimmy = new Robot(1040, 200);
		
		timmy.setSpeed(10);
		tammy.setSpeed(10);
		sammy.setSpeed(10);
		simmy.setSpeed(10);
		staimmy.setSpeed(10);
		
		Thread r1 = new Thread(()->timmy.move(100));
		Thread r2 = new Thread(()->tammy.move(100));
		Thread r3 = new Thread(()->sammy.move(100));
		Thread r4 = new Thread(()->simmy.move(100));
		Thread r5 = new Thread(()->staimmy.move(100));
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}

