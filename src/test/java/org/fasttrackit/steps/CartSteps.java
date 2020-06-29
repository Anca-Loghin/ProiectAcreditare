package org.fasttrackit.steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.junit.Assert;

public class CartSteps {
    private CartPage cartPage;

    @Step
    public void addToCartProduct() {
        cartPage.clickOnProduct();
        cartPage.clickOnCart();
    }
    @Step
    public void checkAddedItemMessage(String expected){
        String message = cartPage.getProductWasAddedToCartMessage();
        Assert.assertEquals(expected, message);
    }
    @Step
    public void openSelectedItem(){
        cartPage.clickOnProduct();
    }
    @Step
    public void quantityIncreased(){
        cartPage.clickIncreaseQuantity();
        cartPage.clickOnCart();
    }
    @Step
    public void openViewCart(){
        cartPage.clickOnViewCart();
    }
    @Step
    public void removeFromCart(){
        cartPage.clickOnRemoveItemFromCart();
    }

    @Step
    public void checkRemoveItemMessage(String expected){
        String message = cartPage.getProductWasRemovedFromCartMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void addProductsToCart() {
        cartPage.waitForElement();
        cartPage.clickOnProductBag1();
        cartPage.clickOnProductBag2();
        cartPage.waitForElement();
        cartPage.clickOpenCart();
    }

    @Step
    public void reviewProduct() {
        cartPage.clickBagProduct();
        cartPage.clickReviewsStar();
        cartPage.setReviewsInTextBox("This bag is not pink");
        cartPage.setReviewAuthor("Anca Micle");
        cartPage.setReviewAuthorEmail("ancatest@mailinator");
        cartPage.clickSubmitButton();
    }

    @Step
    public void checkReviewMessage(String expected){
        String message = cartPage.getReviewMessage();
        Assert.assertEquals(expected, message);
        }

    }





