package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Admin.LoginPage;
import org.fasttrackit.pages.BlogPage;
import org.fasttrackit.pages.HomePage;
import org.junit.Assert;

public class BlogSteps {

    private BlogPage blogPage;
    private HomePage homePage;
    private org.fasttrackit.pages.Admin.BlogPage blogPageAdmin;
    private LoginPage loginPageAdmin;

    @Step
    public void setPostComment(){
        homePage.open();
        blogPage.clickBlogButton();
        blogPage.setComment("This is a test, this is a test");
        blogPage.setNameField("Anca Micle");
        blogPage.setEmailAdress("ancatest@mailinator.com");
        blogPage.clickPostComment();
    }

    @Step
    public void checkPostComentAfterApprove(String username, String password){
        loginPageAdmin.open();
        loginPageAdmin.setUserNameField(username);
        loginPageAdmin.setUserPasswordField(password);
        loginPageAdmin.clickLoginButton();
        blogPageAdmin.clickComments();
        blogPageAdmin.clickSearchComment("This is a test, this is a test");
        blogPageAdmin.clickSubmitSearch();
        blogPageAdmin.mouseOverElement();
        blogPageAdmin.clickApproveComment();
        homePage.open();
        blogPage.clickBlogButton();
    }

    @Step

    public void checkPostMessage(String expected){
        String message = blogPage.getPostMessage();
        Assert.assertEquals(expected, message);
    }

    @Step

    public void deletePostMessage(String username, String password){
        loginPageAdmin.open();
        blogPageAdmin.clickComments();
        blogPageAdmin.clickSearchComment("This is a test, this is a test");
        blogPageAdmin.clickSubmitSearch();
        blogPageAdmin.mouseOverElement();
        blogPageAdmin.clickDeleteComment();
    }
}
