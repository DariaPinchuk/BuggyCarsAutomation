package com.practice.part8.page;

public interface RegistrationPage {

    void register(String loginNew, String firstName, String lastName, String newPassword, String confirmPassword );

    String readNewUserRegistrationErrorMessage ();

    String readSuccessfulRegistrationMessage ();

    void navigateToRegistrationForm ();
}


