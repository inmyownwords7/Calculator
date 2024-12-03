package org.web;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    // Helper method to verify all operations
    private void verifyCalculatorOperations(Calculator calculator, double expectedAdd, double expectedSubtract,
                                            double expectedMultiply, String expectedDivide) {
        assertEquals(expectedAdd, calculator.add(), 1e-9, "Addition result is incorrect.");
        assertEquals(expectedSubtract, calculator.subtract(), 1e-9, "Subtraction result is incorrect.");
        assertEquals(expectedMultiply, calculator.multiply(), 1e-9, "Multiplication result is incorrect.");
        assertEquals(expectedDivide, calculator.safeDivision(), "Division result is incorrect.");
    }

    @Test
    public void testBasicOperations() {
        Calculator calculator = new Calculator(5.5, 4.5);
        verifyCalculatorOperations(calculator, 10.0, 1.0, 24.75, "1.2222222222222223");
    }

    @Test
    public void testDivisionByZeroHandling() {
        Calculator calculator = new Calculator(3.5, 0.0);
        verifyCalculatorOperations(calculator, 3.5, 3.5, 0.0, "Error: Division by zero");
    }

    @Test
    public void testIterateOverCalculators() {
        Calculator[] calculators = {
                new Calculator(5.5, 4.5),
                new Calculator(3.5, 0.0),
                new Calculator(7.0, 3.0)
        };

        // Validate all calculators
        verifyCalculatorOperations(calculators[0], 10.0, 1.0, 24.75, "1.2222222222222223");
        verifyCalculatorOperations(calculators[1], 3.5, 3.5, 0.0, "Error: Division by zero");
        verifyCalculatorOperations(calculators[2], 10.0, 4.0, 21.0, "2.3333333333333335");
    }
}
