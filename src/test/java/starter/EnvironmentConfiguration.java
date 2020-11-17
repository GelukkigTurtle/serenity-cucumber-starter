package starter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value={"classpath:application.properties"})
public class EnvironmentConfiguration {


    @Value("${HOST:localhost}")
    private String host;

    @Value("${PORT:3000}")
    private String port;

    @Value("${PROTOCOL:http}")
    private String protocol;

    @Value("${TITLE:nullpedan}")
    private String title;


    public String getTitle() {
        return title + " OH";
    }
}
