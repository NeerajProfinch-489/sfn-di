package neeraj.springframework.sfndi.controller;

import neeraj.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {
    SetterInjectionController setterInjectionController;

    @BeforeEach
    void setUp() {
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingServices(new ConstructorGreetingService());
    }

    @Test
    void getGreetingServices() {
        System.out.println(setterInjectionController.getGreetingServices());
    }
}