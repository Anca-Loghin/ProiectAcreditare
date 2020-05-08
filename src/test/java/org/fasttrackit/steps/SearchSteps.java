package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchPage;
import org.junit.Assert;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchSteps {
    private HomePage homePage;
    private SearchPage searchPage;

    @Step
    public void searchForKeyword(String value) {
        homePage.open();
        homePage.clickSearchByInput();
        homePage.setTypeInputText(value);
        homePage.clickOnSearchIcon();
    }

    @Step
    public void checkSearchMessage(String expected) {
        String message = homePage.getSearchInputMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void shouldSeeIfItemIsInGridSearch() {
        searchPage.getResultSearch("Hoodie");
    }

    @Step
    public void verifyResult(String searchResult) {
        List<String> results = searchPage.getResultTitles();
        Assert.assertTrue(results.contains(searchResult));
    }


}










