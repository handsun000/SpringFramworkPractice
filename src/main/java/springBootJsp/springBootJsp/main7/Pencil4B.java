package springBootJsp.springBootJsp.main7;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Pencil4B implements Pencil {

    @Override
    public void use() {
        log.info("4B 굵기로 쓰입니다.");
    }
}
