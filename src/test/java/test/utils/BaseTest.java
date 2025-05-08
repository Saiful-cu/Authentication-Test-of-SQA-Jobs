package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LandingPage;


public class BaseTest extends utils.DriverManager {
    @BeforeClass
    public void setUps() {
        utils.DriverManager.getDriver();
        driver.get("https://labsqajobs.qaharbor.com/");
        LandingPage landingPage = new LandingPage();
        landingPage.clickCandidateLink();
    }

    @AfterClass
    public static void tearDowns(){
        utils.DriverManager.tearDown();
    }
}
