package guru.springframework.sfgdi.services;

/**
 * Created by laksheenmendis on 5/19/20 at 10:15 PM
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
