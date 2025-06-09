package stepDefinitions;

import com.voila.DriverManager.DriverProperties;
import com.voila.PageObject.CheckoutPage;
import customUtil.CustomTestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CheckoutSteps {

    private final WebDriver driver = DriverProperties.driver;

    CheckoutPage checkoutPage = new CheckoutPage(driver);

    CustomTestData customData = new CustomTestData();

    JavascriptExecutor executor = (JavascriptExecutor)driver;

    @And("User already on checkout page")
    public void userAlreadyOnCheckoutPage() {
        checkoutPage.verifyCheckoutOnPage();
    }

    @When("User click select address")
    public void userClickSelectAddress() {
        checkoutPage.clickSelectAddress();
    }

    @And("User click add address")
    public void userClickAddAddress() {
        checkoutPage.clickAddAddress();
    }

    @When("User fill address details")
    public void userFillAddressDetails() {
        checkoutPage.checkoutAddUserAddress(
                customData.addressLabel(), customData.recipientName(), customData.PhoneNumberGeneration(),
                customData.postalCode(), customData.addressDetails()
        );
    }

    @Then("User save new address details")
    public void userSaveNewAddressDetails() {
        checkoutPage.clickSaveAddress();
    }

    @And("User select delivery address")
    public void userSelectDeliveryAddress() throws InterruptedException {
        checkoutPage.setSelectedDeliveryAddress();

    }

    @When("User click select shipping service")
    public void userClickSelectShippingService() throws InterruptedException {
        checkoutPage.clickShippingMethod();
    }

    @And("User select shipping service")
    public void userSelectShippingService() {
        checkoutPage.selectShippingService();
    }

    @Then("User confirm shipping service")
    public void userConfirmShippingService() {
        checkoutPage.clickConfirmShippingMethod();
    }

    @When("User select BCA VA payment method")
    public void userClickSelectPaymentMethod() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(checkoutPage.paymentMethodSelectionElement()).perform();
        checkoutPage.selectPaymentMethod();
    }

    @Then("User confirm payment method")
    public void userConfirmPaymentMethod() {
        checkoutPage.clickConfirmPaymentMethod();
    }

    @And("Verify sub total item price")
    public void verifySubTotalItemPrice() {
        Float actualSubTotalItemPrice;
        Float subTotalItemPrice;
        try {
            subTotalItemPrice = (Float.parseFloat(checkoutPage.actualCheckoutFirstItemPrice()) + Float.parseFloat(checkoutPage.actualCheckoutSecondItemPrice()));
            actualSubTotalItemPrice = (Float.parseFloat(checkoutPage.actualCheckoutSubTotalItemPrice()));
        } catch (NumberFormatException nfe) {
            return;
        }
        Assert.assertEquals(actualSubTotalItemPrice, subTotalItemPrice);
    }

    @And("Verify total item price with protection fee")
    public void verifyTotalItemPriceWithProtectionFee() {
        Float actualTotalItemPrice;
        Float totalItemPrice;
        try {
            totalItemPrice = (Float.parseFloat(checkoutPage.actualProtectionFee()) + Float.parseFloat(checkoutPage.actualCheckoutSubTotalItemPrice()));
            actualTotalItemPrice = (Float.parseFloat(checkoutPage.actualCheckoutTotalItemPrice()));
        } catch (NumberFormatException nfe) {
            return;
        }
        Assert.assertEquals(actualTotalItemPrice, totalItemPrice);
    }

    @Then("User click place order")
    public void userClickPlaceOrder() {
        checkoutPage.finishCheckout();
    }

}
