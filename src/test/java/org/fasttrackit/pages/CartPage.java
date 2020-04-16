package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeWait;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(css = "tr.cart-subtotal>td>span")
    private WebElementFacade verifyTotal;

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
     //public WebElementFacadeWait waitForElement(){
      //waitFor(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.header-cart-amount>span")));
     // return null;
    //}

    public String getVerifyTotal(){
        return verifyTotal.getText();
    }


}
