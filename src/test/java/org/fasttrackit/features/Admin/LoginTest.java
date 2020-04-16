package org.fasttrackit.features.Admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.Admin.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void testValidLogin(){
        loginSteps.fillAndSubmitCredentialLogin("admin", "parola11");
    }
}
