package stepDefinitions;

import com.voila.DriverManager.DriverProperties;
import com.voila.PageObject.BrandsCategoryMenu;
import com.voila.PageObject.MenCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class FilterItemSteps {

    private final WebDriver driver = DriverProperties.driver;

    MenCategoryPage menCategoryPage = new MenCategoryPage(driver);
    
    BrandsCategoryMenu brandsCategoryMenu = new BrandsCategoryMenu(driver);

    @When("User click sort item by {string}")
    public void userClickSortItemBy(String arg0) {
    }

    @And("User set filter ready stock item")
    public void userSetFilterReadyStockItem() {
        
    }

    @And("User set filter shoes item")
    public void userSetFilterShoesItem() {
    }
}
