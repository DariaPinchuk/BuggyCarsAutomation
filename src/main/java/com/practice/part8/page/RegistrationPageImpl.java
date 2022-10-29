package com.practice.part8.page;

import com.practice.part8.browsers.Browser;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RegistrationPageImpl extends BasePage implements RegistrationPage {
        private By registerErrorMessageLocator = By.xpath("//div[@class='alert alert-danger']");
        private By newLoginInputTextLocator = By.xpath("//input[@id='username']");
        private By firstNameInputTextLocator = By.id("firstName");
        private By lastNameInputTextLocator = By.id("lastName");
        private By newPasswordInputTextLocator = By.id("password");
        private By confirmPasswordInputTextLocator = By.id("confirmPassword");

        private By registerButtonLocator = By.xpath("//button[contains(text(),'Register')]");

        private By successfulRegistrationMessage = By.xpath(" //div[contains(text(),'successful')]");

        private By registerButton = By.xpath("//a[contains(text(),'Register')]");


        @Autowired
        Browser browser;




    @Override
    public void register(String loginNew, String firstName, String lastName, String newPassword, String confirmPassword) {
        findElement(newLoginInputTextLocator).sendKeys(loginNew);
        findElement(firstNameInputTextLocator).sendKeys(firstName);
        findElement(lastNameInputTextLocator).sendKeys(lastName);
        findElement(newPasswordInputTextLocator).sendKeys(newPassword);
        findElement(confirmPasswordInputTextLocator).sendKeys(confirmPassword);
        findElement(registerErrorMessageLocator).sendKeys(loginNew);

        findElement(registerButtonLocator).click();

    }

    @Override
    public String readNewUserRegistrationErrorMessage() {
        return findElement(registerErrorMessageLocator).getText();
    }

    @Override
    public String readSuccessfulRegistrationMessage() {
        return findElement(successfulRegistrationMessage).getText();
    }

    @Override
    public void navigateToRegistrationForm() {
        findElement(registerButton).click();
    }


}
