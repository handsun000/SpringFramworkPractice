package springBootJsp.springBootJsp.main6;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
public class Student {

    private String name;
    private String age;
    private String gradeNum;
    private String classNum;
}
