package homework_03.hw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    private MainHW mainhw;

    @BeforeEach
    void setUp() {
        mainhw = new MainHW();
    }

    @AfterEach
    void tearDown() {
        mainhw = null;
    }

    @Test
    void oddNumberTest() {
        mainhw.evenOddNumber(5);
        assertFalse(mainhw.getResult());
    }

    @Test
    void evenNumberTest() {
        mainhw.evenOddNumber(4);
        assertTrue(mainhw.getResult());
    }

    @ParameterizedTest
    @CsvSource({
            "10, false",
            "25, false",
            "26, true",
            "44, true",
            "99, true",
            "100, false"
    })
    void isInIntervalTest(int arg, boolean expectedResult) {
        mainhw.isInInterval(arg);
        assertEquals(expectedResult, mainhw.getResult());
    }
}