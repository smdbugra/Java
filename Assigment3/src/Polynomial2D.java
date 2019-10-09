/*
 * polynomial second coefficients.
 */
public class Polynomial2D extends Polynomial {
	//coefficients
	private double a;
	private double b;
	private double c;
	Polynomial2D(double a,double b,double c){
		this.setA(a);
		this.setB(b);
		this.setC(c);

	}
	@Override
	/*
	 * print method
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Polynomial2D [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	/*
	 * constructor 
	 */
	Polynomial2D() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * evaluate for f(x)
	 * @see Polynomial#evaluate(double)
	 */
	public double evaluate(double x) {
		double y=getA()+getB()*x+getC()*x*x;
		super.x.add(x);// add to arrayList
		super.y.add(y);// add to arrayList
		return y;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}
	/**
	 * @return the c
	 */
	public double getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(double c) {
		this.c = c;
	}
}
