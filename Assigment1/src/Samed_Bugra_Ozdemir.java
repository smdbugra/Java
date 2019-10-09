import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;
import java.util.Scanner;
/**
 * To find max frequency number from doc.
 * @author Samed Buðra Özdemir 041701002
 * @since  Feb 23, 2019
 */

public class Samed_Bugra_Ozdemir {

	/**
	 * This main called numbers of frequency, readable doc and max number that repeat in frequency array.
	 * @param args Not used
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String numbers1;
		String numbers2;

		numbers1="data1.txt";//to open doc1
		numbers2="data2.txt";//to open doc2
		Scanner in=new Scanner(System.in);
		System.out.println("To find data1.txt frequency write 1 and to find data2.txt frequency write 2");
		int finder=in.nextInt();//Which file users want they will take with input..
		int[] frequency=new int[999];//I put frequency from readFile method.
		frequency=readFile("data"+Integer.toString(finder)+".txt");//to take information from user about input= 1 or 2
		//System.out.println(Arrays.toString(frequency)); I put this to check my arrayList.
		maxRepeatNumber(frequency);//this method will find and give output max frequency.

	}
	/**
	 * This method calculate which numbers repeated in array.
	 * @param frequency We are taking number from frequency array to find max repeat
	 */
	public static void maxRepeatNumber(int[] frequency) {
		int max=0;// This variable keep max repeat from frequency array
		int index=0;// This variable keep which number repeated
		
		for(int i=0;i<frequency.length;i++) {
			if(max<frequency[i]) {
				max=frequency[i];//if frequency[i] bigger than max will be new max number.
				index=i;//Ý number repeated number and equals my index
			}
		}
	System.out.println("Number"+" "+index+", "+max+" "+"times repeated.");//output
	}

	/**
	 * To read numbers from file and put the array this number's frequency 
	 * @param fileName To read file from doc.
	 * @return Which numbers how many times repeated at doc about array
	 * @throws Exception
	 */
	public static int[] readFile(String fileName) throws Exception 
	{ 
		File file=new File(fileName);
		//open text file
		Scanner input=null;

		try {
			input=new Scanner(file);//if find the file

		}
		catch (FileNotFoundException e){
			System.out.println(fileName+"ýnput file can not be found!\n Exiting program");
			System.exit(1);//if program does not find file program closing
		}
		System.out.println("File is available");// give information about program running
		int [] frequency=new int[999];// Created to put frequency numbers
		
		while(input.hasNext()) {
			String line = input.nextLine();//if has next line go on
			String space=line.trim();// To delete spaces.
			int intValue=Integer.parseInt(space);//This changed space string to integer and intValue keep number to put array
			frequency[intValue]++;//Number is putting arrays index to find frequency and increasing this index every same numbers.
		}

		return frequency;

	}


}
