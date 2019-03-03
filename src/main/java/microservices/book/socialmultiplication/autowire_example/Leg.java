package microservices.book.socialmultiplication.autowire_example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Leg {
    @Autowired
    private Paw paw;
}
