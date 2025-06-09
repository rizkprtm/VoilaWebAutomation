package stepDefinitions;

import com.voila.DriverManager.DriverProperties;
import com.voila.PageObject.BrandsCategoryMenu;
import com.voila.PageObject.HomePage;
import com.voila.PageObject.MenCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class PageNavigationSteps {

    private final WebDriver driver = DriverProperties.driver;

    HomePage homePage = new HomePage(driver);

    MenCategoryPage menCategoryPage = new MenCategoryPage(driver);

    BrandsCategoryMenu brandsCategoryMenu = new BrandsCategoryMenu(driver);

    @And("Navigate to profile page")
    public void navigateToProfilePage() {
        homePage.navigateToProfilePage();
    }


    @And("User already on homepage profile as {string} displayed")
    public void userAlreadyOnHomepageProfileAsDisplayed(String profileName) {
        Assert.assertTrue(homePage.verifyOnHomepage().contains(profileName));
    }


    @When("User navigate to men page")
    public void userNavigateToMenPage() {
        homePage.navigateToMenCategory();
    }

    @Then("User navigate to men all item category")
    public void userNavigateToMenAllItemCategory() {
        Actions actions = new Actions(driver);
        actions.moveToElement(menCategoryPage.menCategoryAllItemElement()).perform();
        menCategoryPage.clickAllItemCategory();
    }

    @When("User navigate to brands page")
    public void userNavigateToBrandsPage() {
        homePage.navigateToBrandsCategory();
    }

    @Then("User navigate to balenciaga brands item")
    public void userNavigateToBalenciagaBrandsItem() {
        brandsCategoryMenu.selectBrandResult();
    }

    @When("User navigate to shopping bag page")
    public void userNavigateToShoppingBagPage() {
        homePage.navigateToCartPage();
    }
}
