package springBootJsp.springBootJsp.main5;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Data
@Slf4j
public class MyInfo {

    private String name;
    private double height;
    private double weight;
    private ArrayList<String> hobby;
    private BMICalculator bmiCalculator;

    public void bmiCalculation() {
        bmiCalculator.bmiCalculation(weight, height);
    }

    public void getInfo() {
        log.info("이름: " + name);
        log.info("키: " + height);
        log.info("몸무게: " + weight);
        log.info("취미: " + hobby);
        bmiCalculation();
    }
}
