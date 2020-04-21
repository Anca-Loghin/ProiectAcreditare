package org.fasttrackit.steps.Admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.Admin.LoginPage;
import org.fasttrackit.pages.Admin.ProductPage;
import org.junit.Assert;

public class ProductSteps {

    private LoginPage loginpage;

    private ProductPage productPage;

    @Step
    public void modifyProducts(){
       productPage.clickOpenProducts();
       productPage.hoverSelectProduct();
       productPage.setModifyPrice("150");
       productPage.setTitle("Bag new Bag");
       productPage.clickUpdate();
    }
    @Step
    public void checkProductWasModifyMessage(String expected){
        String message = productPage.getProducWasModifyMessage();
        Assert.assertEquals(expected, message);
    }

}