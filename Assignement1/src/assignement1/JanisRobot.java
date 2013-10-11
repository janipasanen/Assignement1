package assignement1;

import becker.robots.*;


public class JanisRobot extends Robot {
public JanisRobot(City c, int st, int av, Direction d, int n) {
	super(c, st, av, d, n);
	setSpeed(5 * getSpeed());
}

public JanisRobot(City c, int st, int av, Direction d) {
	super(c, st, av, d);
	setSpeed(5 * getSpeed());
}

		/*
		 * goToWall(); int avr = getAvenue(); turnAround(); goToWall(); int avl
		 * = getAvenue(); int dist = avr - avl + 1;
		 * System.out.println("Distance is " + dist);
		 */


			public void turnRight() {
				double speed = getSpeed();
				setSpeed(3 * speed);
				turnLeft();
				turnLeft();
				turnLeft();
				setSpeed(speed);
			}

			public void putThing() {
				if (countThingsInBackpack() > 0) {
					super.putThing();
				} else {
					System.out.println("Nothing to put!");
				}
			}

			public void pickThing() {
				if (canPickThing()) {
					super.pickThing();
				} else {
					System.out.println("Nothing to pick!");
				}
			}

			public void move() {
				if (frontIsClear()) {
					super.move();
				} else {
					System.out.println("Cannot go through walls!");
				}
			}

			public void turnAround() {
				double speed = getSpeed();
				setSpeed(2 * speed);
				turnLeft();
				turnLeft();
				setSpeed(speed);
			}

			public void move(int nrSteps) {
				for (int i = 0; i < nrSteps; i++) {
					move();
				}
			}

			public void turnLeft(int nrTurns) {
				for (int i = 0; i < nrTurns; i++) {
					turnLeft();
				}
			}

	public void goToWall() {
			        while(frontIsClear()) {
			            move();
			        }
	}

	public void explore() {

		this.goToWall();
		this.turnAround();
		int avl = getStreet();
		this.goToWall();
		int avr = getStreet();
		int dist = (avr - avl) + 1;
		System.out.println("The jail is " + dist);
		System.out.println("x " + dist);
		System.out.println("large ");
		this.turnRight();
		this.goToWall();
		this.turnAround();
	}

}
