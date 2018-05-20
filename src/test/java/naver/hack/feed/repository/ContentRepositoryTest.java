package naver.hack.feed.repository;

import naver.hack.feed.container.ContentResponse;
import naver.hack.feed.dto.ContentDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ContentRepositoryTest {
    @Autowired
    private ContentRepository repository;

    @Test
    public void test() {

    }
}
