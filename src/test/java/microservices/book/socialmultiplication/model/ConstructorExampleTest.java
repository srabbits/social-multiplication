package microservices.book.socialmultiplication.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorExampleTest {


    @Test
    public void constructorExample(){
        ConstructorExample c = new ConstructorExample("turtle", 2);
        System.out.println(c);
        c=new ConstructorExample("dog");
        System.out.println(c);
        c = new ConstructorExample();
        System.out.println(c);
    }



}