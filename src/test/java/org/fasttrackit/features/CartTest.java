package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.Admin.LoginSteps;
import org.fasttrackit.steps.BlogSteps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    private CartSteps cartSteps;

    @Steps
    private ProductSteps productSteps;

    @Steps
    private BlogSteps blogSteps;

    @Steps
    private LoginSteps loginStepAdmin;


    @Test
    public void testValidAddToCart(){
        productSteps.navigateToProductPage();
        productSteps.selectPage2();
        cartSteps.addToCartProduct();
    }

    @Test
    public void testProductWasAddedToCartMessage(){
        productSteps.navigateToProductPage();
        productSteps.selectPage2();
        cartSteps.addToCartProduct();
        cartSteps.checkAddedItemMessage("View cart“bzZDKvQo” has been added to your cart.");
    }

    @Test
    public void testIncreaseQuantity(){
        productSteps.navigateToProductPage();
        productSteps.selectPage2();
        cartSteps.openSelectedItem();
        cartSteps.quantityIncreased();
    }

    @Test
    public void testViewCart(){
        productSteps.navigateToProductPage();
        productSteps.selectPage2();
        cartSteps.openSelectedItem();
        cartSteps.quantityIncreased();
        cartSteps.openViewCart();
    }

    @Test
    public void testDeleteItemFromCart(){
        productSteps.navigateToProductPage();
        productSteps.selectPage2();
        cartSteps.openSelectedItem();
        cartSteps.quantityIncreased();
        cartSteps.openViewCart();
        cartSteps.removeFromCart();
    }

    @Test
    public void testProductWasDeletedFromCartMessage(){
        productSteps.navigateToProductPage();
        productSteps.selectPage2();
        cartSteps.openSelectedItem();
        cartSteps.quantityIncreased();
        cartSteps.openViewCart();
        cartSteps.removeFromCart();
        cartSteps.checkRemoveItemMessage("“bzZDKvQo” removed. Undo?");
    }

    @Test
    public void testAddProductToCartAndCheckTotal(){
        productSteps.navigateToProductPage();
        cartSteps.addProductsToCart(); //stale element is not attached to page
        //cartSteps.checkTotal("270,00 lei");
    }

    @Test
    public void testReviewsOnProduct(){
        productSteps.navigateToProductPage();
        cartSteps.reviewProduct();
        cartSteps.checkReviewMessage("This bag is not pink");
        loginStepAdmin.fillAndSubmitCredentialLogin("admin", "parola11");
        blogSteps.deleteReviewMessage();

    }

}
