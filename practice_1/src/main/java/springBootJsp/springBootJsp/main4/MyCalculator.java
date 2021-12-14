package springBootJsp.springBootJsp.main4;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class MyCalculator {

    private Calculator calculator;
    private int firstName;
    private int secondNum;

    public void add() {
        calculator.addition(firstName, secondNum);
    }

    public void sub() {
        calculator.subtraction(firstName, secondNum);
    }

    public void mul() {
        calculator.multiplication(firstName, secondNum);
    }

    public void div() {
        calculator.division(firstName, secondNum);
    }
}
