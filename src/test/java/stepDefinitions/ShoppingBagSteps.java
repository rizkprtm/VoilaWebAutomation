package stepDefinitions;

import com.voila.DriverManager.DriverProperties;
import com.voila.PageObject.CartPage;
import com.voila.PageObject.MenCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ShoppingBagSteps {

    private final WebDriver driver = DriverProperties.driver;

    CartPage cartPage = new CartPage(driver);


    @And("Verify user already on shopping bag page")
    public void verifyUserAlreadyOnShoppingBagPage() {
        cartPage.verifyShoppingBagPage();
    }

    @And("Verify first item brand as {string} and second item brand as {string}")
    public void verifyFirstItemBrandAsAndSecondItemBrandAs(String firstItemBrand, String secondItemBrand) {
        String firstItemBrandResult = cartPage.actualFirstItemBrand();
        String secondItemBrandResult = cartPage.actualSecondItemBrand();
        Assert.assertEquals(firstItemBrandResult,firstItemBrand);
        Assert.assertEquals(secondItemBrandResult, secondItemBrand);
    }


    @And("Verify multiple item sub total price")
    public void verifyMultipleItemSubTotalPrice() {
        cartPage.actualCartSubTotalItemPrice();
    }

    @Then("User click checkout from shopping bag")
    public void userClickCheckoutFromShoppingBag() {
        cartPage.cartCheckoutItem();
    }
}
