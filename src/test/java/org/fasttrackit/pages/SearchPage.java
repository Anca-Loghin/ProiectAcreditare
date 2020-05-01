package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPage extends PageObject {

    @FindBy(css="h3.entry-title>a")
    List<WebElement> searchResult;

    public List<String> getResultSearch() {
        return searchResult.stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
    }
}
