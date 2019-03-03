package microservices.book.socialmultiplication.controller;

import microservices.book.socialmultiplication.model.Multiplication;
import microservices.book.socialmultiplication.service.MultiplicationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MultiplicationControllerTest {

    @InjectMocks
    MultiplicationController controller;

    @Mock
    MultiplicationService service;

    @Test
    public void getRandomMultiplication() {
        Multiplication multiplication = new Multiplication(5, 6);
        when(service.createRandomMultiplication()).thenReturn(multiplication);

        Multiplication problem = controller.getRandomProblem();

        assertEquals(multiplication, problem);
    }
}