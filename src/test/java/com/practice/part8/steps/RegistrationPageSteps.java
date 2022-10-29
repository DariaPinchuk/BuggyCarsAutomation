package com.practice.part8.steps;

import com.practice.part8.page.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationPageSteps {


    @Autowired
    RegistrationPage registrationPage;

    @And("user types login as {string}")
    public void userTypesLoginAs(String arg0) {
    }

    @Given("user navigates to registration form")
    public void userNavigatesToRegistrationForm() {

        registrationPage.navigateToRegistrationForm();
    }

    @And("user types first Name as {string}")
    public void userTypesFirstNameAs(String arg0) {
    }

    @And("user types last Name as {string}")
    public void userTypesLastNameAs(String arg0) {
    }

    @And("user types password {string}")
    public void userTypesPassword(String arg0) {
    }

    @And("user types confirm {string}")
    public void userTypesConfirm(String arg0) {
    }

    @And("user press button confirm registration")
    public void userPressButtonConfirmRegistration() {
    }

    @When("the user is registered")
    public void theUserIsRegistered() {
    }

    @Then("user will see successful message")
    public void userWillSeeSuccessfulMessage() {
    }
}
