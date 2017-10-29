import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class WebController {

    @RequestMapping("/")
    String home() {
        return "SelfVitalize: Productivity management for you!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebController.class, args);
    }

}
