
import java.awt.Color;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *  Java program which generates N random circles with random coordinates and radiuses. Find farthest circle pair where the
distance between them is the largest. Draw these two circles thicker and also show the connecting line between them in red.
 * @author Samed Buðra Özdemir 041701002
 * @since  03.16.2019
 */
public class Samed_Bugra_Ozdemir {
	/**
	 * Draws a circle without going out of the field.
	 * @param args not used
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int worldSize=5; //x,y coordinates length.
		int canvas_width=900;  //area size width
		int canvas_height=900; // area size height
		StdDraw.setCanvasSize(canvas_width,canvas_height); // draw
		StdDraw.setXscale(0,worldSize); // x coordinates of area
		StdDraw.setYscale(0,worldSize); // y coordinates of area

		Scanner in=new Scanner(System.in); // input from user 
		System.out.println("Write an integer for  n random circles with random coordinates and radiuses.");
		int n=in.nextInt();
		//Random random=new Random();// create random different style
		double x=Math.random()*5;//random x coordinates
		double y=Math.random()*5;//random y coordinates
		double r=Math.random()*0.1;// random radius

		Circle[] circles=new  Circle[n]; // create object array to keep our circles.
		int counter=0;// counter to put array
		while(counter<n) {
			x=Math.random()*5; // product random coordinates for each time
			y=Math.random()*5;
			r=Math.random()*0.3;
			// this if to keep our circles in the area...
			if(((x+r<5)&&(y+r<5))&&((x-r>0)&&(y-r>0))) {
				circles[counter]=new Circle(x,y,r);// we keep in the array with counter our random values.
				circles[counter].draw();// draw for each time
				counter++;

			}

		}
		// I checked with this comment programs correct.
		//System.out.println(circles[0].x+" "+circles[0].y+" "+circles[1].x+" "+circles[1].y);
		//System.out.println("Çemberler arasý mesafe="+" "+Math.sqrt(Math.pow((circles[1].x-circles[0].x),2))+(Math.pow((circles[1].y-circles[0].y),2)));
		//System.out.println(circles[0].distance(circles[1]));
		double maxDistance=0; // this value keep max distance
		double coordinateX1=0; // to keep x coordinate which is the farthest
		double coordinateY1=0; // to keep y coordinate which is the farthest
		double coordinateX2=0; //to keep x2 coordinate which is the farthest
		double coordinateY2=0; //to keep y2 coordinate which is the farthest
		double radius1=0; // farthest circles radius1 to draw thick
		double radius2=0; // farthest circles radius2 to draw thick
		//Search to farthest 2 circles with 2 for loop 
		for(int i=0;i<circles.length;i++) {
			for(int j=0;j<circles.length;j++) {
				double adjacentDistance=circles[i].distance(circles[j]);// we called distance method to find farthest from Circle class.
				// if adjacentDistance bigger than max distance new max distance will be adjacentDistance
				if(adjacentDistance>maxDistance) {
					maxDistance=adjacentDistance;
					coordinateX1=circles[i].getX();//farthest x1 value
					coordinateX2=circles[j].getX();//farthest x2 value
					coordinateY1=circles[i].getY();//farthest y1 value
					coordinateY2=circles[j].getY();//farthest y2 value
					radius1=circles[i].getR(); // farthest circles radius1
					radius2=circles[j].getR(); // farthest circles radius2

				}


			}
		}
		StdDraw.setPenRadius(0.006); // increase thickness of farthest circles.
		StdDraw.circle(coordinateX1,coordinateY1,radius1); // coordinate of farthest circles1
		StdDraw.circle(coordinateX2, coordinateY2, radius2); // coordinate of farthest circles2
		StdDraw.show(); // to show

		StdDraw.setPenRadius(0.008); //thickness of between farthest circles line.
		StdDraw.setPenColor(StdDraw.RED); // color of line
		StdDraw.line(coordinateX1, coordinateY1, coordinateX2, coordinateY2); // center of between circles line
		StdDraw.show(); // to show

		System.out.println("Farthest distance of two circle="+maxDistance);//  Numerical distance between farthest circle.
	}
}

