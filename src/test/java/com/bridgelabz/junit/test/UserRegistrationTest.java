package com.bridgelabz.junit.test;

import com.bridgelabz.junit.UserRegistration;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void firstName(){
        String firstName = "Jana";
        boolean check = userRegistration.checkFirstNameIsCorrect(firstName);
        assertTrue(check);
    }
}
