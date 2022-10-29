package com.practice.part8.page;

public interface LoginPage {

    void login(String username, String password );

    String readErrorMessage();
    boolean isProfilePresent();


}


