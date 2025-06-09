package com.voila.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenCategoryPage extends BasePage {

    public MenCategoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'jbnkvnp')]")
    private WebElement sortBtn;

    @FindBy(xpath = "//span[normalize-space()='Highest Price']")
    private WebElement sortHighestPrices;

    @FindBy(xpath = "//span[normalize-space()='Lowest Price']")
    private WebElement sortLowestPrices;

    @FindBy(css = "a[href='/gender/men-616']")
    private WebElement menCategoryAllItem;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[4]/div/div[3]/div/div/div[1]/div[3]/div[1]/div[3]/div[1]/div/div/div/div/div[1]/button")
    private WebElement menCategoryReadyStockFilter;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[4]/div/div[3]/div/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div/div/div/div[2]/button")
    private WebElement menCategoryShoesFilter;

    @FindBy(xpath = "//div[@id='plp-product-list-37725']//div//div[2]//div[1]//img[1]")
    private WebElement firstItemShoes;

    @FindBy(xpath = "//body/div[@id='__next']/div[@id='voila-ui']/div[@id='base']/div[@id='base']/div[contains(@class,'vds-container ifvo3u0 wovzomn wovzo5a _15r4f4dvt _15r4f4dpf _15r4f4d96 _15r4f4dfk _15kd2weg')]/div[@id='base']/div[@id='base']/div[contains(@class,'vds-container ifvo3u0 wovzomn wovzo5a _15r4f4dvt _15r4f4dpf _15r4f4d96 _15r4f4dfk _15kd2weg')]/div[@id='base']/div[1]/div[1]/div[1]/p[1]")
    private WebElement verifyFirstItemPrice;

    @FindBy(xpath = "//body//div[@id='__next']//div[@id='base']//div[@id='base']//div[@id='base']//div[@id='base']//div[@id='base']//div[@id='base']//div[@id='base']//div[@id='base']//div[3]//p[1]")
    private WebElement firstItemSize42CheckBox;

    @FindBy(xpath = "//button[@data-test-id='CT-add-to-bag-desktop']//span[contains(text(),'Add to Bag')]")
    private WebElement firstItemAddToBagBtn;


    public WebElement menCategoryAllItemElement() {
        return menCategoryAllItem;
    }
    public void clickAllItemCategory() {
        click(menCategoryAllItem);
    }
    public void sortItem() {
        click(sortBtn);
    }
    public void sortHighestPrice() {
        click(sortHighestPrices);
    }

    public void setSortHighestPricesItem() {
        sortItem();
        sortHighestPrice();
    }

    public void sortLowestPrice() {
        click(sortLowestPrices);
    }

    public void setSortLowestPricesItem() {
        sortItem();
        sortLowestPrice();
    }

    public void filterItemReadyStock() {
        menCategoryReadyStockFilter.isSelected();
        click(menCategoryReadyStockFilter);
    }

    public void filterItemShoes() {
        menCategoryShoesFilter.isSelected();
       click(menCategoryShoesFilter);
    }

    public WebElement firstItemShoesElement() {
        return firstItemShoes;
    }
    public void selectFirstItem() {
       click(firstItemShoes);
    }

    public void actualFirstItemPrice() {
        getText(verifyFirstItemPrice);
    }

    public void selectUserSize() {
        click(firstItemSize42CheckBox);
    }

    public void firstItemAddToBag() {
        click(firstItemAddToBagBtn);
    }
}
