package springBootJsp.springBootJsp.main3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

    public void addition(int f, int s) {
        log.info("addition()");
        int result = f + s;
        log.info(f + "+" + s + " = " + result);
    }

    public void subtraction(int f, int s) {
        log.info("subtraction()");
        int result = f - s;
        log.info(f + "-" + s + " = " + result);
    }
    public void multiplication(int f, int s) {
        log.info("multiplication()");
        int result = f * s;
        log.info(f + "*" + s + " = " + result);
    }
    public void division(int f, int s) {
        log.info("division()");
        int result = f / s;
        log.info(f + "/" + s + " = " + result);
    }
}
