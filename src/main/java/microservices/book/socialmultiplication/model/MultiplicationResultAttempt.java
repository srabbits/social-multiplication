package microservices.book.socialmultiplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiplicationResultAttempt {
    private User user;
    private Multiplication multiplication;
    private int resultAttempt;
}
