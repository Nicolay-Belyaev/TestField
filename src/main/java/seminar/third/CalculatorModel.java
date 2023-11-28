package seminar.third;

public class CalculatorModel {
    private double result;

    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    public void subtract(double num1, double num2) {
        result = num1 - num2;
    }

    public void multiply(double num1, double num2) {
        result = num1 * num2;
    }

    public void divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("You can't divide by zero!");
        }
        result = num1 / num2;
    }

    public double getResult() {
        return result;
    }
}
