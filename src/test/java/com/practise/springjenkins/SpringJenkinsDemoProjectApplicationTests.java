package com.practise.springjenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
class SpringJenkinsDemoProjectApplicationTests {

    @Test
    void contextLoads() {
        log.info("Test case executing...");
		Assertions.assertTrue(true);
    }

}
