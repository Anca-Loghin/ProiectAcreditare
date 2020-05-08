package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeWait;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")
public class CartPage extends PageObject {

    @FindBy(css ="a[href*=\"http://qa3.fasttrackit.org:8008/product/bzzdkvqo-2\"] >img")
    private WebElementFacade selectProduct;

    @FindBy(css = "button.single_add_to_cart_button")
    private WebElementFacade addToCartSelectedProduct;

   // @FindBy(xpath = "//*[@id=\"main\"]/div[1]/text()")
    @FindBy(css = "div.woocommerce-message")
    private WebElementFacade productAddedToCartMessage;

    @FindBy(css = ".input-text")
    private WebElementFacade increaseQuantityItem;

    @FindBy(css = "a.button.wc-forward")
    private WebElementFacade viewCart;

    @FindBy(css = "a.remove")
    private WebElementFacade deleteItemFromCart;

    @FindBy(css = "div.woocommerce-message")
    private WebElementFacade productRemovedFromCartMessage;

    @FindBy(css = "a[data-product_id=\"2585\"]")
    private WebElementFacade selectProductBag1;

    @FindBy(css = "a[data-product_id=\"2643\"]")
    private WebElementFacade selectProductBag2;

    @FindBy(css = "a[data-product_id=\"2645\"]")
    private WebElementFacade selectProductBag3;

    @FindBy(css = "span.header-cart-amount>span")
    private WebElementFacade openCart;

    @FindBy(css = "td.product-subtotal")
    List<WebElementFacade> itemSubtotalCost;

    @FindBy(css = "tr.cart-subtotal>td>span")
    private WebElementFacade subtotalCost;

    @FindBy(css = "tr.shipping >td")
    private WebElementFacade shippingCost;

    @FindBy(css = "tr.order-total >td >strong >span")
    private WebElementFacade totalCost;

    @FindBy (css = "li.post-2585 h2")
    private WebElementFacade bagProduct;

    @FindBy(id = "comment")
    private WebElementFacade enterReviews;

    @FindBy(id = "author")
    private WebElementFacade enterAuthor;

    @FindBy(id = "email")
    private WebElementFacade enterEmail;

    @FindBy(id = "submit")
    private WebElementFacade submit;

    @FindBy(css = "a.star-2")
    private WebElementFacade selectReviewsStar;

    @FindBy(css = "div.description p")
    private WebElementFacade reviewMessage;

    public void clickOnProduct(){
        clickOn(selectProduct);
    }

    public void clickOnCart(){
        clickOn(addToCartSelectedProduct);
    }

    public String getProductWasAddedToCartMessage(){
        return productAddedToCartMessage.getText();
    }

    public void clickIncreaseQuantity(){
        typeInto(increaseQuantityItem, "4");
    }

    public void clickOnViewCart(){
        clickOn(viewCart);
    }

    public void clickOnRemoveItemFromCart(){
        clickOn(deleteItemFromCart);
    }

    public String getProductWasRemovedFromCartMessage(){
        return productRemovedFromCartMessage.getText();
    }

    public void clickOnProductBag1(){
        clickOn(selectProductBag1);
    }
    public void clickOnProductBag2(){
        clickOn(selectProductBag2);
    }
    public void clickOnProductBag3(){
        clickOn(selectProductBag3);
    }

    public void clickOpenCart(){
        clickOn(openCart);
    }
    public WebElementFacadeWait waitForElement() {
        return this.getRenderedView().waitForElement();
    }

    

    public String getSubtotalCost(){
        return subtotalCost.getText();
    }
    public String getShippingCost(){
        return shippingCost.getText();
    }
    public String getTotalCost(){
        return totalCost.getText();
    }

    public void clickBagProduct(){
        clickOn(bagProduct);
    }

    public void setReviewsInTextBox(String text){
        typeInto(enterReviews, text);
    }

    public void setReviewAuthor(String name){
        typeInto(enterAuthor, name);
    }

    public void setReviewAuthorEmail(String email){
        email = "ancatest" + System.nanoTime() + "@mailinator.com";
        typeInto(enterEmail, email);
    }

    public void clickSubmitButton(){
        clickOn(submit);
    }

    public void clickReviewsStar(){
        clickOn(selectReviewsStar);
    }

    public String getReviewMessage(){
        return reviewMessage.getText();
    }


    }






