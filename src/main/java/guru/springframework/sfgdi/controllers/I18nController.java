package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by laksheenmendis on 5/22/20 at 5:50 PM
 */
@Controller
public class I18nController {

    private final GreetingService greetingService;

    // Since both of the English and Spanish Greeting Services are having the qualifier, "i18nService"
    // in the @Service annotation, in here Spring will not know actually which bean should be used
    // thus, it is giving an error
    // therefore use @Profile annotation in implementations and specify the active profiles
    // in application.properties
    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
