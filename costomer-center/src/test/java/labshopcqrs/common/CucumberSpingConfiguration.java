package labshopcqrs.common;


import labshopcqrs.CostomerCenterApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CostomerCenterApplication.class })
public class CucumberSpingConfiguration {
    
}
