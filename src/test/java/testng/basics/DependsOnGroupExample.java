package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = "smoke")
    public void t1(){
        Assert.assertTrue(false);
        System.out.println("t1");
    }

    @Test
    public void t2(){
        System.out.println("t2");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void t3(){
        System.out.println("t3");
    }
}
