package UtilityKite;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("Welcome TC passed and TC name is" + result.getName(),true);
}
	@Override
		public void onTestFailure(ITestResult result) {
		
		Reporter.log("TC is Failed and TC name is"+ result.getName(),true);
		try {
			Utility.TakeSshot(result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		}

	}


