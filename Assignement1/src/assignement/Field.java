package assignement;

import becker.robots.*;

import java.util.Random;


public class Field {
	public Field(City c, int size) {
		 Random rand = new Random();
		int space = (15 - size) / 2;

		for (int l = 0; l < size + 1; l++) {
			for (int w = 0; w < size + 1; w++) {
				if (rand.nextInt(2) == 0) {
					new Thing(c, w + space, l + space);

				}
			// i = i + 1; == i++;


			}
		}
	}
}
