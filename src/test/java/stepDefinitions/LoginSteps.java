package stepDefinitions;

import com.voila.DriverManager.DriverProperties;
import com.voila.PageObject.HomePage;
import com.voila.PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {
    private final WebDriver driver = DriverProperties.driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("User already in the Voila website")
    public void userAlreadyInTheVoilaWebsite(){
        loginPage.verifyOnHomePage();
    }

    @And("User click sign in from homepage")
    public void userClickSignInFromHomepage() {
        loginPage.clickHomePageSignInBtn();
    }

    @When("User input valid email as {string}")
    public void userInputValidEmailAs(String email) {
        loginPage.enterEmail(email);
    }

    @And("User input valid password as {string}")
    public void userInputValidPasswordAs(String password) {
        loginPage.enterPassword(password);
    }

    @Then("User click sign in")
    public void userClickSignIn() {
        loginPage.clickSubmitSignInBtn();
    }

    @Then("User logout from Voila dashboard")
    public void userLogoutFromVoilaDashboard() {
        loginPage.clickSignOutBtn();
    }

    @When("User input {string} as email {string} as password")
    public void userInputAsEmailAsPassword(String email, String password) {
        loginPage.loginUser(email,password);
    }

    @And("User get {string} as error message")
    public void userGetAsErrorMessage(String errorMsg) {
        Assert.assertEquals(loginPage.getErrMsg(),errorMsg);
    }

}
