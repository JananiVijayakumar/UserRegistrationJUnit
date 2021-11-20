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
        System.out.println("...............................................................");
    }

    @Test
    public void lastName(){
        String lastName = "Srim";
        boolean check = userRegistration.checkLastNameIsCorrect(lastName);
        assertTrue(check);
        System.out.println("...............................................................");
    }

    @Test
    public void eMAil(){
        String eMail = "janani@bl.co";
        boolean check = userRegistration.checkEmailIsCorrect(eMail);
        assertTrue(check);
        System.out.println("...............................................................");
    }

    @Test
    public void mobileNumber(){
        String mobileNumber = "91 9876543210";
        boolean check = userRegistration.checkMobileNumberFormatIsCorrect(mobileNumber);
        assertTrue(check);
        System.out.println("...............................................................");
    }

    @Test
    public void passWordRule1(){
        String passWord = "jAnanisr";
        boolean check = userRegistration.checkPassWordRule1IsCorrect(passWord);
        assertTrue(check);
        System.out.println("...............................................................");
    }

    @Test
    public void passWordRule2(){
        String passWord1 = "Jjanansri";
        boolean check = userRegistration.checkPassWordRule2IsCorrect(passWord1);
        assertTrue(check);
        System.out.println("...............................................................");
    }

    @Test
    public void passWordRule3(){
        String passWord2 = "Jjananri1";
        boolean check = userRegistration.checkPassWordRule3IsCorrect(passWord2);
        assertTrue(check);
        System.out.println("...............................................................");
    }

    @Test
    public void passWordRule4(){
        String passWord3 = "Janansri1@";
        boolean check = userRegistration.checkPassWordRule4IsCorrect(passWord3);
        assertTrue(check);
        System.out.println("...............................................................");
    }

    @Test
    public void HappyAndSadCasesForFirstName(){
        String firstName = "Janani";
        String firstName1 = "jan";
        boolean check = userRegistration.checkFirstNameIsCorrect(firstName);
        assertTrue(check);
        check = userRegistration.checkFirstNameIsCorrect(firstName1);
        assertTrue(check);
    }

    @Test
    public void HappyAndSadCasesForLasstName(){
        String lastName = "Janani";
        String lastName1 = "jan";
        boolean check = userRegistration.checkLastNameIsCorrect(lastName);
        assertTrue(check);
        check = userRegistration.checkLastNameIsCorrect(lastName1);
        assertTrue(check);
    }

    @Test
    public void HappyAndSadCasesForMobileFormat(){
        String mobileNumber = "91 9876543210";
        String mobileNumber1 = "9876543210";
        boolean check = userRegistration.checkMobileNumberFormatIsCorrect(mobileNumber);
        assertTrue(check);
        check = userRegistration.checkMobileNumberFormatIsCorrect(mobileNumber1);
        assertTrue(check);
    }

    @Test
    public void HappyAndSadCasesForEmail() {
        String eMail = "janani@bl.co";
        String eMail1 = "janani@.co";
        boolean check = userRegistration.checkEmailIsCorrect(eMail);
        assertTrue(check);
        check = userRegistration.checkEmailIsCorrect(eMail1);
        assertTrue(check);
    }

    @Test
    public void emailUniversal(){
        String email = "abc@yahoo.com";
        email = "abc-100@yahoo.com";
        email = "abc.100@yahoo.com";
        email = "abc111@abc.com";
        email = "abc-100@abc.net";
        email = "abc.100@abc.com.au";
        email = "abc@1.com";
        email = "abc@gmail.com.com";
        email = "abc+100@gmail.com.com";
        boolean check = UserRegistration.emailUniversal(email);
        assertTrue(check);
        System.out.println("...............................................................");
    }
}
