import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * To drive functions graphs and derivative zero point.
 * @author Samed Buðra Özdemir 041701002
 * @since  April 22, 2019	
 */
public class Samed_Bugra_Ozdemir {

	/**
	 * To read functions numbers and call the classes and methods.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setXscale(-10,10);//Create x scale of table
		StdDraw.setYscale(-10,10);//create y scale of table
		StdDraw.line(0, -10, 0, 10);//create x coordinate line
		StdDraw.line(-10, 0, 10, 0);// create y coordinate line

		String filename1 = "functions1.txt";//function's txt docs
		String filename2= "functions2.txt";
		String filename3= "functions3.txt";
		String filename4= "functions4.txt";// own doc.
		Scanner in=new Scanner(System.in);
		System.out.println("To find which function's graph: 1,2,3 or 4 please give me txt number");//taking input for which txt.
		int finder=in.nextInt();// 1-2-3-4 function txt

		// opens the text file
		File myFile = new File("functions"+Integer.toString(finder)+".txt");
		Scanner myInput = null;//read txt doc
		try {
			myInput = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			System.out.println(filename1 + ": Input file can not be found!\nExiting program...");
			System.exit(1);
		}
		System.out.println("File is available");

		ArrayList<Polynomial> pols = new ArrayList<>();// keeping coordinate for polynomials.
		String[] parts=null;// part of line txt
		while(myInput.hasNext()) {
			String line=myInput.nextLine();
			parts=line.split(",");
			//System.out.println(parts.length);
			/**
			 * if parts calls polynomial classes with length of line from doc
			 */
			if(parts.length==2) {
				Polynomial1D p1=new Polynomial1D();
				double a=Double.parseDouble(parts[0].trim());
				p1.setA(a);//keep a
				double b=Double.parseDouble(parts[1].trim());
				p1.setB(b);//keep b
				pols.add(p1);// add to all coordinates to polynomial inheritence class
			}
			else if(parts.length==3) {
				Polynomial2D p2=new Polynomial2D();
				double a=Double.parseDouble(parts[0].trim());
				p2.setA(a);
				double b=Double.parseDouble(parts[1].trim());
				p2.setB(b);
				double c=Double.parseDouble(parts[2].trim());
				p2.setC(c);
				pols.add(p2);
			}
			else {
				Polynomial3D p3=new Polynomial3D();
				double a=Double.parseDouble(parts[0].trim());
				p3.setA(a);
				double b=Double.parseDouble(parts[1].trim());
				p3.setB(b);
				double c=Double.parseDouble(parts[2].trim());
				p3.setC(c);
				double d=Double.parseDouble(parts[3].trim());
				p3.setD(d);
				pols.add(p3);
			}
		}

		/**
		 * -10 to +10 evaluate f(x) for each pols array.
		 */
		for(int i=0;i<pols.size();i++) {
			for(double k=-10;k<10;k+=0.01) {
				pols.get(i).evaluate(k);

			}
			System.out.println(pols.get(i));
			pols.get(i).draw();//draw for each coordinate be point

		}
		/*
		 * to evaluate derivative -10 to +10 put a point
		 */
		for(int i=0;i<pols.size();i++) {
			for(double k=-10;k<10;k+=0.01) {
				pols.get(i).evaluate(k);

			}

			pols.get(i).derivative(-10, 10);
		}


	}






}




