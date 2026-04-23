import java.util.Random;

public class Exercise4 {

    public static void question1() {
        Random random = new Random();
        int number = random.nextInt();
        System.out.println(number);
    }

    public static void question2() {
        Random random = new Random();
        double number = random.nextDouble();
        System.out.println(number);
    }

    public static void question3() {
        String[] names = {"An", "Bình", "Quân", "Dũng", "Hà"};

        Random random = new Random();
        int index = random.nextInt(names.length);

        System.out.println("Tên random: " + names[index]);
    }

    public static void question7() {
        Random random = new Random();

        int number = random.nextInt(900) + 100;
        System.out.println(number);
    }
}
