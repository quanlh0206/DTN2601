import java.time.format.DateTimeFormatter;

public class Exercise3 {

    public static void question1(Exam exam) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Thông tin Exam:");
        System.out.println("ID: " + exam.ExamId);
        System.out.println("Code: " + exam.code);
        System.out.println("Title: " + exam.title);
        System.out.println("Create Date: " + exam.createDate.format(formatter));
    }

    public static void question2(Exam exam) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Exam đã tạo ngày: " +
                exam.createDate.format(formatter));
    }

    public static void question3(Exam exam) {
        System.out.println("Năm tạo exam: " + exam.createDate.getYear());
    }

    public static void question4(Exam exam) {
        System.out.println("Tháng/Năm tạo exam: " +
                exam.createDate.getMonthValue() + "/" +
                exam.createDate.getYear());
    }

    public static void question5(Exam exam) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        System.out.println("Create Date " +
                exam.createDate.format(formatter));
    }
}
