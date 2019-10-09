/**
 * To create Circle class.
 * @author Samed Buðra Özdemir 041701002
 * @since  03.16.2019
 */
public class Circle {
	private double x; //Circle center x coordinate
	private double y; //Circle center y coordinate
	private double r; //Circle radius

	Circle(double x,double y, double r){
		this.setX(x); // in constructor x line to this x line
		this.setY(y); //in constructor y line to this y line
		this.setR(r); //in constructor r value to this r value

	}
	/**
	 * To draw circle method
	 */
	public void draw() {
		StdDraw.setPenRadius(0.002);//thicknes off circle
		StdDraw.circle(getX(), getY(), getR());//coordinate and radius of circle
		StdDraw.pause((int) 0.1);
		StdDraw.show();//to show
	}
	/**
	 * We have found the distance between two points.
	 * @param inputCircle we are taking values from input circle to find distance
	 * @return fartest circles length
	 */
	public double distance(Circle inputCircle) {
		double inputCircleX=inputCircle.getX(); // x value to inputCircleX
		double inputCircleY=inputCircle.getY(); // y value to inputCircleY
		double distance= Math.sqrt(Math.pow((inputCircleX - this.getX()),2)+ Math.pow((inputCircleY - this.getY()), 2)); // distance between two point
		return distance; //return length of distance.


	}
	//for private get and set methods...
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
}
