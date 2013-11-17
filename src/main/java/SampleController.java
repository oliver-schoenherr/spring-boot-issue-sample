import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

  @Value("${message}")
  private String message;

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return message;
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SampleController.class, args);
  }
}