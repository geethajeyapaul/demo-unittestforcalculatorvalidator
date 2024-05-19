package com.example.demounittest;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Test for Calculator operations:")
public class CalculatorTests {

       Calculator calculator;

       @BeforeAll
       static void beforeTests() {
              System.out.println("The Calculator test is about to get executed.");

       }

       @BeforeEach
       void beforeTest() {
              System.out.println("A single method in the calculator test is about to be executed.");
              calculator = new Calculator();
       }

       @Test
       @DisplayName("Addition of two numbers returning the expected results")
       void addingTwoNumbersShouldReturnSum() {
              int a = 30;
              int b = 20;
              int result = calculator.add(a, b);
              int expectedResult = 50;

              Assertions.assertEquals(expectedResult, result);
       }


       @Test
       @DisplayName("Addition of two numbers not returning the expected results")
       void addingTwoNumbersShouldNotExpectedSum() {
              int a = 30;
              int b = 20;
              int result = calculator.add(a, b);
              int expectedResult = 10;

              Assertions.assertNotEquals(expectedResult, result);
       }

       @Test
       @DisplayName("Subtraction of two numbers returning the expected results")
       void subtractTwoNumbersShouldReturnDifference() {
              int a = 50;
              int b = 30;
              int result = calculator.subtract(a, b);
              int expectedResult = 20;

              Assertions.assertEquals(expectedResult, result);
       }

       @Test
       @DisplayName("Subtraction of two numbers not returning the expected results")
       void subtractTwoNumbersShouldNotReturnExpectedDifference() {
              int a = 50;
              int b = 30;
              int result = calculator.subtract(a, b);
              int expectedResult = 80;

              Assertions.assertNotEquals(expectedResult, result);
       }

       @Test
       @DisplayName("Multiplication of two numbers returning the expected results")
       void multiplyTwoNumbersShouldReturnProduct() {
              int a = 10;
              int b = 10;
              int result = calculator.multiply(a, b);
              int expectedResult = 100;

              Assertions.assertEquals(expectedResult, result);
       }

       @Test
       @DisplayName("Multiplication of two numbers not returning the expected results")
       void multiplyTwoNumbersShouldNotReturnExpectedProduct() {
              int a = 10;
              int b = 10;
              int result = calculator.multiply(a, b);
              int expectedResult = 1;

              Assertions.assertNotEquals(expectedResult, result);
       }

       @Test
       @DisplayName("Division of two numbers returning the expected results")
       void divideTwoNumbersShouldReturnQuotient() {
              int a = 100;
              int b = 100;
              double result = calculator.divide(a, b);
              double expectedResult = 1;

              Assertions.assertEquals(expectedResult, result);
       }

       @Test
       @DisplayName("Division of two numbers not returning the expected results")
       void divideTwoNumbersShouldNotReturnExpectedQuotient() {
              int a = 100;
              int b = 100;
              double result = calculator.divide(a, b);
              double expectedResult = 10;

              Assertions.assertNotEquals(expectedResult, result);
       }


       @AfterEach
       void afterTest() {
              System.out.println("A single method in calculator has now finished executing.");
       }

       @AfterAll
       static void afterTests() {
              System.out.println("The calculator test has been executed and finished.");
       }

}

