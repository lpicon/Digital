import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Test {

    @RequestMapping("/")
    String saludar() {
        return "Hola Spring Boot";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Test.class, args);
    }
}
