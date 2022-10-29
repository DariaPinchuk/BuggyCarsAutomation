package com.practice.part8.page;

import com.practice.part8.browsers.Browser;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginPageImpl extends BasePage implements LoginPage {
    private By errorMessageLocator = By.xpath("//span[@class='label label-warning']");
    private By loginInputTextLocator = By.name("login");
    private By passwordInputTextLocator = By.name("password");
    private By loginButtonLocator = By.xpath("//button[contains(text(),'Login')]");

    private By brandLocator = By.xpath("//a[@class='navbar-brand']");
    @Autowired
    Browser browser;


    @Override
    public void login(String username, String password) {
        findElement(loginInputTextLocator).sendKeys(username);
        findElement(passwordInputTextLocator).sendKeys(password);
        findElement(loginButtonLocator).click();

    }

    @Override
    public String readErrorMessage() {

        return findElement(errorMessageLocator).getText();

    }

    @Override
    public boolean isProfilePresent() {
        findElement(brandLocator);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return browser.getDriver().getPageSource().contains("Profile");
    }
}
