package stepDefinitions;

import com.voila.DriverManager.DriverProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before
    public void openBrowser() throws IOException {
        DriverProperties.start_session();
    }
    @After
    public void closeBrowser() {
        DriverProperties.close_session();
    }
}
