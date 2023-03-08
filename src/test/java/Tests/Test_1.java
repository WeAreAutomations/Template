package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static Main.Login.driver;

public class Test_1 {


    @Parameters({"StartUrlLogin"})
    @Test(testName = "Scrolling 1")
    public void test1(String StartUrlLogin) throws InterruptedException, IOException {

        System.out.println("***  ***");

    }

}


