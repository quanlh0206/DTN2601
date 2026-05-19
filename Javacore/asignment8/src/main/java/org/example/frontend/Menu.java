package org.example.frontend;

import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("=== Mời bạn chọn chức năng ===");
            System.out.println("1. Các chức năng liên quan đến department");
            System.out.println("2. Các chức năng liên quan đến account");
            System.out.println("3. Các chức năng liên quan đến position");
            System.out.println("4. thoát");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    DepartmentFunction departmentFunction = new DepartmentFunction();
                    departmentFunction.run();
                    break;
                case "2":
                    AccountFunction accountFunction = new AccountFunction();
                    accountFunction.run();
                    break;
                case "3":
                    PositionFunction positionFunction = new PositionFunction();
                    positionFunction.run();
                    break;
                case "4":
                    return;
                default: System.out.println("Nhập sai, nhập lại.");
            }
        }
    }
}
