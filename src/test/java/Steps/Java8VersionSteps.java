package Steps;

import io.cucumber.java8.En;

public class Java8VersionSteps implements En {
    public Java8VersionSteps() {
        And("^I just need to see how step looks for Cucumber-Java(\\d+)$", (Integer arg0) -> {
            System.out.println("The value from step class is " + arg0);
        });
    }

}
