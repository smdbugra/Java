import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String filename="world.txt";

		StdDraw.enableDoubleBuffering();
		//int canvas_width=800;  //area size width
		//int canvas_height=800;
		//StdDraw.setCanvasSize(canvas_width,canvas_height);
		int worldSize=40;
		StdDraw.setXscale(0,worldSize);
		StdDraw.setYscale(0,worldSize);
		StdDraw.show();

		File myFile=new File("world.txt");
		Scanner myInput=null;
		try {
			myInput=new Scanner(myFile);

		} catch(FileNotFoundException e) {
			System.out.println("world.txt: Input file can not be found!\nExiting Program...");
			System.exit(1);

		}
		System.out.println("File is available");
		int[][] world=new int[40][40];
		int index=39;
		int i=0;

		while(myInput.hasNext()){
			String line1 = myInput.nextLine();
			//String line2 = myInput.nextLine();
			String[] parts =line1.split(";");

			for(i=39;i>=0;i--) {
				//if(parts[i]!=null) {
				world[i][index]=Integer.parseInt(parts[i].trim());
				//System.out.println(world[index][i]);
			}
			index--;
		}
		//System.out.println(world[39][39]);


		for(int k=0;k<world.length;k++) {
			for(int j=0;j<world.length;j++) {

			}
		}	
		for(int k1=0;k1<world.length;k1++) {
			for(int j=0;j<world.length;j++) {
				if(world[k1][j]==1) {

					StdDraw.setPenColor(StdDraw.GRAY);
					StdDraw.setPenRadius(0.05);
					StdDraw.filledSquare(k1+0.5, j+0.5, 0.5);
				}
				else if(world[k1][j]==0) {

					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.setPenRadius(0.05);
					StdDraw.filledSquare(k1+0.5, j+0.5, 0.5);
				}
				else if(world[k1][j]==2) {

					StdDraw.setPenColor(StdDraw.BLUE);
					StdDraw.setPenRadius(0.05);
					StdDraw.filledSquare(k1+0.5, j+0.5, 0.5);
				}
				else if(world[k1][j]==3) {
					StdDraw.setPenColor(StdDraw.MAGENTA);
					StdDraw.setPenRadius(0.05);
					StdDraw.filledSquare(k1+0.5, j+0.5, 0.5);
				}

			}
			StdDraw.show();
		}

		Cat c=new Cat(4,4,StdDraw.ORANGE);

		c.setFoodCount(0);
		//System.out.println(c.getFoodCount());
		Random r=new Random();
		int temp=c.getFoodCount();
		while(temp<20) {
			int direction = r.nextInt(4);
			if ((direction == 0) && (c.getY() > 1)) {
					
				c.move(direction);
				
			}
			if ((direction == 1) && (c.getX() > 1)) {
				
				c.move(direction);
				
			}
			if ((direction == 2) && (c.getY() < worldSize-2)) {
				
				c.move(direction);
				
			}
			if ((direction == 3) && (c.getX() < worldSize-2)) {
				
				c.move(direction);
				
			}
			c.draw();
			StdDraw.pause(10);
		}


	}
}


