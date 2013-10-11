package assignement1;

import becker.robots.*;

public class Prison {
	public Prison(City c, int size) {
		int space = (15 - size) / 2;

		for (int i = space; i <= size + space; i++) {
			new Wall(c, space, i, Direction.NORTH);
			new Wall(c, space + size, i, Direction.SOUTH);
			new Wall(c, i, space, Direction.WEST);
			new Wall(c, i, space + size, Direction.EAST);
		}
	}
}