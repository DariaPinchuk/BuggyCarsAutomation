package com.practice.part8.steps;

import com.practice.part8.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {
    private String username;
    private String password;
    @Autowired
    LoginPage loginPage;

    @Given("user types username as {string}")
    public void user_types_username_as(String username) {
        // Write code here that turns the phrase above into concrete actions
       this.username=username;
    }
    @Given("user types password as {string}")
    public void user_types_password_as(String password) {
        // Write code here that turns the phrase above into concrete actions
        this.password=password;

    }
    @When("user logins")
    public void user_logins() {
        // Write code here that turns the phrase above into concrete actions
        this.loginPage.login(username,password);
    }
    @Then("user view the profile")
    public void user_view_the_profile() {
        // Write code here that turns the phrase above into concrete actions
       Assertions.assertTrue(loginPage.isProfilePresent(),"Profile is not present");
    }




    @Then("user view error message {string}")
    public void userViewErrorMessage(String expectedError) {
        Assertions.assertEquals(expectedError,loginPage.readErrorMessage());
    }
}
