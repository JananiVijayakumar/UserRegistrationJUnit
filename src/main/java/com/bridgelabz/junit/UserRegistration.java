package com.bridgelabz.junit;
/*
author : JananiVijayaKumar
Date : 16/11/2021
Desc : Test User Registeration and Analyse The Mood
*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

        String regex = "^[A-Z]{1}+[a-z]{3,}+$";
        UserRegistrationValidation firstName = (String pattern, String fName) ->  Pattern.matches(pattern, fName );
    public String FirstName(String firstName) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(regex);
            if (firstName.isEmpty())
                throw new UserRegistrationException("Please Enter a Valid First name");
            Matcher matcher = pattern.matcher(firstName);
            if (matcher.matches()) {
                System.out.println("Valid Firstname!!");
                System.out.println(analyseMood("HAPPY"));
                return "HAPPY";
            } else
                return "SAD";
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please Enter a Valid First name");
        }
    }

    String regex1 = "^[A-Z]{1}+[a-z]{3,}+$";
    UserRegistrationValidation lastName = (String pattern, String lName) ->  Pattern.matches(pattern, lName );
        public String LastName (String lastName) throws UserRegistrationException {
            try {
                Pattern pattern = Pattern.compile(regex1);
                if (lastName.isEmpty())
                    throw new UserRegistrationException("Please Enter a Valid Last name");
                Matcher matcher = pattern.matcher(lastName);
                if (matcher.matches()) {
                    System.out.println("Valid Lastname!!");
                    System.out.println(analyseMood("HAPPY"));
                    return "HAPPY";
                } else
                    return "SAD";
            } catch (UserRegistrationException e) {
                throw new UserRegistrationException("Please Enter a Valid Last name");
            }
        }

    String regex2 = "^91\\\\s[6789][0-9]{9}";
    UserRegistrationValidation mobileNumber = (String pattern, String mobile) ->  Pattern.matches(pattern, mobile );
    public String MobileNumber(String mobile) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(regex2);
            if (mobile.isEmpty())
                throw new UserRegistrationException("Please Enter a Valid Mobile Number");
            Matcher matcher = pattern.matcher(mobile);
            if (matcher.matches()) {
                System.out.println("Valid Mobile Number!!");
                System.out.println(analyseMood("HAPPY"));
                return "HAPPY";
            } else
                return "SAD";
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please Enter a Valid Mobile Number");
        }
    }


    UserRegistrationValidation Email = (String pattern, String email) ->  Pattern.matches(pattern, email );
    String regex3 = "^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*";
    public String Email (String email) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(regex3);
            if (email.isEmpty())
                throw new UserRegistrationException("Please Enter a Valid Email");
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("Valid Email!!");
                System.out.println(analyseMood("HAPPY"));
                return "HAPPY";
            } else
                return "SAD";
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please Enter a Valid Email");
        }
    }

    UserRegistrationValidation Password = (String pattern, String password) ->  Pattern.matches(pattern, password );
    String regex4 = "[a-zA-Z]{8,}";
    public String PassWord(String password) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(regex4);
            if (password.isEmpty())
                throw new UserRegistrationException("Please Enter a Valid PassWord");
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println("Valid PassWord!!");
                System.out.println(analyseMood("HAPPY"));
                return "HAPPY";
            } else
                return "SAD";
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please Enter a Valid PassWord");
        }
    }

        public static String analyseMood (String message){
            if (message.contains("HAPPY")) {
                return "Registration is Successful!!";
            } else {
                return "Registration is Failed!!";
            }
        }

        public static void main (String[]args) throws UserRegistrationException {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.FirstName(sc.next());
            userRegistration.LastName(sc.next());
            userRegistration.MobileNumber(sc.next());
            userRegistration.Email(sc.next());
            userRegistration.PassWord(sc.next());
        }
    }