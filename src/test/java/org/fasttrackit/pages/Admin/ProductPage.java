package org.fasttrackit.pages.Admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.lang.annotation.Target;

public class ProductPage extends PageObject {

    @FindBy(css = "#menu-posts-product .wp-menu-name")
    private WebElementFacade openProducts;

    @FindBy(css = "#post-2651 a.row-title")
    private  WebElementFacade selectProduct;

    @FindBy(css = "#post-2651 a.editinline")
    private WebElementFacade quickEdit;

    @FindBy(id = "#edit-2651 input.text.wc_input_price.regular_price")
    private WebElementFacade modifyPrice;

    public void clickOpenProducts(){
        clickOn(openProducts);
    }
    public void hoverSelectProduct(){
        withAction().moveToElement(element(selectProduct)).moveToElement(element(quickEdit)).click().build().perform();
    }
    public void clickEditProduct(){
        clickOn((quickEdit));
    }
    public void setModifyPrice(String value){
        typeInto(modifyPrice, value);
    }
}
