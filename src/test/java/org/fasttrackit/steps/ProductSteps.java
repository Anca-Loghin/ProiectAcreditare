package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;

public class ProductSteps {
    private ProductPage productPage;
    private HomePage homePage;

    @Step
    public void navigateToProductPage(){
        homePage.open();
        productPage.clickShopItems();
    }

    @Step
    public void selectAllSortBy(){
        productPage.selectSortBy();
        productPage.selectSortByDropdown();
    }

    @Step
    public void selectNextPage(){
        productPage.selectPage1();
        productPage.selectPage2();
        productPage.selectPage3();
        productPage.selectPage4();
        productPage.selectPage5();
    }
}
