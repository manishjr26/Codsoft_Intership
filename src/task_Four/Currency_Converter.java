package task_Four;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;

import javax.net.ssl.HttpsURLConnection;

public class Currency_Converter 
{
	static java.util.Scanner scan=new java.util.Scanner(System.in);
	static String targetCurrency=null,originalCurrency=null;
	public static void main(String[] args)
	{
		System.out.println("\n\n \t\t\t\t\t\t\t\" Welocome to Currency Converter \" \n\t\t\t\t\t\t\t ---------------------------------- ");
		System.out.println("\n\t\t Choose the Original Currency \n \t 1  - Rupee \t\t\t\t 2  - Euro (EUR) \n\t 3  - Japanese Yen (JPY) \t\t 4  - British Pound Sterling (GBP) \n\t 5  - Australian Dollar (AUD) \t\t 6  - Canadian Dollar (CAD) \n\t 7  - Swiss Franc (CHF) \t\t 8  - Chinese Yuan Renminbi (CNY) \n\t 9  - Swedish Krona (SEK) \t\t 10 - New Zealand Dollar (NZD) \n\t 11 - Singapore Dollar (SGD) \t\t 12 - United Arab Emirates Dirham (AED)       ");
		try
		{
			int originalChoice=scan.nextInt();
			
			switch(originalChoice)
			{
			case 1: originalCurrency="Rupee";
				break;
			case 2: originalCurrency="Euro";
				break;
			case 3: originalCurrency="Japanese Yen";
				break;
			case 4: originalCurrency="British Pound Sterling";
				break;
			case 5: originalCurrency="Australian Dollar";
				break;
			case 6: originalCurrency="Canadian Dollar";
				break;
			case 7: originalCurrency="Swiss Franc";
				break;
			case 8: originalCurrency="Chinese Yuan Renminbi";
				break;
			case 9: originalCurrency="Swedish Krona";
				break;
			case 10: originalCurrency="New Zealand Dollar";
				break;
			case 11: originalCurrency="Singapore Dollar";
				break;
			case 12: originalCurrency="United Arab Emirates Dirham";
				break;
			default: System.err.println("Invalid Details . "); main(null);
			}
		}catch(InputMismatchException e)
		{
			System.err.println("\n\t\t\t\t Input Mis Match ");
			System.exit(0);				
		}
		
		System.out.println("\n\t\t Target Currency Selection :  \n \t 1  - Rupee \t\t\t\t 2  - Euro (EUR) \n\t 3  - Japanese Yen (JPY) \t\t 4  - British Pound Sterling (GBP) \n\t 5  - Australian Dollar (AUD) \t\t 6  - Canadian Dollar (CAD) \n\t 7  - Swiss Franc (CHF) \t\t 8  - Chinese Yuan Renminbi (CNY) \n\t 9  - Swedish Krona (SEK) \t\t 10 - New Zealand Dollar (NZD) \n\t 11 - Singapore Dollar (SGD) \t\t 12 - United Arab Emirates Dirham (AED)       ");
		try
		{
			int targetChoice=scan.nextInt();
			
			switch(targetChoice)
			{
			case 1: targetCurrency="Rupee";
				break;
			case 2: targetCurrency="Euro";
				break;
			case 3: targetCurrency="Japanese Yen";
				break;
			case 4: targetCurrency="British Pound Sterling";
				break;
			case 5: targetCurrency="Australian Dollar";
				break;
			case 6: targetCurrency="Canadian Dollar";
				break;
			case 7: targetCurrency="Swiss Franc";
				break;
			case 8: targetCurrency="Chinese Yuan Renminbi";
				break;
			case 9: targetCurrency="Swedish Krona";
				break;
			case 10: targetCurrency="New Zealand Dollar";
				break;
			case 11: targetCurrency="Singapore Dollar";
				break;
			case 12: targetCurrency="United Arab Emirates Dirham";
				break;
			default: System.err.println("Invalid Details . "); main(null);
			} 
		}catch(InputMismatchException e)
		{
			System.err.println("\n\t\t\t\t Input Mis Match ");
			System.exit(0);				
		}
		converting(originalCurrency,targetCurrency);
		
	}
	
	public static void converting(String originalCurrency,String targetCurrency) 
	{
		if(originalCurrency.equals(targetCurrency))
		{
			System.out.println("Both the currencies can't be same . ");
		}else
		{
			System.out.println("Enter the amount :");
			double amount=scan.nextDouble();
			String url="https://api.currencyapi.com/v3/latest?apikey="+targetCurrency+"&symbol"+originalCurrency+"cur_live_vBXuOGcYBVYZnIP31PI56vooWVBp1QCCp3cvRSvO";
			try 
			{
				URL ul=new URL(url);
				HttpsURLConnection connection=(HttpsURLConnection)ul.openConnection();
				
				System.out.println("\n Your Base Currency was :\" "+originalCurrency+ "\" \t You insited to convert it : \" "+targetCurrency+ "\" \n You Entered Amount is : "+amount+" \t After Converting Currency : ");
				
				
			} catch (MalformedURLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

