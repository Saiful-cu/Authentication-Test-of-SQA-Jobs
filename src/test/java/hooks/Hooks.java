package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;

public class Hooks {
    @Before
    public void setUp() {
        DriverManager.getDriver();
        DriverManager.driver.get("https://labsqajobs.qaharbor.com/");
    }

    @After
    public void tearDown() {
        DriverManager.tearDown();
    }
}