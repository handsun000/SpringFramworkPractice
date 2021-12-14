package springBootJsp.springBootJsp.main7;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Pencil6BWithEraser implements Pencil{

    @Override
    public void use() {
        log.info("6B 굵기로 쓰이고, 지우개가 있습니다.");
    }
}
