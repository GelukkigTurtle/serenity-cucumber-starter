package starter.stepdefinitions;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import starter.CucumberTestSuite;

@ContextConfiguration
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan({"com.wr.ui.automation.utils","com.wr.ui.automation"})
@SpringBootTest(classes = {CucumberTestSuite.class})
@EnableAutoConfiguration
@ActiveProfiles("test")
public class BaseIntegrationTest {

    @Test
    public void contextLoads() {
        System.out.println("IT's FRIDAY MDFKSRS");
    }

}