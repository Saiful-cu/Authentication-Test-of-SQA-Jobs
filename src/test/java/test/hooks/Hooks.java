package test.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import test.utils.DriverManager;
import test.utils.EnvDataReader;
import utils.EnvDataReader;

public class Hooks {
    @Before
    public void setUp() {
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get(EnvDataReader.getEnvData().getHost());
    }

    @After
    public void tearDown() {
        DriverManager.tearDown();
    }
}