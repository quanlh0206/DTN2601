public class Exercise6 {

    public static void question1() {
        System.out.println("Các số chẵn nhỏ hơn 10:");

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void question2(Account[] accounts) {

        System.out.println("DANH SÁCH ACCOUNT");

        for (Account acc : accounts) {

            System.out.println("ID: " + acc.accountId);
            System.out.println("Email: " + acc.email);
            System.out.println("Username: " + acc.userName);
            System.out.println("Fullname: " + acc.fullName);

            System.out.println("Department: " + acc.department.departmentName);

            System.out.println("Position: " + acc.position.positionName);

            System.out.println("Create Date: " + acc.createDate);

        }
    }

    public static void question3() {
        System.out.println("Các số nguyên dương nhỏ hơn 10:");

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}
