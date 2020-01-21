package Test5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listen implements ITestListener  {
	public static Logger LOGGER=LogManager.getLogger(listen.class);
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test start");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		LOGGER.info("in "+result.getTestClass()+"\t"+result.getMethod().getMethodName()+"succss");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Failure");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Skip");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test success percentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test failed timeout");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On start");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Finish");
	}


}
