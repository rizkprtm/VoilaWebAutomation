package com.voila.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandsCategoryMenu extends BasePage {

    public BrandsCategoryMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Search brands']")
    private WebElement inputSearchBrands;

    @FindBy(xpath = "//a[@id='brand-list-22']//p[@id='base']")
    private WebElement brandsSearchResult;

//    @FindBy(xpath = "//input[@id='downshift-338-input']")
//    private WebElement brandsSearchResultSortBtn;

    @FindBy(xpath = "//span[normalize-space()='Lowest Price']")
    private WebElement brandsSearchResultSortLowestPrices;

    @FindBy(xpath = "//div[@id='plp-product-list-27677']//div//div[2]//div[1]//img[1]")
    private WebElement secondItemWallet;

    @FindBy(xpath = "//body/div[@id='__next']/div[@id='voila-ui']/div[@id='base']/div[@id='base']/div[contains(@class,'vds-container ifvo3u0 wovzomn wovzo5a _15r4f4dvt _15r4f4dpf _15r4f4d96 _15r4f4dfk _15kd2weg')]/div[@id='base']/div[@id='base']/div[contains(@class,'vds-container ifvo3u0 wovzomn wovzo5a _15r4f4dvt _15r4f4dpf _15r4f4d96 _15r4f4dfk _15kd2weg')]/div[@id='base']/div[@id='base']/div[1]/div[1]/p[1]")
    private WebElement verifySecondItemPrices;

    @FindBy(xpath = "//div[contains(@class,'vds-container ifvo3u0 wovzomn wovzo5a _15r4f4dvt _15r4f4dpf _15r4f4d96 _15r4f4dfk _15kd2weg')]//span[contains(text(),'Add to Bag')]")
    private WebElement secondItemAddToBagBtn;

    public void enterSearchBrand(String Brands) {
        clear(inputSearchBrands);
        sendKeys(inputSearchBrands,Brands);
    }

    public void selectBrandResult() {
        click(brandsSearchResult);
    }

    public WebElement secondItemWalletElement() {
        return secondItemWallet;
    }

    public void selectSecondItem() {
       click(secondItemWallet);
    }

    public void actualSecondItemPrice() {
        getText(verifySecondItemPrices);
    }

    public void secondItemAddToBag() {
        click(secondItemAddToBagBtn);
    }
}
