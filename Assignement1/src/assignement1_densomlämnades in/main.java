package assignement1;

import becker.robots.*;

import java.util.Random;


public class main {

	public main() {
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int size = rand.nextInt(6) + 4;

		City JanisTown = new City(15, 15);
		JaniRobot jp = new JaniRobot(JanisTown, 7, 7, Direction.NORTH, 0);
		jp.setLabel("jpRobot");

		Prison RobotPrison = new Prison(JanisTown, size);
		jp.findsize();
		new Field(JanisTown, size);
		jp.pickStuffInField();
	}

}
