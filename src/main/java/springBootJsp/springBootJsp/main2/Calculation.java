package springBootJsp.springBootJsp.main2;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Calculation {

    private int firstNum;
    private int secondNum;

    public void add() {
        log.info("add()");
        log.info(firstNum + "+" + secondNum + " = " + (firstNum + secondNum));
    }

    public void sub() {
        log.info("sub()");
        log.info(firstNum + "-" + secondNum + " = " + (firstNum - secondNum));
    }

    public void mul() {
        log.info("mul()");
        log.info(firstNum + "*" + secondNum + " = " + (firstNum * secondNum));
    }

    public void div() {
        log.info("div()");
        log.info(firstNum + "/" + secondNum + " = " + (firstNum / secondNum));
    }
}
