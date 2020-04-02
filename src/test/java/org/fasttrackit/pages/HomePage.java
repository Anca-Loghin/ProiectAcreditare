package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class HomePage extends PageObject {

    @FindBy(css = "a[title='Login']")
    private WebElementFacade loginLink;

    @FindBy(css = "")
    private WebElementFacade registerLink;

    public void clickLogin(){
        clickOn(loginLink);
    }

    public void clickRegister(){
        clickOn(registerLink);
    }
}
