package Steps;

import Base.BaseUtil;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {
        System.out.println("Opening the browser: Firefox");
        System.setProperty("webdriver.gecko.driver", "/Users/xixiaomin/Downloads/geckodriver");
        base.driver = new FirefoxDriver();
    }

    @After
    public void TearDownTest(Scenario scenario){
        if(scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser: Mock");
    }
}
