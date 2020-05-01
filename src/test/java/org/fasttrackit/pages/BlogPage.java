package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BlogPage extends PageObject {

    @FindBy(css = "#menu-item-1643 >a")
    private WebElementFacade blogButton;

    @FindBy(id = "comment")
    private WebElementFacade commentTextBox;

    @FindBy(id = "author")
    private WebElementFacade nameField;

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(css = "input#submit")
    private WebElementFacade postComment;

    @FindBy(css = "div.comment-content p")
    private WebElementFacade postMessage;

    String userName = "ancatest" + java.util.UUID.randomUUID();

    public void clickBlogButton(){
        clickOn(blogButton);
    }
    public void setComment(String message){
        typeInto(commentTextBox, message);
    }
    public void setNameField(String name){
        typeInto(nameField, name);
    }
    public void setEmailAdress(String myEmail){
        myEmail = userName + "@mailinator.com";
        typeInto(emailField, myEmail);
    }

    public void clickPostComment(){
        clickOn(postComment);
    }
    public String getPostMessage(){
        return postMessage.getText();
    }
}
