package com.bridgelabz.junit.test;

import com.bridgelabz.junit.UserRegistration;
import com.bridgelabz.junit.UserRegistrationException;
import junit.framework.Assert;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    private Assert Assertions;

    @Test
    public void checkGivenFirstNameIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.FirstName("Janu");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenFirstNameIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.FirstName("Vja");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenLastNameIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.LastName("Srimi");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenLastNameIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.LastName("Sri");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenMobileNumberIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.MobileNumber("91 9876543210");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenMobileNumberIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.MobileNumber("912339488564");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenEmailIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.Email("vjS@bl.co");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenEmailIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.Email("vjS@gmail.co");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenPasswordIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.PassWord("Jananisrim");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenPasswordIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.PassWord("janani");
        Assertions.assertEquals(checkMood, ActualMood);
    }
}
