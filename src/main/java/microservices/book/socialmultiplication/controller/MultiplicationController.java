package microservices.book.socialmultiplication.controller;

import microservices.book.socialmultiplication.model.Multiplication;
import microservices.book.socialmultiplication.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("multiplications")
public class MultiplicationController {
    @Autowired
    MultiplicationService multiplicationService;

@GetMapping("random")
    public Multiplication getRandomProblem() {
        return multiplicationService.createRandomMultiplication();
    }
}
