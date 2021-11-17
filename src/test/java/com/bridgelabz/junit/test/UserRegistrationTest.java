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
}
