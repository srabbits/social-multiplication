package microservices.book.socialmultiplication.service;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class RandomGeneratorServiceTest {

    private RandomGeneratorService randomGeneratorService;
    @Before
    public void runBeforeEveryTest(){
        randomGeneratorService = new RandomGeneratorService();
    }
    @Test
    public void randomNumberFromElevenToNinetyNine(){
        for(int i = 0; i < 10000; i++){
        int r  =  randomGeneratorService.generateRandomFactor();
        assertTrue(r >= 11);
        assertTrue(r <= 99);
        }
    }
    @Test
    public void generateRandomFactorIsBetweenExpectedLimits() throws Exception {
        // when a good sample of randomly generated factors is generated
        List<Integer> randomFactors = IntStream.range(0, 1000)
                .map(i -> randomGeneratorService.generateRandomFactor())
                .boxed().collect(Collectors.toList());

        // then all of them should be between 11 and 100
        // because we want a middle-complexity calculation
        assertThat(randomFactors).containsOnlyElementsOf(IntStream.range(11, 100)
                .boxed().collect(Collectors.toList()));
    }

}