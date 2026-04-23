import java.util.Scanner;

public class Exercise5 {

    public static void question1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ ba: ");
        int c = scanner.nextInt();

        System.out.println("Bạn vừa nhập: " + a + ", " + b + ", " + c);
    }

    public static void question2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thực thứ nhất: ");
        float a = scanner.nextFloat();

        System.out.print("Nhập số thực thứ hai: ");
        float b = scanner.nextFloat();

        System.out.println("Bạn vừa nhập: " + a + ", " + b);
    }

    public static void question3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();

        System.out.println("Họ tên: " + fullName);
    }

    public static void question4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày sinh: ");
        String birthday = scanner.nextLine();

        System.out.println("Ngày sinh: " + birthday);
    }

    public static void question6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên department: ");
        String departmentName = scanner.nextLine();

        System.out.println("Department vừa tạo: " + departmentName);
    }

    public static void question7() {
        Scanner scanner = new Scanner(System.in);

        int number;

        while (true) {
            System.out.print("Nhập số chẵn: ");
            number = scanner.nextInt();

            if (number % 2 == 0) {
                break;
            } else {
                System.out.println("Sai rồi.Vui lòng nhập lại");
            }
        }

        System.out.println("Bạn đã nhập số chẵn: " + number);
    }
}
