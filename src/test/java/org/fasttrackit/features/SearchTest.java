package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    private SearchSteps searchSteps;

    @Test
    public  void testValidSearchByKeyword(){
        searchSteps.searchForKeyword("sunglasses");
        searchSteps.checkSearchMessage("sunglasses");
    }

    @Test
    public void testSearchListByKeyword(){
        searchSteps.searchForKeyword("hoodie");
        searchSteps.verifyResult("Hoodie");
    }
}
