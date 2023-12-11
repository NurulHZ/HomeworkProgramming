package HomeWork4;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Angka Pertama: ");
        double num1 = input.nextDouble();

        System.out.print("Pilih Operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Input Angka kedua: ");
        double num2 = input.nextDouble();

        Calculator calculator = new Calculator(num1, num2, operator);
        double result = calculator.calculate();

        if (Double.isNaN(result)) {
            System.out.println("Error: Invalid operator or division by zero.");
        } else {
            System.out.println("Hasil: " + result);
        }
    }
}

class Calculator {
    private double num1;
    private double num2;
    private char operator;

    public Calculator(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double calculate() {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN;
                }
            default:
                return Double.NaN;
        }
    }
}
