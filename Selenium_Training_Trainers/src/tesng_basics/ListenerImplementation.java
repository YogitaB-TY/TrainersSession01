package tesng_basics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" method failed");
		//LearningScreenshot.screenshotMethod(null, null);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" method skipped");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On finish method has executed");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" method success");
	}
}
