package springBootJsp.springBootJsp.main5;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class BMICalculator {

    private double lowWeight;
    private double normal;
    private double overWeight;
    private double obesity;

    public void bmiCalculation(double weight, double height) {

        double h = height * 0.01;
        double result = weight / (h * h);

        log.info("BMI 지수: " + (int) result);

        if (result > obesity) {
            log.info("비만입니다.");
        } else if (result > overWeight) {
            log.info("과체중 입니다.");
        } else if (result < normal) {
            log.info("정상 입니다.");
        } else log.info("저체중 입니다.");
    }

}
