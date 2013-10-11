package assignement1;

import becker.robots.*;

public class JaniRobot extends SmartRobot {
	public JaniRobot(City c, int st, int av, Direction d, int n) {
		super(c, st, av, d, n);

	}

	public int Area = 1;

	public void findsize() {
		this.goToWall();
		this.turnAround();

		int avl = getStreet();
		// int st1 = getStreet();
		this.goToWall();
		int avr = getStreet();
		// int st2 = getStreet();
		int dist = (avr - avl) + 1;
		System.out.println("The prison size is " + dist + " x " + dist);
	
		Area = dist * dist;
		System.out.println("Area = " + Area);
	}

	public void writeoutAndPick() {
		if (canPickThing()) {
			this.pickThing();
			System.out.println("Street " + getStreet() + " Avenue "
					+ getAvenue());

		}
	}

	public void TurnIf() {
		turnTo(Direction.NORTH);
		goToNextIf();
		if (getAvenue() > 7) {
			turnLeft();
		} else {
			turnRight();
		}
	}

	public void pickStuffInField() {
		int Counter = Area;
		
		this.turnRight();
		this.goToWall();
		this.turnAround();

		while (Counter > 0) {
			while (frontIsClear()) {
				writeoutAndPick();
				goToNextIf();
				Counter--;
			}
			writeoutAndPick();
			TurnIf();
			Counter--;
			
		}
	}
}