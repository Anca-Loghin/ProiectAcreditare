package org.fasttrackit.steps.Admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Admin.BlogPage;
import org.fasttrackit.pages.Admin.LoginPage;

public class BlogSteps  {
    private BlogPage blogPage;



    @Step
    public void approveUserComment(){
        blogPage.clickComments();
        blogPage.clickSearchComment("This is a test, this is a test");
        blogPage.clickSubmitSearch();
        blogPage.mouseOverElement();
        blogPage.clickCheckboxComment();
        blogPage.clickApproveComment();

    }
}
