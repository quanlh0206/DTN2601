package entity;

import java.time.Duration;
import java.time.LocalDate;

public class Exam {
   private int ExamId;
   private int code;
   private String title;
   private CategoryQuestion categoryQuestion;
   private Account creator;
   private Duration duration;
   private LocalDate createDate;

    public int getExamId() {
        return ExamId;
    }

    public void setExamId(int examId) {
        ExamId = examId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategoryQuestion() {
        return categoryQuestion;
    }

    public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
        this.categoryQuestion = categoryQuestion;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}