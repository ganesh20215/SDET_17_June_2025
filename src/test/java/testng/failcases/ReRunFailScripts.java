package testng.failcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailScripts implements IRetryAnalyzer {

    public static int start_value = 0;
    public static int end_value = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (start_value < end_value) {
            start_value++;
            return true;
        }
        return false;
    }
}
