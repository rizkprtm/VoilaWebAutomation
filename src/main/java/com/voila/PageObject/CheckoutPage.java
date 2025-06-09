package com.voila.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > p:nth-child(2)")
    private WebElement checkoutPageTitle;
    @FindBy(xpath = "//p[normalize-space()='Select Address']")
    private WebElement checkoutSelectAddressBtn;

    @FindBy(xpath = "//button[normalize-space()='Add Address']")
    private WebElement checkoutAddAdressBtn;

    @FindBy(xpath = "//input[@name='category']")
    private WebElement inputAddressLabel;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputRecipientName;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement inputPhoneNumber;

    @FindBy(xpath = "//input[@name='selected_area']")
    private WebElement searchUserAddress;

    @FindBy(xpath = "//input[@placeholder='Search by city, district, or postal code']")
    private WebElement inputUserAddress;

    @FindBy(xpath = "//div[@data-test-id='CT_Component_SearchAddressRegion_ListItem16439']")
    private WebElement selectUserAddress;

    @FindBy(xpath = "//textarea[@name='address']")
    private WebElement inputAddressDetails;

    @FindBy(css = "body > div:nth-child(14) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2)")
    private WebElement selectDeliveryAddress;

    @FindBy(xpath = "//button[normalize-space()='Select Address']")
    private WebElement confirmSelectDeliveryAddress;

    @FindBy(xpath = "//button[normalize-space()='Save Address']")
    private WebElement saveAddressBtn;

    @FindBy(xpath = "//div[@class='_15kd2weg _15kd2we5s j1jih7ak j1jih7a0  _15r4f4dzz  _1dn2a7i41 _1dn2a7i5f  k1xhznf   _15kd2weg'][@data-test-id='CT_Component_ShippingSelector_ButtonShipping']")
    private WebElement shippingMethodSelection;

    @FindBy(css = "#_hjSafeContext_54093036")
    private WebElement iFrameShippingService;

    @FindBy(xpath = "//img[@alt='JNE YES']")
    private WebElement selectJNEYESShippingMethod;

    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    private WebElement confirmShippingMethod;

    @FindBy(xpath = "//div[@class='_15kd2weg _15kd2we5s j1jih7ak j1jih7a0  _15r4f4dzz  _1dn2a7i41 _1dn2a7i5f  k1xhznf   _15kd2weg'][@data-test-id='CT_Component_SelectorPayment_ButtonPayment']")
    private WebElement paymentMethodSelection;

    @FindBy(xpath = "//p[normalize-space()='Virtual Account']")
    private WebElement selectVAPaymentMethod;

    @FindBy(xpath = "//img[@alt='BCA Virtual Account']")
    private WebElement selectBCAVAPaymentMethod;

    @FindBy(xpath = "//button[contains(@data-test-id,'CT_Component_PaymentListFooter_ButtonConfirm')]")
    private WebElement confirmPaymentMethod;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/p")
    private WebElement firstItemPrice;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[3]/div/div/div[2]/div/div[2]/p")
    private WebElement secondItemPrice;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/p")
    private WebElement checkOutSubTotalItem;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/p[2]")
    private WebElement protectionFee;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[5]/div/p[2]")
    private WebElement totalItemPrice;

    @FindBy(xpath = "//button[normalize-space()='Place Order']")
    private WebElement placeOrderBtn;

    public void verifyCheckoutOnPage() {
        isElementDisplayed(checkoutPageTitle);
    }
    public void clickSelectAddress() {
        click(checkoutSelectAddressBtn);
    }

    public void clickAddAddress() {
        click(checkoutAddAdressBtn);
    }

    public void enterAddressLabel(String addressLabel) {
        clear(inputAddressLabel);
        sendKeys(inputAddressLabel, addressLabel);
    }

    public void enterRecipientName(String recipientName) {
        clear(inputRecipientName);
        sendKeys(inputRecipientName, recipientName);
    }

    public void enterPhoneNumber(String phoneNumber) {
        clear(inputPhoneNumber);
        sendKeys(inputPhoneNumber, phoneNumber);
    }

    public void clickSearchAddress() {
        click(searchUserAddress);
    }

    public void enterUserAddress(String postalCode){
        clear(inputUserAddress);
        sendKeys(inputUserAddress,postalCode);
    }

    public void clickUserAddress() {
        click(selectUserAddress);
    }

    public void enterUserAddressDetails(String addressDetails) {
        clear(inputAddressDetails);
        sendKeys(inputAddressDetails, addressDetails);
    }

    public void clickSaveAddress() {
        click(saveAddressBtn);
    }

    public void checkoutAddUserAddress(String addressLabel,String recipientName, String phoneNumber, String postalCode, String addressDetails) {
        enterAddressLabel(addressLabel);
        enterRecipientName(recipientName);
        enterPhoneNumber(phoneNumber);
        clickSearchAddress();
        enterUserAddress(postalCode);
        clickUserAddress();
        enterUserAddressDetails(addressDetails);
    }

    public void clickSelectDeliveryAddress() {
        click(selectDeliveryAddress);
    }

    public void clickConfirmSelectedDeliveryAddress() { click(confirmSelectDeliveryAddress); }

    public void setSelectedDeliveryAddress() {
        clickConfirmSelectedDeliveryAddress();
    }

    public WebElement shippingServiceFrame() {
        return iFrameShippingService;
    }

    public WebElement shippingMethodSelectionElement() {
        return shippingMethodSelection;
    }
    public void clickShippingMethod() throws InterruptedException {
        Thread.sleep(5000);
        click(shippingMethodSelection);
    }

    public void clickJNEYES() {
        click(selectJNEYESShippingMethod);
    }

    public void clickConfirmShippingMethod() {
        click(confirmShippingMethod);
    }

    public void selectShippingService() {
        clickJNEYES();
        clickConfirmShippingMethod();
    }

    public void clickPaymentMethod() throws InterruptedException {
        Thread.sleep(5000);
        click(paymentMethodSelection);
    }

    public WebElement paymentMethodSelectionElement() {
        return paymentMethodSelection;
    }

    public void clickVAPaymentMethod() {
        click(selectVAPaymentMethod);
    }

    public void clickBCAVAPaymentMethod() {
        click(selectBCAVAPaymentMethod);
    }

    public void clickConfirmPaymentMethod() {
        click(confirmPaymentMethod);
    }

    public void selectPaymentMethod() throws InterruptedException {
        clickPaymentMethod();
        clickVAPaymentMethod();
        clickBCAVAPaymentMethod();
    }

    public String actualCheckoutFirstItemPrice() {
        return getText(firstItemPrice);
    }
    public String actualCheckoutSecondItemPrice() {
        return getText(secondItemPrice);
    }

    public String actualCheckoutSubTotalItemPrice() {
        return getText(checkOutSubTotalItem);
    }

    public String actualProtectionFee() {
        return getText(protectionFee);
    }

    public String actualCheckoutTotalItemPrice() {
        return getText(totalItemPrice);
    }

    public void finishCheckout() {
        click(placeOrderBtn);
    }
}
