package CrossCutting;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Finance 
{
	@Test
	public void FinaceCC()
	{
		System.out.println("payment through Credit card");
	}
	@Parameters({"urlone"})
	@Test
	public void FinanceDD(String UrlOne)
	{
		System.out.println("payment through Direct Debit");
		System.out.println(UrlOne);
	}
	
	@Test(groups= {"smoke"})
	public void FinancePS()
	{
		System.out.println("payment through Payment slip");	
	}
	
	@Test
	public void CCrejection()
	{
		System.out.println("Credit card rejection letter");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"smoke"})
	public void CCSucess()
	{
		System.out.println("Credit card sucess letter");
	}
	
	@AfterTest
	public void Aftrtst()
	{
		System.out.println("I am executing after my module function one");
	}

}
