package neeraj.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World - PropertyGreetingService";
    }
}
