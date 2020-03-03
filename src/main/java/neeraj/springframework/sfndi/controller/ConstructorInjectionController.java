package neeraj.springframework.sfndi.controller;

import neeraj.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private GreetingServices greetingServices;

    public ConstructorInjectionController(@Qualifier("constructorGreetingService") GreetingServices greetingServices){
        this.greetingServices = greetingServices;
    }
    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
