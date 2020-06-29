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

    @FindBy(id = "post-search-input")
    private WebElementFacade searchProduct;

    @FindBy(id = "search-submit")
    private WebElementFacade submitSearch;

    @FindBy(css = "a.page-title-action:first-of-type")
    private WebElementFacade addNew;

    @FindBy(id = "title")
    private WebElementFacade title;

    @FindBy(id = "_regular_price")
    private WebElementFacade regularPrice;

    @FindBy(css = "li.inventory_options a")
    private WebElementFacade inventory;

    @FindBy(id = "_sku")
    private WebElementFacade sku;

    @FindBy(id = "publish")
    private WebElementFacade publish;

    @FindBy(css = "div#message.updated a")
    private WebElementFacade viewProduct;

    @FindBy(css = "h1.product_title")
    private WebElementFacade productWasCreatedMessage;

    @FindBy(css = "a.submitdelete")
    private WebElementFacade deleteProduct;

    @FindBy(css = "#menu-posts-product a.wp-first-item")
    private WebElementFacade allProducts;

    public void clickOpenProducts(){
        waitForRenderedElements(By.cssSelector("#menu-posts-product .wp-menu-name"));
        clickOn(openProducts);
    }

    public void mouseOverElementBag(){
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

    public void clickSearchProduct(String value){
        typeInto(searchProduct,value);
    }

    public void clickSubmitSearch(){
        clickOn(submitSearch);
    }
    public void clickAddNewProduct(){
        clickOn(addNew);
    }
    public void enterTitle(String value){
        typeInto(title, value);
    }
    public void enterRegularPrice(String value){
        typeInto(regularPrice, value);
    }
    public void clickInventory(){
        clickOn(inventory);
    }
    public void enterSku(String value){
        typeInto(sku, value);
    }
    public void clickPublish(){
        clickOn(publish);
    }
    public void clickViewProduct(){
        clickOn(viewProduct);
    }
    public String getProductWasCreated(){
        return productWasCreatedMessage.getText();
    }
    public void deleteNewCreatedProduct(){
        clickOn(deleteProduct);
    }
    public void mouseOverElementDelete(){
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.cssSelector("a.row-title"));
        action.moveToElement(element).perform();
    }
    public void mouseOverElementProduct(){
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.cssSelector("#menu-posts-product .wp-menu-name"));
        action.moveToElement(element).perform();
    }
    public void clickAllProducts(){
        clickOn(allProducts);
    }
}
