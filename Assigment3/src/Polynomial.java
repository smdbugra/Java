import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collections;
/*
 * inherit class for polynomial power classes.
 */

public abstract class Polynomial {
	protected ArrayList<Double> x=new ArrayList<>();//keep every x coordinate
	protected ArrayList<Double> y=new ArrayList<>();//keep every y coordinate
	protected static double h=0.0001;// static value to derived f(x)


	/*
	 * put a point with small x values to draw function's graph.
	 */

	public void draw() {
		for(int i=0; i<x.size()-1; i++)// check every parts of array to draw
		{
			StdDraw.line(x.get(i), y.get(i), x.get(i+1), y.get(i+1)); // drawing

		}
		StdDraw.show();
	}
	//public double evaluate(double x) {

	/*
	 * Abstract method for evaluate
	 */
	public abstract double evaluate(double x); 



	/**
	 * evaluate derivative
	 * @param xMin evaluate start value
	 * @param xMax  evaluate finish value
	 * @return arrayList for derivative value
	 */

	public ArrayList<Double> derivative(double xMin, double xMax){
		ArrayList<Double> derivativeX=new ArrayList<>();// keep every point of derivatives
		//checking size of graphs to evaluate derivative
		for(double i=xMin;i<xMax;i+=0.001) {
			double derX=Math.abs((evaluate(i+h)-evaluate(i))/h);//derivative 
			if(derX<0.001)// checking closely to zero..
			{
				derivativeX.add(derX);// add to arrayList
				StdDraw.setPenColor(StdDraw.RED);//color of point
				StdDraw.setPenRadius(0.008); // thickness
				StdDraw.line(i,evaluate(i),i,evaluate(i));// put a point
				System.out.println("Points with zero derivatives");
				System.out.println("x: "+i+"      y: "+evaluate(i));

			}



		}


		return derivativeX;

	}


}
