package com.practice.part8.browsers;

import org.openqa.selenium.WebDriver;

public interface Browser {
    WebDriver getDriver();
    void closeDriver();

}
