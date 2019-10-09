/*
 * polynomial third coefficients.
 */
public class Polynomial3D extends Polynomial{
	//coefficients
	private double a;
	private double b;
	private double c;
	private double d;
	Polynomial3D(double a,double b,double c,double d){
		this.setA(a);
		this.setB(b);
		this.setC(c);
		this.setD(d);		
	}
	@Override
	/*
	 * print method
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Polynomial3D [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	//constructor
	Polynomial3D() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * evaluate method 
	 */
	public double evaluate(double x) {
		double y=getA()+getB()*x+getC()*x*x+getD()*x*x*x;
		super.x.add(x);// add coordinates
		super.y.add(y);
		return y;
	}
	/**
	 * @return the a
	 */
	public double getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
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
	/**
	 * @return the d
	 */
	public double getD() {
		return d;
	}
	/**
	 * @param d the d to set
	 */
	public void setD(double d) {
		this.d = d;
	}
}
