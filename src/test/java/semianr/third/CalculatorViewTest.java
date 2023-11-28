package semianr.third;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar.third.CalculatorView;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private CalculatorView calculatorView;

    @BeforeEach
    public void setUpStreams() {
        // Перехватываем стандартный вывод (System.out)
        System.setOut(new PrintStream(outContent));

        // Создаем объект CalculatorView перед каждым тестом
        calculatorView = new CalculatorView();
    }

    @AfterEach
    public void restoreStreams() {
        // Восстанавливаем оригинальный стандартный вывод
        System.setOut(originalOut);
    }

    @Test
    public void testDisplayResult() {
        // Вызываем метод displayResult с аргументом 10.0
        calculatorView.displayResult(10.0);

        // Проверяем, что вывод соответствует ожидаемому результату
        assertEquals("Результат: 10.0", outContent.toString().trim());
    }
}