/*
 * polynomial first coefficients.
 */
public class Polynomial1D extends Polynomial {
	private double a;// coefficients
	private double b;


	Polynomial1D(double a, double b){
		setA(a);
		setB(b);
	}
	Polynomial1D() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Evaluate for f(x)
	 * @see Polynomial#evaluate(double)
	 */
	public double evaluate(double x) {
		double y=a+b*x;
		super.x.add(x);// add to x to polynomial classes arrayList
		super.y.add(y);// add to y to polynomial classes arrayList
		return y;
	}
	/*
	 * set and get for data field
	 */
	public void setA(double a) {
		this.a=a;
	}
	public double getA(double a) {
		return a;
	}
	public void setB(double b) {
		this.b=b;
	}
	public double getB(double b) {
		return b;
	}
	@Override
	/*
	 * print method for classes.
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Polynomial1D [a=" + a + ", b=" + b + "]";
	}





}
