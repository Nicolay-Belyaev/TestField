package homework_03.hw;

public class MainHW {
    public boolean result;

    public MainHW () {
    }

    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public void evenOddNumber(int number) {
        result = number % 2 == 0;
    }

    // HW 3.2. Нужно написать метод, который проверяет, попадает ли переданное число в интервал (25;100)
    // и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    public void isInInterval (int number) {
        result = number > 25 && number < 100;
    }

    public boolean getResult () {
        return result;
    }

}
