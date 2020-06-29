package org.fasttrackit.steps.Admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Admin.LoginPage;

public class LoginSteps {
    private LoginPage loginPage;

    @Step
    public void fillAndSubmitCredentialLogin(String username, String password) {
        loginPage.open();
        loginPage.setUserNameField(username);
        loginPage.setUserPasswordField(password);
        loginPage.clickLoginButton();
    }
    @Step
    public void openBackendPage(){
        loginPage.open();
    }
}
