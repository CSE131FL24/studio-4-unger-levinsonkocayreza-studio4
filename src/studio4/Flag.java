package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,22);
		Color pinky = new Color (252,180,203);
		StdDraw.setPenColor(pinky);
		StdDraw.filledRectangle(11,8, 6, 3);
		Color purpley = new Color (177,156,217);
		StdDraw.setPenColor(purpley);
		StdDraw.filledCircle(11, 8, 2);
		Color bluey = new Color (173, 216, 230);
		StdDraw.setPenColor(bluey);
		StdDraw.filledCircle(11,8,1);
		StdDraw.filledRectangle(6, 10, 1, 1);
		StdDraw.filledRectangle(16, 10, 1, 1);
		StdDraw.filledRectangle(6,6,1,1);
		StdDraw.filledRectangle(16,6, 1, 1);
	}
}