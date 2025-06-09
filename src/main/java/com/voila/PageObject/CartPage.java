package com.voila.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/p[1]")
    private WebElement shoppingBagPage;

    @FindBy(xpath = "//p[normalize-space()='Christian Dior']")
    private WebElement firstItemBrand;

    @FindBy(xpath = "//p[normalize-space()='Balenciaga']")
    private WebElement secondItemBrand;

    @FindBy(xpath = "//div[contains(@data-test-id,'CT_Component_ctaShowHideSubtotal')]//p[contains(text(),'Rp24.500.000')]")
    private WebElement cartSubTotalItem;

    @FindBy(xpath = "//button[normalize-space()='Checkout (2)']")
    private WebElement cartCheckoutBtn;

    public void verifyShoppingBagPage() {
        isElementDisplayed(shoppingBagPage);
    }

    public String actualFirstItemBrand() {
        return getText(firstItemBrand);
    }

    public String actualSecondItemBrand() {
        return getText(secondItemBrand);
    }

    public String actualCartSubTotalItemPrice() {
        return getText(cartSubTotalItem);
    }

    public void cartCheckoutItem() {
        click(cartCheckoutBtn);
    }

}
