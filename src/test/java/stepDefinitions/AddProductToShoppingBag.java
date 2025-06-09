package stepDefinitions;

import com.voila.DriverManager.DriverProperties;
import com.voila.PageObject.BrandsCategoryMenu;
import com.voila.PageObject.MenCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AddProductToShoppingBag {

    private final WebDriver driver = DriverProperties.driver;

    MenCategoryPage menCategoryPage = new MenCategoryPage(driver);

    BrandsCategoryMenu brandsCategoryMenu = new BrandsCategoryMenu(driver);

//--AddingFirstItemToShoppingBag
    @Then("User select filtered first item shoes")
    public void userSelectFilteredFirstItemShoes() {
        Actions actions = new Actions(driver);
        actions.moveToElement(menCategoryPage.firstItemShoesElement()).perform();
        menCategoryPage.selectFirstItem();
    }
    @And("Verify first item price")
    public void verifyFirstItemPrice() {
        menCategoryPage.actualFirstItemPrice();
    }

    @And("User select size")
    public void userSelectSize() {
        menCategoryPage.selectUserSize();
    }

    @Then("User add first item to shopping bag")
    public void userAddFirstItemToShoppingBag() {
        menCategoryPage.firstItemAddToBag();
    }

    //--AddingSecondItemToShoppingBag
    @Then("User select second item wallet")
    public void userSelectSecondItemWallet() {
        Actions actions = new Actions(driver);
        actions.moveToElement(brandsCategoryMenu.secondItemWalletElement()).perform();
        brandsCategoryMenu.selectSecondItem();
    }

    @And("Verify second item price")
    public void verifySecondItemPrice() {
        brandsCategoryMenu.actualSecondItemPrice();
    }

    @Then("User add second item to shopping bag")
    public void userAddSecondItemToShoppingBag() {
        brandsCategoryMenu.secondItemAddToBag();
    }
}
