package com.cnu.real_coding_server.service.week1.base.service;

import java.util.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("dev")
@SpringBootTest
class PostBaseServiceTest {
    Logger logger = Logger.getLogger("테스트");

    @DisplayName("테스트 코드 실행해보기")
    @Test
    void testDoCode() {
        System.out.println("테스트 코드 실행");
        logger.info("테스트 코드 실행!");
    }

}