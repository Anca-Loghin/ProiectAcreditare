package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class MyAccountPage extends PageObject {

    @FindBy(css = "strong")
    private WebElementFacade welcomeMessageParagraph;

    public String getWelcomeMessage(){
        return welcomeMessageParagraph.getText();
    }
}
