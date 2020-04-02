package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class LoginSteps  {
   private HomePage homePage;
   private LoginPage loginPage;
   private MyAccountPage myAccountPage;

   @Step
    public void navigateToLoginPage(){
       homePage.open();
       homePage.clickLogin();
   }

   @Step
   public void fillAndSubmitCredentialsLogin(){
      homePage.open();
      homePage.clickLogin();
      loginPage.setEmailField("ancatest1@mailinator.com");
      loginPage.setPasswordField("Test123321!!!");
      loginPage.submitLogin();
   }

   @Step
   public void fillAndSubmitCredentialsRegister()  {
      homePage.open();
      homePage.clickLogin();
      loginPage.generateEmailAddress("ancatest@mailinator");
      loginPage.setPasswordFieldRegister("Test123456789!!!!!!");
      loginPage.submitRegister();
   }

   @Step
   public void checkLoggedIn(String expected){
     String message = myAccountPage.getWelcomeMessage();
      Assert.assertEquals(expected, message);
   }
}
