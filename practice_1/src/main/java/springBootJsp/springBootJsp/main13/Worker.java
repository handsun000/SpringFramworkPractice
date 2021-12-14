package springBootJsp.springBootJsp.main13;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Worker {

    private String name;
    private int age;
    private String job;

    public void getWorkerInfo() {
        log.info("이름 : " + getName());
        log.info("나이 : " + getAge());
        log.info("직업 : " + getJob());
    }
}
