package org.fasttrackit.pages.Admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

    @FindBy(css = "#the-list input.ptitle")
    private WebElementFacade modifyTitle;

    @FindBy(css = "tr#edit-2651 button.button-primary")
    private WebElementFacade updateButton;

    @FindBy(id = "doaction")
    private WebElementFacade apply;

    @FindBy(css = "h3.entry-title>a")
    private WebElementFacade checkModifyName;

    public void clickOpenProducts(){
        clickOn(openProducts);
    }

    public void mouseOverElement(){
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.cssSelector("#post-2651 a.row-title"));
        action.moveToElement(element).perform();
    }
    public void clickEditProduct(){
        clickOn((quickEdit));
    }

    public void setTitle(String text){
        typeInto(modifyTitle, text);
    }
    public void clickApply(){
        clickOn(apply);
    }
    public void clickUpdate(){
        clickOn(updateButton);
    }
    public String getProductWasModifyMessage(){
        return selectProduct.getTextContent();
    }

    public void setPrice(){
        modifyPrice.click();
        modifyPrice.sendKeys("" +150);
    }

    public String getProductWasModifyInFrontEnd(){
        return checkModifyName.getText();
    }



}
