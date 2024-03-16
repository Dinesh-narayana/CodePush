package Seleleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Seleleniumproject.pageobjects.Homepage;
import Seleleniumproject.pageobjects.signinpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalonetest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority=0)
    public void signIn() throws InterruptedException {
        signinpage signInPage = new signinpage(driver);
        signInPage.GoTo();
        signInPage.LogInPage("7989503851", "1234567");
        Thread.sleep(5000);
    }

    @Test(priority=1)
    public void subscribe() {
        Homepage home = new Homepage(driver);
        home.menus();
    }

    //@AfterClass
    //public void tearDown() {
        ////if (driver != null) {
            //driver.quit();
       // }
   // }
}