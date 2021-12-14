package springBootJsp.springBootJsp.main3;

import lombok.Data;

@Data
public class MyCalculator {
    Calculator calculator;
    private int firstNum;
    private int secondNum;

    public MyCalculator() {
    }

    public void add() {
        calculator.addition(firstNum, secondNum);
    }

    public void sub() {
        calculator.subtraction(firstNum, secondNum);
    }

    public void mul() {
        calculator.multiplication(firstNum, secondNum);
    }

    public void div() {
        calculator.division(firstNum, secondNum);
    }
}
