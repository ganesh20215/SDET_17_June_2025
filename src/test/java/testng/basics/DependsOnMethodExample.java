package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("verify login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePageDashboard(){
        System.out.println("verify Home Page Dashboard");
    }

    @Test(groups = {"smoke"})
    public void verifyAccountCreation(){
        System.out.println("verify Account Creation..");
    }

    @Test
    public void verifyAccount2(){
        System.out.println("verify Account Creation 2..");
    }

    @Test(enabled = false)
    public void verifyAccount3(){
        System.out.println("verify Account Creation 3..");
    }

}
