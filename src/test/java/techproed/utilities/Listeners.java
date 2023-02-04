package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart-Tum testlerden once bir kere cagrilir : "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish-Tum testlerden sonra bir kere cagrilir : "+context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart-Her bir @Test den once bir kez cagirilir : "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess-Sadece PASS olan testlerden SONRA tek bir kez cagrilir : "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure-Sadece FAIL olan testlerden SONRA tek bir kez cagrilir : "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped-Sadece SKIP(atlanan) testlerden sonra tek bir kez cagrilir : "+result.getName());
    }

}

