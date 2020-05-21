package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by laksheenmendis on 5/19/20 at 10:15 PM
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
