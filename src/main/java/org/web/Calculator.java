package org.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    // create an instance of Logger
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    private double x, y;
    Calculator calculator = new Calculator();

    public Calculator() {

    }

    Calculator calculator() {
        return new Calculator(x, y);
    }

    Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }


    //    public double add(double a, double b) {
//        double result = a + b;
//        logger.info("Adding {} and {} = {}", a, b, result);
//        return result;
//    }
//
//    public double sub(double a, double b) {
//        double result = a - b;
//        logger.info("Subtract {} and {} = {}", a, b, result);
//        return result;
//    }
//
//    public double mul(double a, double b) {
//        double result = a * b;
//        logger.info("Multiply {} and {} = {}", a, b, result);
//        return result;
//    }
//
//    public double div(double a, double b) {
//        if (b == 0) {
//            logger.error("Division by zero attempted with numerator {}", a);
//            throw new ArithmeticException("Cannot divide by zero.");
//        }
//        double result = a / b;
//        logger.info("Dividing {} by {} = {}", a, b, result);
//        return result;
//    }
    public double add() {
        double result = this.x + this.y;
        logger.info("Adding {} and {} = {}", this.x, this.y, result);
        return result;
    }

    public double subtract() {
        double result = this.x - this.y;
        return this.x - this.y;
    }

    public double multiply() {
        return this.x * this.y;
    }

    public double division() {
        return this.x / this.y;
    }

    // Converts a double to its string representation
    public String print(double value) {
        String result = String.valueOf(value);
        logger.info("Converted result {} to string '{}'", value, result);
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5.5, 4.5);

        // Example usage
//        double sum = calculator.add(5.5, 4.5); // Perform addition
//        double sub = calculator.sub(5.5, 4.5);
//        double mul = calculator.mul(5.5, 4.5);
//        double div = calculator.div(5.5, 4.5);
        double sum = calculator.add(); // Perform addition
        double sub = calculator.subtract();
        double mul = calculator.multiply();
        double div = calculator.division();
        // Print the result to console
        System.out.println("String representation of sum: " + calculator.print(sum));
        System.out.println("String representation of subtraction: " + calculator.print(sub));
        System.out.println("String representation of multiplication: " + calculator.print(mul));
        System.out.println("String representation of division: " + calculator.print(div));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
