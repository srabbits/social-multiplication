package microservices.book.socialmultiplication.autowire_example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cat {
    @Autowired
    private Fur fur;
    @Autowired
    private Leg leg;
    @Autowired
    private Tail tail;
}
