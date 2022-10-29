package com.practice.part8.page;

import com.practice.part8.browsers.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Duration;

public class BasePage {
    @Autowired
    Browser browser;
    public WebElement findElement(By locator){
        WebDriverWait wait = new WebDriverWait(browser.getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
