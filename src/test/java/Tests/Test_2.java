package Tests;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import static Main.Login.driver;

public class Test_2 {



    @Parameters({"StartUrlLogin"})
    @Test(testName = "")
    public void test3(String StartUrlLogin) throws InterruptedException, IOException {

        System.out.println("***  ***");

    }
}


