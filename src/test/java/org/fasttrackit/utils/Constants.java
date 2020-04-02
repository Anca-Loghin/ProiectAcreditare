package org.fasttrackit.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WhenPageOpens;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

@RunWith(SerenityRunner.class)

public class Constants extends PageObject {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @WhenPageOpens
    public void maximiseScreen() {
        getDriver().manage().window().maximize();
    }
}






