import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise2 {

    public static void question1() {
        int number = 5;
        System.out.printf("Số nguyên là: %d", number);
        System.out.println();
    }

    public static void question2() {
        int number = 100_000_000;
        System.out.printf("%,d", number);
        System.out.println();
    }

    public static void question3() {
        double number = 5.567098;
        System.out.printf("%.4f", number);
        System.out.println();
    }

    public static void question4() {
        String fullName = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.", fullName);
        System.out.println();
    }

    public static void question5() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");

        System.out.println(now.format(formatter));

    }
}
