package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")

public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade emailFieldLogin;

    @FindBy(id = "password")
    private WebElementFacade passwordFieldLogin;

    @FindBy(css= "button[name~=login]")
    private WebElementFacade loginButton;

    @FindBy(id = "reg_email")
    private WebElementFacade getEmailFieldRegister;

    @FindBy(id = "reg_password")
    private WebElementFacade passwordFieldRegister;

    @FindBy(css = "button[name~=register]")
    private WebElementFacade registerButton;

    @FindBy(css = "li strong")
    private WebElementFacade errorMessage;


    public void setEmailField(String email){
        typeInto(emailFieldLogin, email);
    }
    public void setPasswordField(String password){
        typeInto(passwordFieldLogin, password);
    }
    public void submitLogin(){
        clickOn(loginButton);
    }
    public void generateEmailAddress(String myEmail){
        myEmail = "ancatest" + System.nanoTime() + "@mailinator.com";
        typeInto(getEmailFieldRegister, myEmail);
    }
    public void setPasswordFieldRegister(String password){
        typeInto(passwordFieldRegister,password);
    }
    public void submitRegister(){
        clickOn(registerButton);
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }

}
