package com.bridgelabz.junit.test;

import com.bridgelabz.junit.UserRegistration;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void firstName(){
        String firstName = "Janani";
        boolean check = userRegistration.checkFirstNameIsCorrect(firstName);
        assertTrue(check);
    }

    @Test
    public void lastName(){
        String lastName = "Srim";
        boolean check = userRegistration.checkLastNameIsCorrect(lastName);
        assertTrue(check);
    }

    @Test
    public void eMAil(){
        String eMail = "janani@bl.co";
        boolean check = userRegistration.checkEmailIsCorrect(eMail);
        assertTrue(check);
    }
}
