package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.failcases.ReRunFailScripts;

public class PriorityExample {

    @Test(priority = 2)
    public void testCaseM(){
        System.out.println("Test Case M");
    }

    @Test(priority = 'A')
    public void testCaseZ(){
        Assert.assertTrue(false);
        System.out.println("Test Case Z");
    }

    @Test(priority = -4)
    public void testCaseK(){
        System.out.println("Test Case K");
    }

    @Test(priority = 'z')
    public void testCaseY(){
        System.out.println("Test Case Y");
    }

    @Test(priority = 5)
    public void testCaseA(){
        System.out.println("Test Case A");
    }
}
