package microservices.book.socialmultiplication.service;

import microservices.book.socialmultiplication.model.Multiplication;
import microservices.book.socialmultiplication.model.MultiplicationResultAttempt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {
    @Autowired
    RandomGeneratorService randomGeneratorService;

    public Multiplication createRandomMultiplication() {
        int factorA = randomGeneratorService.generateRandomFactor();
        int factorB = randomGeneratorService.generateRandomFactor();
        return new Multiplication(factorA, factorB);
    }

    public boolean checkAttempt(MultiplicationResultAttempt resultAttempt) {
        int result = resultAttempt.getMultiplication().getFactorA() * resultAttempt.getMultiplication().getFactorB();
        return resultAttempt.getResultAttempt() == result;
    }
}
