package starter.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import starter.EnvironmentConfiguration;

@Component
public class MathUtils {

    @Autowired
    EnvironmentConfiguration environmentConfiguration;

    public MathUtils(){
        System.out.println("MATH CONSTRUCTOR WORKS!!  ");
    }

    public String saludo(){
        return environmentConfiguration.getTitle();
    }



}
