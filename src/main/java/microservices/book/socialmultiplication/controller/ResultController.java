package microservices.book.socialmultiplication.controller;

import microservices.book.socialmultiplication.model.MultiplicationResultAttempt;
import microservices.book.socialmultiplication.model.ResultResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/results")
public class ResultController {

    /**POST /results/ will be our endpoint to send results.

     GET /results?user=[user_alias] will be our way of retrieving results of a particular user.
     */
    @PostMapping
    public ResultResponse postAnswer(@RequestBody MultiplicationResultAttempt attempt){
        return new ResultResponse();
    }
}
