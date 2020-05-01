package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.BlogSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class BlogTest extends BaseTest {

    @Steps
    private BlogSteps blogSteps;



    @Test
    public void testPostApproveAndDeleteComment(){
        blogSteps.setPostComment();
        blogSteps.checkPostComentAfterApprove("admin", "parola11");
        blogSteps.checkPostMessage("This is a test, this is a test");
        blogSteps.deletePostMessage("admin", "parola11");
    }


}
