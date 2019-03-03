package microservices.book.socialmultiplication.autowire_example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DogTest {
    @Autowired
    Dog dog;

    @Autowired
    Cat cat;

    @MockBean
    Paw paw;

    @Test
    public void printDog() {
        when(paw.getNailColor()).thenReturn("Clear");
        System.out.println(dog);
        System.out.println(dog.getLeg().getPaw().getNailColor());
        System.out.println(cat.getLeg().getPaw().getNailColor());
    }
}