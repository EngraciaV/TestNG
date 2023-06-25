package class3;

import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementationOfListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("the test case passed");
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("the test case failed");
    }
}
