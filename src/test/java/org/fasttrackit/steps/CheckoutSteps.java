package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;
    private CartPage cartPage;
    private MyAccountPage myAccountPage;

    @Step
    public void proceedToCheckout() {
        checkoutPage.clickProceedtoCheckout();
        checkoutPage.setFirstName("Anca");
        checkoutPage.setLasttName("Micle");
        checkoutPage.setStreetAddress("Horea");
        checkoutPage.setHouseNumber("96");
        checkoutPage.setCityAddress("Cluj Napoca");
        checkoutPage.setPostcodeAddress("407407");
        checkoutPage.setPhoneNumber("0744112233");
        checkoutPage.generateEmailAdress("ancatest@mailinator");
        checkoutPage.clickPlaceOrder();
    }
    @Step
    public void checkPlaceOrderMessage(String expected){
        String message = checkoutPage.getPlaceOrderMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void createAccountFromCheckout(){
        checkoutPage.clickProceedtoCheckout();
        checkoutPage.setFirstName("Anca");
        checkoutPage.setLasttName("Micle");
        checkoutPage.setStreetAddress("Horea");
        checkoutPage.setHouseNumber("96");
        checkoutPage.setCityAddress("Cluj Napoca");
        checkoutPage.setPostcodeAddress("407407");
        checkoutPage.setPhoneNumber("0744112233");
        checkoutPage.generateEmailAdress("ancatest@mailinator.com");
        checkoutPage.clickCreateAccount();
        checkoutPage.setPasswordAccount("123321aaaAAA!!!");
        checkoutPage.clickPlaceOrder();
        checkoutPage.clickOpenMyAccount();
    }



   @Step
   public void checkCreateAccountFromCheckoutMessage(){
        String userName = "ancatest" + System.nanoTime();
        String message = checkoutPage.getOpenMyAccountMessage();
        Assert.assertEquals(userName, message);
    }
}
