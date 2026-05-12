import backend.QLAccount;
import backend.QLDepartment;
import backend.QLPosition;
import frontend.AccountFunction;
import frontend.DepartmentFunction;
import frontend.PositionFunction;
import utils.JDBCUtils;

import java.util.Scanner;


public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        while (true) {
            System.out.println("=== Mời bạn chọn chức năng ===");
            System.out.println("1. Các chức năng liên quan đến department");
            System.out.println("2. Các chức năng liên quan đến account");
            System.out.println("3. Các chức năng liên quan đến position");
            System.out.println("4. thoát");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    DepartmentFunction.run();
                    break;
                case "2":
                    AccountFunction.run();
                    break;
                case "3":
                    PositionFunction.run();
                    break;
                case "4":
                    return;
                default: System.out.println("Nhập sai, nhập lại.");
            }
        }
    }
}

