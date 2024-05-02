package task_Two;

import java.util.InputMismatchException;

public class Student_Grade_Calculator
{
	static java.util.Scanner scan=new java.util.Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("\n\t\t\t\t Enter User Name : ");
		String userName=scan.nextLine();
		calculateResults(userName);
	}
	
	public static void calculateResults(String userName)
	{
		try
		{
		System.out.println("\n\t\t\t\t Enter the marks in Physiscs :");
		int physcisMarks=scan.nextInt(); // taking physiscs marks 70 
				
		System.out.println("\n\t\t\t\t Enter the marks in Biology :");
		int biologyMarks=scan.nextInt(); // taking biology marks 70 
		
		System.out.println("\n\t\t\t\t Enter the marks in Chemistry :"); // \n\t\t\t\t
		int chemistryMarks=scan.nextInt(); // taking chemistry marks 60 
		
		System.out.println("\n\t\t\t\t Enter the marks in Maths :");
		int mathsMarks=scan.nextInt(); // taking maths marks 50
		
		int totalMarks=physcisMarks+biologyMarks+chemistryMarks+mathsMarks; // 140 +110 = 250 
		
		double avgMarks=totalMarks/4; // 250/4 = 62.5
		String grade=null;
		if(avgMarks>0 && avgMarks<=100)
		{
			if(avgMarks>=90)
			{
				grade="O";
			}else if(avgMarks>=70 && avgMarks<=89)
			{
				grade="A";
			}else if(avgMarks>=51 && avgMarks<=69) 
			{
				grade="B";
			}else if(avgMarks>=41 && avgMarks<=50)
			{
				grade="C";
			}else if(avgMarks==40.0)
			{
				grade="P";
			}else if(avgMarks<40)
			{
				grade="F";
			}
			System.out.println("\n\n\t\t User : \" "+userName+ "\" has secured  marks as follows \n\n\t\t  |----------------------------------------|\n\t\t  | \t       ScoreCard                   |\n\t\t  |----------------------------------------| \n\t\t  |\t Subject \t\t Marks     | \n\t\t  |----------------------------------------| \n\t\t  |\t Physics  \t\t "+physcisMarks+"\t   |  \n\t\t  |\t Chemistry  \t\t "+chemistryMarks+"\t   | \n\t\t  |\t Biology  \t\t "+biologyMarks+"\t   | \n\t\t  |\t Maths  \t\t "+mathsMarks+ "\t   | \n\t\t  |----------------------------------------| \n\t\t  |\t Total Marks  \t\t "+totalMarks+ "\t   | \n\t\t  |\t Grade  \t\t "+grade+" \t   |  \n\t\t  |----------------------------------------|");
			
		}else
			System.err.println("Invalid Details . ");
		}catch(InputMismatchException e)
		{
			System.err.println("\n\t\t\t\t Input Mis Match ");
			System.exit(0);
			calculateResults(userName);
		}
		scan.close();
	}
	
	public static void inputValidation()
	{
		
	}

}
