package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by laksheenmendis on 5/19/20 at 10:15 PM
 */
// this is the least preferred way for Dependency Injection
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
