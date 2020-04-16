package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")
public class ProductPage extends PageObject {

    @FindBy(css = ".menu-item-1728 >a")
    private WebElementFacade shopItems;

    @FindBy(css = "select.orderby")
    private WebElementFacade sortBy;

    @FindBy(css = "a.next.page-numbers")
    private WebElementFacade nextPage;


    public void clickShopItems() {
        clickOn(shopItems);
    }

    public void selectSortBy() {
        clickOn(sortBy);
    }

    public void selectSortByDropdown() {
        sortBy.selectByValue("popularity");
        sortBy.selectByValue("rating");
        sortBy.selectByValue("date");
        sortBy.selectByValue("price");
        sortBy.selectByValue("price-desc");
    }

    public void selectPage() {
        clickOn(nextPage);
    }


    }

