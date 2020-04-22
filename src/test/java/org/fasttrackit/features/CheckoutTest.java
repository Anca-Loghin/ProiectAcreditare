package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Steps
    private CartSteps cartSteps;

    @Steps
    private ProductSteps productSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void testProceedToCheckout(){
        productSteps.navigateToProductPage();
        productSteps.selectPage2();
        cartSteps.addToCartProduct();
        cartSteps.openViewCart();
        checkoutSteps.proceedToCheckout();
        checkoutSteps.checkPlaceOrderMessage("Thank you. Your order has been received."); //nu merge, css e corect
    }

    @Test
    public void testCreateAccountFromCheckout(){
        productSteps.navigateToProductPage();
        productSteps.selectPage2();
        cartSteps.addToCartProduct();
        cartSteps.openViewCart();
        checkoutSteps.createAccountFromCheckout(); // cand se deschide MyAccount nu ramane logat userul, desi manual userul ramane logat.
        checkoutSteps.checkCreateAccountFromCheckoutMessage();// cum pot face assert pentru mailul care e random?

    }
}
