package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	public static void main(String[] args) {
	Robot[] robots = new Robot[5];	
	Thread[] threads = new Thread[robots.length];
	Random r = new Random();
	for(int i = 0; i < 5; i++) {
		robots[i] = new Robot();
	}
	for(int i = 0; i < robots.length; i++) {
		robots[i].setX((i+1)*140);
		robots[i].setY(560);
		robots[i].setSpeed(100);	
	}
	boolean b = true;
	int winner = 0;
	while(b == true) {
    	for(int i = 0; i < 5; i++) {
    		if(robots[i].getY() <= 0) {
				b = false;
				winner = i;
				i = 5;
			}
    		int a = i;
    		threads[i] = new Thread(()->robots[a].move(r.nextInt(2)));
    		threads[i].start();
    	}
	}
    	JOptionPane.showMessageDialog(null, "robot " + winner + " won the race");
	}

}