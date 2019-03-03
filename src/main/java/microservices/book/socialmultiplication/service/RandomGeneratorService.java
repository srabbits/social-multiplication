package microservices.book.socialmultiplication.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomGeneratorService {
    public Integer generateRandomFactor() {
        Random r  = new Random();
      int j =  r.nextInt(89 ) + 11;
        return j;
    }
}
