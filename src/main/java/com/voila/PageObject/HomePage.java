package com.voila.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)")
    private WebElement profileName;

    @FindBy(xpath = "//a[@href='/account/my-profile']//div[@id='base']")
    private WebElement profileBtn;

    @FindBy(xpath = "//a[normalize-space()='Men']")
    private WebElement menCategoryMenu;

    @FindBy(xpath = "//a[normalize-space()='Brands']")
    private WebElement brandsCategoryMenu;

    @FindBy(xpath = "//div[@data-test-id='CT_Component_CartMenu']")
    private WebElement cartMenu;

    public String verifyOnHomepage() {
        isElementDisplayed(profileName);
        return getText(profileName);
    }

    public void navigateToProfilePage() {
        isElementDisplayed(profileBtn);
        click(profileBtn);
    }

    public void navigateToMenCategory() {
        click(menCategoryMenu);
    }

    public void navigateToBrandsCategory() {
        click(brandsCategoryMenu);
    }

    public void navigateToCartPage() {
        click(cartMenu);
    }

}
