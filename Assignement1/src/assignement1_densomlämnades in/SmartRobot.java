package assignement1;

import becker.robots.*;

public class SmartRobot extends Robot {
    public SmartRobot(City c, int st, int av, Direction d, int n) {
        super(c, st, av, d, n);
		setSpeed(7 * getSpeed());
    }
    public SmartRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
		setSpeed(7 * getSpeed());
    }
    public void turnRight() {
        double speed = getSpeed();
		setSpeed(7 * speed);
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
		setSpeed(7 * speed);
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

	public void goToNextIf() {
		if (frontIsClear()) {
			move();
		}
	}

	public void turnTo(Direction d) {
		while (getDirection() != d) {
			turnLeft();
		}

}
}