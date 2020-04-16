package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class ProductItemsTest extends BaseTest {

    @Steps
    private ProductSteps productSteps;

    @Test
    public void testValidSelectSortBy(){
        productSteps.navigateToProductPage();
        productSteps.selectAllSortBy();

    }

    @Test
    public void testValidNextPage(){
        productSteps.navigateToProductPage();
        productSteps.selectNextPage();
    }

}
