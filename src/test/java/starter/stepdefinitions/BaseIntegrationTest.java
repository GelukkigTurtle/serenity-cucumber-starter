package starter.stepdefinitions;

import io.cucumber.java.Before;
import lombok.extern.java.Log;
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
@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(basePackages = {"starter","starter.utils"})
@SpringBootTest(classes = {CucumberTestSuite.class})
@EnableAutoConfiguration
@ActiveProfiles(value = "test")
@Slf4j
public class BaseIntegrationTest {

    @Test
    public void contextLoads() {
        System.out.println("IT's FRIDAY MDFKSRS");
    }

}