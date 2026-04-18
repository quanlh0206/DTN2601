import java.time.LocalDate;

public class Question {
    int questionId;
    String content;
    CategoryQuestion categoryQuestion;
    TypeQuestion typeQuestion;
    Account creator;
    LocalDate createDate;
}