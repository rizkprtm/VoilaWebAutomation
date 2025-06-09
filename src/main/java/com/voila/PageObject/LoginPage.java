package com.voila.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "img[alt='voila logo'][fetchpriority='high'][width='91']")
    private WebElement homePageLogo;
    @FindBy(xpath = "//*[@id=\"base\"]/button[1]")
    private WebElement homePageSignInBtn;
    @FindBy(xpath = "//input[@name='identifier']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitSignInBtn;
    @FindBy(xpath = "//div[@class='_7q2fqh0 _7q2fqh4']//div[@id='base']//div[@id='base']//div[@id='base']//div[@id='base']")
    private WebElement incorrectPasswordMsg;
    @FindBy(xpath = "//body/div[@id='__next']/div[@id='voila-ui']/div[@id='base']/div[@id='base']/div[@id='base']/div[@id='base']/div[@id='base']/div[@id='base']/div[@id='base']/div[@id='base']/div[2]/div[1]/p[1]")
    private WebElement signOutBtn;
    @FindBy(xpath = "//*[@id=\"base\"]/button[2]")
    private WebElement confirmSignOut;
    public void verifyOnHomePage() {
        isElementDisplayed(homePageLogo);
    }

    public void clickHomePageSignInBtn() {
        click(homePageSignInBtn);
    }

    public void enterEmail(String email) {
        clear(inputEmail);
        sendKeys(inputEmail, email);
    }

    public void enterPassword(String password) {
        clear(inputPassword);
        sendKeys(inputPassword, password);
    }

    public void clickSubmitSignInBtn() {
            click(submitSignInBtn);
    }

    public void loginUser(String email, String password) {
        enterEmail(email);
        enterPassword(password);
//        clickSubmitSignInBtn();
    }

    public void clickSignOutBtn(){
        click(signOutBtn);
    }
    public void clickConfirmSignOut() {
        click(confirmSignOut);
    }

    public String getErrMsg() {
        return getText(incorrectPasswordMsg);
    }
}
