package org.fasttrackit.features.Admin;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.Admin.ProductPage;
import org.fasttrackit.steps.Admin.LoginSteps;
import org.fasttrackit.steps.Admin.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ProductsTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ProductSteps productSteps;

    @Test
    public void testModifyProduct(){
        loginSteps.fillAndSubmitCredentialLogin("admin", "parola11");
        productSteps.modifyProducts();

  }
}
