package com.practice.part8.steps;

import com.practice.part8.browsers.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    Browser browser;

    @Before

    public void setUp(){
      browser.getDriver().get("https://buggy.justtestit.org/");
    }
    @After
    public void complete(){
        browser.closeDriver();
    }
}
