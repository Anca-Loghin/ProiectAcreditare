package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.junit.Assert;

public class SearchSteps {
    private HomePage homePage;

    @Step
    public void searchForKeyword(String value){
        homePage.open();
        homePage.clickSearchByInput();
        homePage.setTypeInputText(value);
        homePage.clickOnSearchIcon();
    }
    @Step
    public void checkSearchMessage(String expected){
        String message = homePage.getSearchInputMessage();
        Assert.assertEquals(expected, message);
    }

    }


