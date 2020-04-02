package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ProductPage extends PageObject {

    @FindBy(css = ".menu-item-1728>a")
    private WebElementFacade shopItems;

    @FindBy(css = "select.orderby")
    private WebElementFacade sortBy;

    @FindBy(css = "a[href*=\"http://qa3.fasttrackit.org:8008/shop/page/1\"]")
    private WebElementFacade nextPage1;

    @FindBy(css = "a[href*=\"http://qa3.fasttrackit.org:8008/shop/page/2\"]")
    private WebElementFacade nextPage2;

    @FindBy(css = "a[href*=\"http://qa3.fasttrackit.org:8008/shop/page/3\"]")
    private WebElementFacade nextPage3;

    @FindBy(css = "a[href*=\"http://qa3.fasttrackit.org:8008/shop/page/4\"]")
    private WebElementFacade nextPage4;

    @FindBy(css = "a[href*=\"http://qa3.fasttrackit.org:8008/shop/page/5\"]")
    private WebElementFacade nextPage5;

    public void clickShopItems(){
        clickOn(shopItems);
    }

    public void selectSortBy(){
        clickOn(sortBy);
    }

    public void selectSortByDropdown(){
        sortBy.selectByValue("popularity");
        sortBy.selectByValue("rating");
        sortBy.selectByValue("date");
        sortBy.selectByValue("price");
        sortBy.selectByValue("price-desc");
    }


    public void selectPage1(){
        clickOn(nextPage1);
    }
    public void selectPage2(){
        clickOn(nextPage2);
    }
    public void selectPage3(){
        clickOn(nextPage3);
    }
    public void selectPage4(){
        clickOn(nextPage4);
    }
    public void selectPage5(){
        clickOn(nextPage5);
    }

}
