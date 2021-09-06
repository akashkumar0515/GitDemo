package CrossCutting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DocumentManagement 
{

	
	@AfterSuite
	public void Aftrst()
	{
		System.out.println("i am executing after all method in my Suite");
	}
	
	@BeforeMethod
	public void Bfrmthd()
	{
		System.out.println("I am executing before any method in Document management class");
	}
	
	@AfterMethod
	public void Aftemthd()
	{
		System.out.println("I am executing After any method in Document management class");
	}
	@Test(groups= {"smoke"})
	public void DocIPP()
	{
		System.out.println("Dcouemnt generation through IPP");
	}
	
	@Test
	public void DocBatch()
	{
		System.out.println("Dcouemnt generation through Batch");
	}
	
	@Test
	public void DocCreatecm()
	{
		System.out.println("Dcouemnt generation through Create communication");	
	}
	
	@Test(groups= {"smoke"})
	public void Sepa()
	{
		System.out.println("Sepa Document generation from Direct debit");
	}

	@Test(dataProvider="getdata")
	public void Paymentsch(String username,String password)
	{
		System.out.println("Payment schedule Document generation");
		System.out.println(username + password);
	}
	
	@BeforeTest
	public void Bfrtst()
	{
		System.out.println("I am executing before on my module Function one");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		
		Object [][] data=new Object[3][2];
		data [0][0]="firstusername";
		data [0][1]="firstpassword";
		
		data [1][0]="secondusername";
		data [1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
