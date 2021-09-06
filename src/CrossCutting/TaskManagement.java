package CrossCutting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TaskManagement 
{

	
	@AfterClass
	public void Aftrcls()
	{
		System.out.println("i am executing last in my class Task management");
	}
	@Parameters({"urltwo","url"})
	@Test
	public void TaskAdd(String UrlTwo,String Url)
	{
		System.out.println("Schedule task generation manualy");
		System.out.println(UrlTwo);
		System.out.println(Url);
	}
	@Parameters({"url"})
	@Test
	public void Taskdelete(String Url)
	{
		System.out.println("Schedule task delete manually");
		System.out.println(Url);
	}
	
	@Test(groups= {"smoke"})
	public void TaskNote()
	{
		System.out.println("Notes creation from from BO");
	}
	
	@Test
	public void Automatictask()
	{
		System.out.println("Automatic task creation from All BO");
	}
	
	@AfterTest
	public void Afterst()
	{
		System.out.println("I am executing After my module Function two");
	}
	
	@BeforeSuite
	public void bfrst()
	{
		System.out.println("i am executing before any method in my suite");
	}
	
	@BeforeClass
	public void Bfrcls()
	{
		System.out.println("i am executing first in my class Task management");
	}
}
