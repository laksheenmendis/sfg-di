package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by laksheenmendis on 5/22/20 at 4:49 PM
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World-Setter";
    }
}
