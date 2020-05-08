package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPage extends PageObject {

    @FindBy(css="h3.entry-title>a")
    List<WebElementFacade> searchListResult;

    @FindBy(css = "#post-64")
    private WebElementFacade searchItem;

    public boolean getResultSearch(String name) { //ii corecta metoda?
        for (WebElementFacade products :searchListResult) {
            if (searchItem.getText().contains(name))
                return true;
        }
        return false;
    }

    public List<String> getResultTitles() {
        return searchListResult.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }


}
