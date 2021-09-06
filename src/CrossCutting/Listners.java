package CrossCutting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
	
		System.out.println("My test execution fail in Test case " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
	System.out.println("My test execution skipped");	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	@Override
	public void onStart(ITestContext context)
	{
	
			
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}

}
