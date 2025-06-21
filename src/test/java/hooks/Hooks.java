package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;

public class Hooks {
    @Before
    public static void setUp() {
        DriverManager.getDriver();
        DriverManager.driver.get("https://labsqajobs.qaharbor.com/find-jobs/");
    }

    @After
    public static void tearDown() {
        DriverManager.tearDown();
    }
}
