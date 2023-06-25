package class3;

import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerABC implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("success");
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("fail");
    }
}
