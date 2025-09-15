package testng.basics;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 10000, invocationTimeOut = 100)
    public void testExample(){
        System.out.println("Test Example..");
    }
}
