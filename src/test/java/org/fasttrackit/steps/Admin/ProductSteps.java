package org.fasttrackit.steps.Admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.Admin.BlogPage;
import org.fasttrackit.pages.Admin.LoginPage;
import org.fasttrackit.pages.Admin.ProductPage;
import org.fasttrackit.pages.HomePage;
import org.junit.Assert;

public class ProductSteps {

    private LoginPage loginPage;

    private ProductPage productPage;

    private HomePage homePage;

    private BlogPage blogPageAdmin;


    @Step
    public void modifyProducts(){
       productPage.clickOpenProducts();
       productPage.clickSearchProduct("Bag new Bag");
       productPage.clickSubmitSearch();
       productPage.mouseOverElementBag();
       productPage.clickEditProduct();
       productPage.setTitle("Bag new Bag for Test");
       //productPage.setPrice();
       productPage.clickUpdate();
    }
    @Step
    public void checkProductWasModifyMessage(String expected){
        String message = productPage.getProductWasModifyMessage();
        Assert.assertEquals(expected, message);
    }
    @Step
    public void verifyProductWasModifyInFrontend(String value){
        homePage.open();
        homePage.clickSearchByInput();
        homePage.setTypeInputText(value);
        homePage.clickOnSearchIcon();
    }
    @Step
    public void verifyModifyName(String expected){
        String message = productPage.getProductWasModifyInFrontEnd();
        Assert.assertEquals(expected, message);
    }
    @Step
    public void restoreProductToInitialState(){
        productPage.clickOpenProducts();
        productPage.clickSearchProduct("Bag new Bag");
        productPage.clickSubmitSearch();
        productPage.mouseOverElementBag();
        productPage.clickEditProduct();
        productPage.setTitle("Bag new Bag");
        productPage.clickUpdate();

    }
    @Step
    public void addNewProduct (){
        productPage.clickOpenProducts();
        productPage.clickAddNewProduct();
        productPage.enterTitle("Anca Test");
        productPage.enterRegularPrice("10");
        productPage.clickInventory();
        productPage.enterSku("10");
        productPage.clickPublish();
    }
    @Step
    public void checkProductWasCreatedInFrontend(String expected){
        productPage.clickViewProduct();
        String message = productPage.getProductWasCreated();
        Assert.assertEquals(expected, message);
    }
    @Step
    public void deleteNewAddedProduct(){
        loginPage.open();
        productPage.clickOpenProducts();
        productPage.clickSearchProduct("Anca Test");
        productPage.clickSubmitSearch();
        productPage.mouseOverElementDelete();
        productPage.deleteNewCreatedProduct();




    }






}
