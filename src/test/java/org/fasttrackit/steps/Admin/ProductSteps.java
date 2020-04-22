package org.fasttrackit.steps.Admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.Admin.LoginPage;
import org.fasttrackit.pages.Admin.ProductPage;
import org.fasttrackit.pages.HomePage;
import org.junit.Assert;

public class ProductSteps {

    private LoginPage loginpage;

    private ProductPage productPage;

    private HomePage homePage;

    @Step
    public void modifyProducts(){
       productPage.clickOpenProducts();
       productPage.mouseOverElement();
       productPage.clickEditProduct();
       productPage.setTitle("Bag new Bag");
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

}
