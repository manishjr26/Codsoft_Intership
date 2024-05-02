package task_One;

import java.util.InputMismatchException;

public class Number_Game
{
	static java.util.Scanner scan=new java.util.Scanner(System.in);
	public static void main(String[] args) 
	{
		play();
		scan.close();
	}
	
	public static void play()
	{
		int count=1;
		while(count<=3)
		{
				try
				{
						System.out.println("\n\t\t\t\t Enter a number b/w 1 to 100 : ");				
						int userNumber=scan.nextInt();
						double number=Math.random()*100;
						int randomNumber=(int)number;
						int checkingForDifference=randomNumber-userNumber; // 27
						System.out.println("\n\t\t\t Random Number : "+randomNumber);
						if(checkingForDifference>0)
						{
							System.out.println("\n\t\t\t\t Your entered number is less than generated number .\n");
							if(checkingForDifference>=10)
							{			
							System.out.println("\n\t\t\t\t Entered number is too less .\n");
							}else
								System.out.println("\n\t\t\t\t Entered number is nearby .\n");
							
						}else if(checkingForDifference<0)
						{
							if(checkingForDifference<=-10)
							{			
							System.out.println("\n\t\t\t\t Entered number is too high .");
							}else
								System.out.println("\n\t\t\t\t Entered number is nearby .");	
						}else 
							System.out.println("\n\t\t\t\t Entered number equals random number .\n");
							count=count-1;
					count++;
				}catch(InputMismatchException e)
				{
					System.err.println("\n\t\t\t\t Input Mis Match. Please enter a valid input. ");
					scan.next();
					if(count<3)
					{
						count=0;
						play();
					}				
				}
		}playAgain();
	}
	
	public static void playAgain()
	{
				System.out.println("\n\t\t\t\t Do you wish to play again : 1  - Yes  \t 2 - No ");
				boolean validInput=false;
				while(!validInput)
				{
						try
						{
							int play=scan.nextInt();
							switch(play)
							{
								case 1:play();
								validInput=true;
								break;
								case 2 : System.out.println( "\t\t\t\t\t\t\t\t Closing the program , Have a nice day . ");
									System.exit(0);
								default : System.err.println("\t\t\t\t\t\t\t Invalid Input, Please Choose proper input.  ");
							}							
						}catch(InputMismatchException e)
						{
							System.err.println("\n\t\t\t\t Input Mis Match. Please enter choose a valid number . ");
							scan.next();
							playAgain();
						}		
				}
	}
}
