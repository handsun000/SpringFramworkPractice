package springBootJsp.springBootJsp.main13;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Student {

    private String name;
    private int age;
    private int gradeNum;
    private int classNum;

    public void getStudentInfo() {
        log.info("이름 : " + getName());
        log.info("나이 : " + getAge());
        log.info("학년 : " + getGradeNum());
        log.info("반 : " + getClassNum());
    }
}
