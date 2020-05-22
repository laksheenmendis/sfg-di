package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by laksheenmendis on 5/19/20 at 7:55 PM
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    // here we haven't added the @Qualifier annotation. Thus, Spring will not be sure which
    // GreetingService to use. If one of the implementations are annotated with @Primary
    // annotations, it will use it.
    // However, @Qualifier will have precedence over @Primary
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
