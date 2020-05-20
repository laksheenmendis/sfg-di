package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by laksheenmendis on 5/19/20 at 7:55 PM
 */

@Controller
public class MyController {

    public String sayHello()
    {
        System.out.println("Hello World!!");

        return "Hi Folks!";
    }
}
