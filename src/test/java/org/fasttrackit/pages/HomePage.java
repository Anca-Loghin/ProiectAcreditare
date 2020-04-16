package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class HomePage extends PageObject {

    @FindBy(css = "a[title='Login']")
    private WebElementFacade loginLink;

    @FindBy(css = "i.fa.fa-search")
    private WebElementFacade searchByInput;

    @FindBy(css = "input.search-field")
    private WebElementFacade typeInputText;

    @FindBy(css = "input.search-submit")
    private WebElementFacade searchIcon;

    @FindBy(css = "h1.page-title >span")
    private WebElementFacade searchInputMessage;


    public void clickLogin(){
        clickOn(loginLink);
    }

    public void clickSearchByInput(){
        clickOn(searchByInput);
    }

    public void setTypeInputText(String value){
        waitFor(typeInputText);
        typeInto(typeInputText, value);
    }

    public void clickOnSearchIcon(){
        clickOn(searchIcon);
    }

    public String getSearchInputMessage(){
        return searchInputMessage.getText();
    }
}
