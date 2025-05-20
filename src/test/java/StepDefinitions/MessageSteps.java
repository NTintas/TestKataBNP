package StepDefinitions;

import io.cucumber.java.en.Given;


public class MessageSteps {
    @Given("I am authenticated on the messages endpoint")
    public void theUserIsSuccessfullyAuthenticatedOnTheApplication(String apiName) {
        System.out.println("hi");
    }
}


