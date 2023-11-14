package seminar.first.Calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {
    @Test
    @DisplayName("Сложение")
    void calculationSum() {
        assertEquals(8, Calculator.calculation(4, 4, '+'));
    }

    @Test
    @DisplayName("Вычитание")
    void calculationSubtraction() {
        assertEquals(2, Calculator.calculation(4, 2, '-'));
    }

    @Test
    @DisplayName("Умножение")
    void calculationMultiply() {
        assertEquals(8, Calculator.calculation(4, 2, '*'));
    }

    @Test
    @DisplayName("Деление")
    void calculationDivision() {
        assertEquals(4, Calculator.calculation(8, 2, '/'));
    }

    @Test
    @DisplayName("Деление на ноль")
    void calculationDivideByZero() {
        assertThatThrownBy(() ->
                Calculator.calculation(8, 0, '/')
        ).isInstanceOf(ArithmeticException.class);
    }

    @Test
    @DisplayName("Некорректный оператор")
    void calculationWrongOperator() {
        assertThatThrownBy(() ->
                Calculator.calculation(8, 0, ')')
        ).isInstanceOf(IllegalStateException.class);
    }

    @Test
    @DisplayName("Квадратный корень")
    void squareRootExtraction() {
        assertEquals(3, Calculator.squareRootExtraction(9));
    }

    @Test
    @DisplayName("Квадратный корень отрицательного числа")
    void squareRootExtractionLessThanZero() {
        assertThatThrownBy(() ->
                Calculator.squareRootExtraction(-1)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Квадратный корень нуля")
    void squareRootExtractionZero() {
        assertEquals(0, Calculator.squareRootExtraction(0));
    }

    @Test
    @DisplayName("Вычисление цены со скидкой")
    void calculatingDiscount() {
        assertEquals(90, Calculator.calculatingDiscount(100, 10));
    }

    @Test
    @DisplayName("Отрицательные значения цены и/или скидки")
    void calculatingDiscountWrongArgs() {
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-1, 10)
        ).isInstanceOf(IllegalArgumentException.class);
    }
}