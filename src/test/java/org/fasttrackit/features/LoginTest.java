package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WhenPageOpens;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class LoginTest extends Constants {
    @Steps
    private LoginSteps loginSteps;



    @Test
    public void testValidLogin(){
        loginSteps.navigateToLoginPage();
    }

    @Test
    public void testValidLoginWithCredentials(){
        loginSteps.fillAndSubmitCredentialsLogin();
        loginSteps.checkLoggedIn("ancatest1");
    }

    @Test
    public void testValidRegisterWithCredentials()  {
        loginSteps.fillAndSubmitCredentialsRegister();
    }

}
