package stepDefinitions;

import com.voila.DriverManager.DriverProperties;
import com.voila.PageObject.BrandsCategoryMenu;
import com.voila.PageObject.MenCategoryPage;
import customUtil.CustomTestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchAndFilterItemSteps {

    private final WebDriver driver = DriverProperties.driver;

    MenCategoryPage menCategoryPage = new MenCategoryPage(driver);
    
    BrandsCategoryMenu brandsCategoryMenu = new BrandsCategoryMenu(driver);

    CustomTestData customTestData = new CustomTestData();

    @When("User click sort item by highest price")
    public void userClickSortItemByHighestPrice() {
        menCategoryPage.setSortHighestPricesItem();
    }

    @When("User click sort item by lowest price")
    public void userClickSortItemByLowestPrice() {
        menCategoryPage.setSortLowestPricesItem();
    }

    @And("User set filter ready stock item")
    public void userSetFilterReadyStockItem() {
        menCategoryPage.filterItemReadyStock();
    }

    @And("User set filter shoes item")
    public void userSetFilterShoesItem() {
        menCategoryPage.filterItemShoes();
    }

    @And("User search {string} brands")
    public void userSearchBrands(String selectedBrands) {
        brandsCategoryMenu.enterSearchBrand(selectedBrands);
    }

}
