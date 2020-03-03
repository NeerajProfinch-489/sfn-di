package neeraj.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World ! -- PRIMARY Bean Greeting Service";
    }
}
