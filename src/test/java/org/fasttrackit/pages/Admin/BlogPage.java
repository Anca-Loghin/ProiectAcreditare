package org.fasttrackit.pages.Admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BlogPage extends PageObject {

    @FindBy(css = "#menu-comments div.wp-menu-name")
    private WebElementFacade comments;

    @FindBy(id = "comment-search-input")
    private WebElementFacade searchComment;

    @FindBy(id = "search-submit")
    private WebElementFacade submitSearch;

    @FindBy(id = "cb-select-905")
    private WebElementFacade checkboxComment;

    @FindBy(css = "a.vim-a")
    private WebElementFacade approveComment;

    @FindBy(css = "a.delete")
    private WebElementFacade deleteComment;

    public void clickComments(){
        clickOn(comments);
    }
    public void clickSearchComment(String value){
        typeInto(searchComment,value);
    }
    public void clickSubmitSearch(){
        clickOn(submitSearch);
    }
    public void clickCheckboxComment(){
        clickOn(checkboxComment);
    }
    public void clickApproveComment(){
        clickOn(approveComment);
    }
    public void clickDeleteComment(){
        clickOn(deleteComment);
    }

    public void mouseOverElement(){
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.cssSelector("td.author"));
        action.moveToElement(element).perform();
    }
}
