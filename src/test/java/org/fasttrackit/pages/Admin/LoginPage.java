package org.fasttrackit.pages.Admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/wp-admin/")
public class LoginPage extends PageObject {

    @FindBy(id = "user_login")
    private WebElementFacade userNameField;

    @FindBy(id = "user_pass")
    private WebElementFacade userPasswordField;

    @FindBy(id = "wp-submit")
    private WebElementFacade loginButton;

    public void setUserNameField(String value){
        typeInto(userNameField, value);
    }

    public void setUserPasswordField(String value){
        typeInto(userPasswordField, value);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }
}
