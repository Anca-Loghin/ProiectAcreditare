package org.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class Scroll extends PageObject {
    @FindBy(css = "span.page-numbers")
    private WebElementFacade pageElement;


    public void scrollDownToElement(){


    }

}
