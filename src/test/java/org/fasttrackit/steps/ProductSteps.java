package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
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
        productPage.selectPage();
        productPage.selectPage();
        productPage.selectPage();
        productPage.selectPage();
    }

    @Step
    public void selectPage2(){
        productPage.selectPage();
    }


    }

