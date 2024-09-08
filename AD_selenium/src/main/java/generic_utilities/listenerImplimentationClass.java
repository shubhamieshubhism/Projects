package generic_utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import genericUtilities.BaseClass;

public class listenerImplimentationClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String testScriptName = result.getMethod().getMethodName();
		System.out.println(testScriptName + "==test Script execution started==");
		test = report.createTest(testScriptName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String testScriptName = result.getMethod().getMethodName();
		System.out.println(testScriptName + "==passed==");
		test.log(Status.PASS, testScriptName + "==passed==");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String testScriptName = result.getMethod().getMethodName();
		System.out.println(testScriptName + "==failed==");
		System.out.println(result.getThrowable());
		test.log(Status.FAIL, testScriptName + "==failed==");
		String ScreenShortName = testScriptName + new Javautility().getRandomNumber();
		WebDriverUtility w = new WebDriverUtility();
		try {
			w.captureScreenShot(BaseClass.sdriver, ScreenShortName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String testScriptName = result.getMethod().getMethodName();
		System.out.println(testScriptName + "==skipped==");
		System.out.println(result.getThrowable());
		test.log(Status.SKIP, testScriptName + "==skipped==");
		test.log(Status.INFO, result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("==suite execution started==");
		ExtentSparkReporter html = new ExtentSparkReporter(
				".\\ExtentReport\\report-" + new Javautility().getSystemDate() + ".html");
		html.config().setTheme(Theme.DARK);
		html.config().setDocumentTitle("Execution Report");
		html.config().setReportName("Vtiger Execution Report");
		report = new ExtentReports();
		report.attachReporter(html);
		report.setSystemInfo("Base Browser", "chrome");
		report.setSystemInfo("base platform", "windows");
		report.setSystemInfo("Base environment", "Testing");
		report.setSystemInfo("Reporter", "shubham");

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("==suite execution finished==");
		report.flush();
	}

}
