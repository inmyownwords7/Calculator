package org.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    private final double x;
    private final double y;

    // Constructors
    public Calculator() {
        this(0.0, 0.0);
    }

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
        // Log initialization only once
        logger.info("Calculator initialized with values: x = {}, y = {}", x, y);
    }

    // Iterate over multiple Calculator instances
    public static void iterate(Calculator[] calculators) {
        for (Calculator calculator : calculators) {
            calculator.performAllOperations();
        }
    }

    // Main method
    public static void main(String[] args) {
        Calculator[] calculators = {
                new Calculator(5.5, 4.5),
                new Calculator(3.5, 0.0), // Division by zero case
                new Calculator(7.0, 3.0)
        };

        iterate(calculators);
    }

    // Arithmetic operations
    public double add() {
        double result = x + y;
        logger.info("Addition: {} + {} = {}", x, y, result);
        return result;
    }

    public double subtract() {
        double result = x - y;
        logger.info("Subtraction: {} - {} = {}", x, y, result);
        return result;
    }

    public double multiply() {
        double result = x * y;
        logger.info("Multiplication: {} * {} = {}", x, y, result);
        return result;
    }

    public String safeDivision() {
        if (y == 0) {
            logger.error("Division by zero attempted with numerator {}", x);
            return "Error: Division by zero";
        }
        double result = x / y;
        logger.info("Division: {} / {} = {}", x, y, result);
        return String.valueOf(result);
    }

    // Perform all operations and display results
    public void performAllOperations() {
        logger.info("\nPerforming all operations for values: x = {}, y = {}", x, y);
        add();
        subtract();
        multiply();
        safeDivision();
        logger.info("Finished all operations.\n");
    }
}
