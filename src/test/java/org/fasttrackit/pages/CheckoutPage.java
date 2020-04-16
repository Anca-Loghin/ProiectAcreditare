package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class CheckoutPage extends PageObject {

    @FindBy(css = ".checkout-button")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(id = "billing_first_name")
    private WebElementFacade firstName;

    @FindBy(id = "billing_last_name")
    private WebElementFacade lastName;

    @FindBy(id = "billing_address_1")
    private WebElementFacade streetAddress;

    @FindBy(id = "billing_address_2")
    private WebElementFacade houseNumber;

    @FindBy(id = "billing_city")
    private WebElementFacade cityAddress;

    @FindBy(id = "billing_postcode")
    private WebElementFacade postcodeAddress;

    @FindBy(id = "billing_phone")
    private WebElementFacade phoneNumber;

    @FindBy(id = "billing_email")
    private WebElementFacade emailAddress;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = ".woocommerce-notice")
    private WebElementFacade placeOrderMessage;

    @FindBy(css = "input#createaccount")
    private WebElementFacade createAccountCheckbox;

    @FindBy(id = "account_password")
    private WebElementFacade passwordAccount;

    @FindBy(css = "#menu-item-1730>a")
    private WebElementFacade openMyAccount;

    @FindBy(css = "strong:first-of-type")
    private WebElementFacade myAccountMessage;

    public void clickProceedtoCheckout(){
        clickOn(proceedToCheckoutButton);
    }

    public void setFirstName(String value){
        typeInto(firstName, value);
    }
    public void setLasttName(String value){
        typeInto(lastName, value);
    }
    public void setStreetAddress(String value){
        typeInto(streetAddress, value);
    }
    public void setHouseNumber(String value){
        typeInto(houseNumber, value);
    }
    public void setCityAddress(String value){
        typeInto(cityAddress, value);
    }
    public void setPostcodeAddress(String value){
        typeInto(postcodeAddress, value);
    }
    public void setPhoneNumber(String value){
        typeInto(phoneNumber, value);
    }
    public void generateEmailAdress(String myEmail){
        myEmail = "ancatest" + System.nanoTime() + "@mailinator.com";
        typeInto(emailAddress, myEmail);
    }

    public void clickPlaceOrder(){
        clickOn(placeOrderButton);
    }

    public String getPlaceOrderMessage(){
        return placeOrderMessage.getText();
    }

    public void clickCreateAccount(){
        clickOn(createAccountCheckbox);
    }
    public void setPasswordAccount(String password){
        typeInto(passwordAccount, password);
    }
    public void clickOpenMyAccount(){
        clickOn(openMyAccount);
    }
    public String getOpenMyAccountMessage(){
        return myAccountMessage.getText();
    }





}
