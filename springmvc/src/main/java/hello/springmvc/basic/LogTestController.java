package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";

        log.trace("trace log={}", name);
        // + 이용하여 쓰면 안된다 출력 안하더라도 연산을 하게 됨
        log.trace("trace log=" + name);
        log.debug("trace log={}", name);

        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);
        return "OK";
    }
}
