package neeraj.springframework.sfndi.controller;


import neeraj.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingServices greetingServices;


    public String getGreetingServices() {
        return greetingServices.sayGreeting();
    }
    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingServices(GreetingServices services){
        greetingServices = services;
    }

}
