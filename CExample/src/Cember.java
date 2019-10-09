import java.awt.Color;

public class Cember {
	public static void main(String[] args) {

		// canvas parameters
		int canvas_width = 300;
		int canvas_height = 600;
		StdDraw.clear(StdDraw.WHITE); // set canvas background color
		StdDraw.setCanvasSize(canvas_width, canvas_height); // set canvas/window size
		StdDraw.setXscale(0, 1); // set x coordinates
		StdDraw.setYscale(0, 1); // set y coordinates

		// circle 1
		double x1 = 0.5;
		double y1 = 0.5;
		double circle_radius = 0.2;
		double circle_border_thickness = 0.008;
		Color circle_color = StdDraw.PRINCETON_ORANGE;
		StdDraw.setPenColor(circle_color);
		StdDraw.setPenRadius(circle_border_thickness);
		StdDraw.circle(x1, y1, circle_radius);

		int counter = 0;
		for (int a = 0; a < 10000; a++) {

			double x2 = Math.random();
			double y2 = Math.random();

			double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

			if (distance < circle_radius) {

				double circle2_radius = 0.01;
				double circle2_border_thickness = 0.004;
				Color circle2_color = StdDraw.ORANGE;
				StdDraw.setPenColor(circle2_color);
				StdDraw.setPenRadius(circle2_border_thickness);
				StdDraw.filledCircle(x2, y2, circle2_radius);
				counter++;
			} else {
				double circle2_radius = 0.01;
				double circle2_border_thickness = 0.004;
				Color circle2_color = StdDraw.GRAY;
				StdDraw.setPenColor(circle2_color);
				StdDraw.setPenRadius(circle2_border_thickness);
				StdDraw.filledCircle(x2, y2, circle2_radius);

			}

		}

		// save drawing to a file
		StdDraw.save("output_figure.png"); // in .png or .jpg format
		System.out.println("Number pi is " + 4 * counter / 1000);
	}
}

