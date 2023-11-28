package semianr.third;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar.third.CalculatorModel;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {
    private CalculatorModel calculatorModel = null;

    @BeforeEach
    void setUp() {
        calculatorModel = new CalculatorModel();
    }

    @AfterEach
    void tearDown() {
        calculatorModel = null;
    }

    @Test
    void add() {
        calculatorModel.add(2, 3);
        assertEquals(5, calculatorModel.getResult());
    }

    @Test
    void subtract() {
        calculatorModel.subtract(2, 3);
        assertEquals(-1, calculatorModel.getResult());
    }

    @Test
    void multiply() {
        calculatorModel.multiply(2, 3);
        assertEquals(6, calculatorModel.getResult());
    }

    @Test
    void divide() {
        calculatorModel.divide(2, 2);
        assertEquals(1, calculatorModel.getResult());
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculatorModel.divide(3, 0));
    }

    @Test
    void getResult() {
        assertEquals(0, calculatorModel.getResult());
    }
}