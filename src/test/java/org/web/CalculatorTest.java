package org.web;

import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private static final Logger logger = LogManager.getLogger(CalculatorTest.class);

    @Test
    public void testAdd() {
        logger.info("Starting testAdd()...");
        double givenX = 5.5;
        double givenY = 3.5;
        Calculator calculator = new Calculator(givenX, givenY);
//        double givenX = 5.5;
//        double givenY = 3.5;
        double expectedResult = 10.0;

//        double givenResult = calculator.add(givenX, givenY);
        double givenResult = calculator.add();
        logger.info("Expected result: {}, Given result: {}", expectedResult, givenResult);
        // Assert that the result matches the expected value
        assertEquals(expectedResult, givenResult, "The addition result is incorrect.");
        logger.info("testAdd() completed successfully.");
    }

    @Test
    public void testSub() {
        logger.info("Starting testSub()...");
        double givenX = 5.5;
        double givenY = 4.5;
        Calculator calculator = new Calculator(givenX, givenY);
//        double givenX = 5.5;
//        double givenY = 4.5;
        double expectedResult = 1.0;

//        double givenResult = calculator.sub(givenX, givenY);
        double givenResult = calculator.subtract();
        logger.info("Expected result: {}, Given result: {}", expectedResult, givenResult);

        // Assert that the result matches the expected value
        assertEquals(expectedResult, givenResult, "The subtraction result is incorrect.");
        logger.info("testSub() completed successfully.");
    }

    @Test
    public void testMul() {
        logger.info("Starting testMul()...");
        double givenX = 5.5;
        double givenY = 4.5;
        Calculator calculator = new Calculator(givenX, givenY);
//        double givenX = 5.5;
//        double givenY = 4.5;
        double expectedResult = 10.0;

//        double givenResult = calculator.muliply(givenX, givenY);

       double givenResult = calculator.multiply();
        logger.info("Expected result: {}, Given result: {}", expectedResult, givenResult);

        assertEquals(expectedResult, givenResult, "The multiplication result is incorrect.");
        logger.info("testMul() completed successfully.");
    }

    @Test
    public void testDiv() {
        logger.info("Starting testDiv()...");
        double givenX = 5.5;
        double givenY = 0.0;
        Calculator calculator = new Calculator(givenX, givenY);
//        double givenX = 5.5;
//        double givenY = 0.0;
        double expectedResult = 10.0;
        try {
//            double givenResult = calculator.division(givenX, givenY);
            double givenResult = calculator.division();
            logger.info("Expected result: {}, Given result: {}", expectedResult, givenResult);
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero.", e.getMessage(), "Division by zero exception message is incorrect.");
            logger.error("Arithmetic Exception occurred: {}", e.getMessage());
        }
    }
}
