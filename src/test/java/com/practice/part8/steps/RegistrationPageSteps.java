package com.practice.part8.steps;

import com.practice.part8.page.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class RegistrationPageSteps {

    private String login;
    private String firstName;
    private String lastName;
    private String password;
    private String confirmPassword;

    @Autowired
    RegistrationPage registrationPage;

    @And("user types login as {string}")
    public void userTypesLoginAs(String login) {
        Date date = new Date();
        this.login = login+date.getTime();
    }

    @Given("user navigates to registration form")
    public void userNavigatesToRegistrationForm() {

        registrationPage.navigateToRegistrationForm();
    }

    @And("user types first Name as {string}")
    public void userTypesFirstNameAs(String firstName) {
        this.firstName = firstName;
    }

    @And("user types last Name as {string}")
    public void userTypesLastNameAs(String lastName) {
        this.lastName = lastName;
    }

    @And("user types password {string}")
    public void userTypesPassword(String password) {
        this.password = password;
    }

    @And("user types confirm {string}")
    public void userTypesConfirm(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }



    @When("the user registers")
    public void theUserIsRegistered() {
        registrationPage.register(login,firstName,lastName,password,confirmPassword);
    }

    @Then("user will see successful message")
    public void userWillSeeSuccessfulMessage() {
        Assertions.assertEquals("Registration is successful", registrationPage.readSuccessfulRegistrationMessage());
    }
}
