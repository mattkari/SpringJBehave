package com.mydemo.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MySteps {

    @Given("I am a pending step")
    public void givenIAmAPendingStep() {
        System.out.println("Given step");
    }

    @Given("I am still pending step")
    public void givenIAmStillPendingStep() {
        System.out.println("Given step 1 ");
    }

    @When("a good soul will implement me")
    public void whenAGoodSoulWillImplementMe() {
        System.out.println("Given step 2 ");    }

    @Then("I shall be happy")
    public void thenIShallBeHappy() {
        System.out.println("Given step 3 ");
    }
    
}
