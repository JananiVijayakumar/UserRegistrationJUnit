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

    @Test
    public void mobileNumber(){
        String mobileNumber = "91 9876543210";
        boolean check = userRegistration.checkMobileNumberFormatIsCorrect(mobileNumber);
        assertTrue(check);
    }

    @Test
    public void passWordRule1(){
        String passWord = "jAnanisr";
        boolean check = userRegistration.checkPassWordRule1IsCorrect(passWord);
        assertTrue(check);
    }

    @Test
    public void passWordRule2(){
        String passWord1 = "Jjanansri";
        boolean check = userRegistration.checkPassWordRule2IsCorrect(passWord1);
        assertTrue(check);
    }

    @Test
    public void passWordRule3(){
        String passWord2 = "Jjananri1";
        boolean check = userRegistration.checkPassWordRule3IsCorrect(passWord2);
        assertTrue(check);
    }

    @Test
    public void passWordRule4(){
        String passWord3 = "Janansri1@";
        boolean check = userRegistration.checkPassWordRule4IsCorrect(passWord3);
        assertTrue(check);
    }
}
