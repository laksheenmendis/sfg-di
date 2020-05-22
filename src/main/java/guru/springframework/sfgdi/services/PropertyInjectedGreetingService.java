package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by laksheenmendis on 5/22/20 at 4:48 PM
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World-Property";
    }
}
