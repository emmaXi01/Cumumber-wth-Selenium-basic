package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to the Login page")
    public void iNavigateToTheLoginPage() {
        System.out.println("Navigate Login Page");
        System.out.println(base.driver);
        base.driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

//    @And("I enter the username as {string} and password as {string}")
//    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {
//        System.out.println("Username is " + username + " and Password is " + password);
//
//    }
    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable dataTable) {
        /**
         * use info.cukes dependency
         */
//        List<User> users = dataTable.asList(User.class);
//        List<User> users = dataTable.asList(String.class);
//        LoginPage page = new LoginPage(base.driver);
//        for(User user : users) {
////            base.driver.findElement(By.name("UserName")).sendKeys(user.getUsername());
////            base.driver.findElement(By.name("Password")).sendKeys(user.getPassword());
//            //page object model
//            page.Login(user.getUsername(), user.getPassword());
//
//        }
        /**
         * cucumber 6
         */
        List<List<String>> users = dataTable.asLists(String.class);
        LoginPage page = new LoginPage(base.driver);
       for(List<String> userList: users) {
           User user = new User(userList.get(0), userList.get(1));
           page.Login(user.getUsername(), user.getPassword());
       }
    }

    @And("I click login button")
    public void iClickLoginButton() {

//        base.driver.findElement(By.name("Login")).submit();
        LoginPage page = new LoginPage(base.driver);
        page.clickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
//        Assert.assertTrue(base.driver.findElement(By.id("Initial")).isDisplayed()); //time sync problem
        WebDriverWait wait = new WebDriverWait(base.driver, 10);// 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Initial")));

        boolean res = base.driver.findElement(By.id("Initial")).isDisplayed();
        Assert.assertEquals("Is not displayed", res, true);
    }

    @And("I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }



//    @And("^I enter the users email address as Email:([^\"]*)$")
//    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransformation.class) String email) {
//        System.out.println("The email adddress is " + email);
//
//    }
//
//    @And("^I verify the count of my salary digits for Rs (\\d+)$")
//    public void iVerifyTheCountOfMySalaryDigitsForRs(@Transform(SalaryCountTransformer.class) int salary) {
//        System.out.println("My salary digits count is " + salary);
//    }
}
