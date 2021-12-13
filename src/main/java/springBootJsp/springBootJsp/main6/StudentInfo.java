package springBootJsp.springBootJsp.main6;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Setter
@Slf4j
public class StudentInfo {

    private Student student;

    public void getStudentInfo() {
        if (student != null) {
            log.info("이름: " + student.getName());
            log.info("나이: " + student.getAge());
            log.info("학년: " + student.getGradeNum());
            log.info("반: " + student.getClassNum());
            log.info("==================================");
        }
    }
}
