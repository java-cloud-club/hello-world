package club.javacloud.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static club.javacloud.helloworld.HelloWorldApplication.iAmMemoryLeak;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/")
    public String sayHello()
    {
        for (int i = 1; i < 10000; ++i) {
            iAmMemoryLeak.add("life is nice");
        }

        return "Hello World!";
    }
}
