package starter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import starter.stepdefinitions.BaseIntegrationTest;

@NoArgsConstructor
//@ContextConfiguration(classes = BaseIntegrationTest.class)
@Component
public class EnvironmentConfiguration {


    @Value("${HOST:localhost}")
    private String host;

    @Value("${PORT:3000}")
    private String port;

    @Value("${PROTOCOL:http}")
    private String protocol;

    @Value("${TITLE:null}")
    private String title;


    public String getTitle() {
        return title + " OH";
    }
}
