package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LandingPage;

public class BaseTest extends DriverManager {
    @BeforeClass
    public void setUps() {
        DriverManager.getDriver();
        driver.get("https://labsqajobs.qaharbor.com/");
        LandingPage landingPage = new LandingPage();
        landingPage.clickCandidateLink();
    }

    @AfterClass
    public static void tearDowns(){
        DriverManager.tearDown();
    }
}
