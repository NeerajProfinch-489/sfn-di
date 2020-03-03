package neeraj.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("i18nService")
public class I18SpanishGreetingServices implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hola - ES";
    }
}
