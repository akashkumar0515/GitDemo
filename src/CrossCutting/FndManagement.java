package CrossCutting;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FndManagement 
{
	@Test(dependsOnMethods={"FndPersonBO"})
	public void FndContractBO()
	{
		System.out.println("Document operation on Contract BO");
	}
	
	@Test
	public void FndClaimBO()
	{
		System.out.println("Document operation on claim BO");
	}
	@Test(timeOut=4000)
	public void FndPersonBO()
	{
		System.out.println("Document operation on person BO");
	}
	
	@Test(enabled=false)
	public void Move()
	{
		System.out.println("Move docuemnt from one BO to another BO");
	}
	
	@Test(groups= {"smoke"})
	public void Delete()
	{
		System.out.println("Delete docuemnt from All BO");
	}
	
	@BeforeTest
	public void Befotst()
	{
		System.out.println("I am executing before in my module function two");
	}

}
