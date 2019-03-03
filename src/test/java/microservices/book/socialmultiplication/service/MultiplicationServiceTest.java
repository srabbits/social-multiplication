package microservices.book.socialmultiplication.service;


import microservices.book.socialmultiplication.model.Multiplication;
import microservices.book.socialmultiplication.model.MultiplicationResultAttempt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)

public class MultiplicationServiceTest {
    @Mock
    private RandomGeneratorService randomGeneratorService;
    @InjectMocks
    private MultiplicationService multiplicationService;

    @Test
    public void createRandomMultiplicationTest() {
        // given (our mocked Random Generator service will return first 50, then 30)
        when(randomGeneratorService.generateRandomFactor()).thenReturn(50, 30);

        // when
        Multiplication multiplication = multiplicationService.createRandomMultiplication();

        // then
        assertEquals(50, multiplication.getFactorA());
        assertEquals(30, multiplication.getFactorB());
        verify(randomGeneratorService, times(2)).generateRandomFactor();
    }

    @Test
    public void createRandomMultiplicationTest2() {
        when(randomGeneratorService.generateRandomFactor()).thenReturn(4, 5);

        // when
        Multiplication multiplication = multiplicationService.createRandomMultiplication();

        // then
        assertEquals(4, multiplication.getFactorA());
        assertEquals(5, multiplication.getFactorB());
    }

    @Test
    public void checkAttemptIsCorrectReturnsTrue() {
        MultiplicationResultAttempt resultAttempt = new MultiplicationResultAttempt(null, new Multiplication(20, 30), 600);
        assertTrue(multiplicationService.checkAttempt(resultAttempt));
    }

    @Test
    public void checkAttemptIsWrongReturnsFalse() {
        MultiplicationResultAttempt resultAttempt = new MultiplicationResultAttempt(null, new Multiplication(20, 30), 60);
        assertFalse(multiplicationService.checkAttempt(resultAttempt));
    }
}

