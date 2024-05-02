package task_Three;

import java.util.InputMismatchException;

public class Bank_Account implements ATM
{
	static java.util.Scanner scan=new java.util.Scanner(System.in);
	double balance=40000.0;  // setting dummy balance
	public static void main(String[] args) 
	{
		System.out.println("\n\t\t\t\t Welcoming to Banking. ");
		try
		{
			System.out.println("\n\t\t Choose the option \t 1- With Drawing \t 2 -  Deposting \t 3 - Check Balanace ");
			int userChoice=scan.nextInt();
			
			Bank_Account ba=new Bank_Account();
			switch(userChoice)
			{
			case 1: ba.withdrawing();
				break;
			case 2: ba.depositing();
				break;
			case 3: ba.checkBalance();
				break;
			default: System.err.println("\n\t\t\t Invalid Choice . ");
			}
		}catch(InputMismatchException e)
		{
			System.err.println("\n\t\t\t\t Input Mis Match ");
			System.exit(0);
		}
		
	}
	@Override
	public void withdrawing() 
	{
		System.out.println("\t\t Enter the amount you wish to withdraw : ");
		double amountWithDraw=scan.nextDouble();
		if((amountWithDraw+1000)<balance) // checking if user entered input is less than balance and minimum deposit is 1000 so adding it with 
		{
			System.out.println("\n\t\t With Draw Possible , Amount Withdrawn : "+amountWithDraw+ " Remaining Balance : "+(balance-amountWithDraw));
			System.out.println("\n\t\t Thank You , Have a nice day . "); tryAgain();
			
		}else
			System.out.println("\n\t\t  Entered withdawn amount exceeds balance , so transcation not possible .");
		tryAgain();
	}

	@Override
	public void depositing() 
	{
		System.out.println("\n\t\t Enter the amount you wish to depsoit : ");
		double amountDepsoit=scan.nextDouble();
		if(amountDepsoit>0)
		{
			System.out.println("\n\t\t Deposit Possible , you have deposited amount : "+amountDepsoit+ " Avaiable Balance : "+(balance+amountDepsoit));
		}else
			System.out.println(" Deposit Not  Possible . ");
		tryAgain();
	}

	@Override
	public void checkBalance() 
	{
		System.out.println(" Your Balance is : "+balance);
		tryAgain();
	}
	
	public static void tryAgain()
	{
		System.out.println(" Do you wish to try again : ");
		try
		{
			System.out.println(" 1 - Yes , 2 - No ");
			int depsoitChoice=scan.nextInt();
			if(depsoitChoice==1)
			{
				main(null);
			}else if(depsoitChoice==2)
			{
				System.out.println(" Have a nice day ."); System.exit(0);
			}else 
				System.exit(0);
		}catch(InputMismatchException e)
		{
			System.err.println("\n\t\t\t\t Input Mis Match ");
			System.exit(0);
		}
	}
	
}
