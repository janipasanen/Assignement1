package assignement1;

import becker.robots.*;

import java.util.Random;

public class JanisWorld {

	public static void main(String[] args) {
		City JanisTown = new City(15, 15);
		JanisRobot jp = new JanisRobot(JanisTown, 7, 7, Direction.NORTH);

		// Randomize size and create the walls/prison
		Random rand = new Random();
		int size = rand.nextInt(6) + 5;
		int space = (15 - size) / 2;


		for (int i = space; i <= size + space; i++) {
			new Wall(JanisTown, space, i, Direction.NORTH);
			new Wall(JanisTown, space + size, i, Direction.SOUTH);
			new Wall(JanisTown, i, space, Direction.WEST);
			new Wall(JanisTown, i, space + size, Direction.EAST);
		}

			// Randomize creation of things inside the Walls
		// int y = space;
		// int x = space;
		for (int x = space; x <= size + space; x++) {
			for (int y = space; y <= size + space; y++) {
				new Thing(JanisTown, y, x);

			}
		}
		// jp.explore();
		
	}
}



