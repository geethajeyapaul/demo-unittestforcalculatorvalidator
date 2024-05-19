package com.example.demounittest;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Test for validator operation:")
public class ValidatorTests {

    Validator validator;

    @BeforeAll
    static void beforeTests() {
        System.out.println("The Validator test is about to get executed.");

    }

    @BeforeEach
    void beforeTest() {
        System.out.println("A single method in validator test is about to be executed.");
    }


    @Test
    @DisplayName("Check for valid Phone number")
    void checkForCorrectPhoneNumberStartZero() {
        String inputPhoneNumber = "0761594033";
        String result = String.valueOf(Validator.isPhoneNumberValid(inputPhoneNumber));

        String expectedResult = "true";

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Check for invalid Phone number starting without zero")
    void checkForIncorrectPhoneNumberStartWithoutZero(){
        String inputPhoneNumber = "1761594033";
        String result =String.valueOf(Validator.isPhoneNumberValid(inputPhoneNumber));
        String expectedResult = "true";

        Assertions.assertNotEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Check for invalid Phone number with length less than 6")
    void checkForShortLengthPhoneNumber(){
        String inputPhoneNumber = "04033";
        String result =String.valueOf(Validator.isPhoneNumberValid(inputPhoneNumber));
        String expectedResult = "true";

        Assertions.assertNotEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Check for invalid Phone number with length greater than 10")
    void checkForLongLengthPhoneNumber(){
        String inputPhoneNumber = "04033111111";
        String result =String.valueOf(Validator.isPhoneNumberValid(inputPhoneNumber));
        String expectedResult = "true";

        Assertions.assertNotEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Check for valid Email format")
    void checkForCorrectEmailFormat() {
        String inputEmailID = "giadiya@gmail.com";
        String result = String.valueOf(Validator.isEmailValid(inputEmailID));

        String expectedResult = "true";

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Check for invalid Email format without at sign")
    void checkForInCorrectEmailFormatWithOutAtSign() {
        String inputEmailID = "giadiyagmail.com";
        String result = String.valueOf(Validator.isEmailValid(inputEmailID));

        String expectedResult = "true";

        Assertions.assertNotEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Check for invalid Email format without dot sign")
    void checkForInCorrectEmailFormatWithOutDotSign() {
        String inputEmailID = "giadiya@gmailcom";
        String result = String.valueOf(Validator.isEmailValid(inputEmailID));

        String expectedResult = "true";

        Assertions.assertNotEquals(expectedResult,result);
    }


    @Test
    @DisplayName("Check for invalid Email format with empty domain name")
    void checkForInCorrectEmailFormatWithOutDomainName() {
        String inputEmailID = "giadiya@.com";
        String result = String.valueOf(Validator.isEmailValid(inputEmailID));

        String expectedResult = "true";

        Assertions.assertNotEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Check for invalid Email format with empty tld name")
    void checkForInCorrectEmailFormatWithOutTld() {
        String inputEmailID = "giadiya@gmail.";
        String result = String.valueOf(Validator.isEmailValid(inputEmailID));

        String expectedResult = "true";

        Assertions.assertNotEquals(expectedResult,result);
    }

    @AfterEach
    void afterTest() {
        System.out.println("A single method in validator has now finished executing.");
    }

    @AfterAll
    static void afterTests() {
        System.out.println("The validator test has been executed and finished.");
    }

}
