package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by laksheenmendis on 5/20/20 at 11:15 AM
 */
// most preferred way for Dependency Injection
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //@Autowired annotation is not required from Spring 4 onwards
    //for Constructor Injected dependencies
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
