package com.practice.part8.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service

public class ChromeBrowser implements Browser {
    private WebDriver driver;
    public ChromeBrowser(){
        try {
            Resource resource = new ClassPathResource("chromedriver.exe");
            String file = resource.getFile().getPath();
            System.setProperty("webdriver.chrome.driver", file);
        } catch (Exception e){}
    }
    @Override
    public WebDriver getDriver() {
        if (driver == null) {

            driver = new ChromeDriver();
        }
        return driver;
    }

    @Override
    public void closeDriver() {
        driver.close();
        driver.quit();
        driver=null;
    }

}
