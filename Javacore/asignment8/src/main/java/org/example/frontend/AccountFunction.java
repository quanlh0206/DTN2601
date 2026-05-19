package org.example.frontend;

import org.example.backend.controller.AccountController;
import org.example.entity.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountFunction {
    private static Scanner sc = new Scanner(System.in);
    AccountController accountController = new AccountController();

    public void run() {
        List<Account> accounts = new ArrayList<>();
        while (true) {
            System.out.println("=== Mời bạn chọn chức năng ===");
            System.out.println("1. Xem ds account");
            System.out.println("2. Thêm mới account");
            System.out.println("3. Xóa account theo ID");
            System.out.println("4. Update account theo ID");
            System.out.println("5. Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    accounts = accountController.findAll();
                    this.showAccount(accounts);
                    break;
                case "2":
                    insertAccount();
                    break;
                case "3":
                    deleteAccount();
                    break;
                case "4":
                    updateAccount();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Nhập sai, nhập lại.");
            }
        }
    }


    public void showAccount(List<Account> accounts) {
        System.out.println("+-----+----------------------+----------------------+----------------------+----------------------+----------------------+");
        System.out.printf(
                "|%5s|%22s|%22s|%22s|%22s|%22s|\n",
                "ID",
                "Full Name",
                "Email",
                "Username",
                "Department",
                "Position"
        );
        System.out.println("+-----+----------------------+----------------------+----------------------+----------------------+----------------------+");
        for (Account account : accounts) {
            System.out.printf(
                    "|%5d|%22s|%22s|%22s|%22s|%22s|\n",
                    account.getId(),
                    account.getFullName(),
                    account.getEmail(),
                    account.getUsername(),
                    account.getDepartment().getName(),
                    account.getPosition().getName().name()
            );
        }
        if (accounts.size() == 0) {
            System.out.println("Không tìm thấy");
        }
        System.out.println("+-----+----------------------+----------------------+----------------------+----------------------+----------------------+");
    }

    public void deleteAccount() {
        System.out.println("Nhập ID account cần xóa: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean check = accountController.delete(id);
        if (check) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }

    public void updateAccount() {
        System.out.println("Nhập ID account cần sửa: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập full name mới: ");
        String fullName = sc.nextLine();
        boolean check = accountController.update(id, fullName);
        if (check) {
            System.out.println("Update thành công");
        } else {
            System.out.println("Update thất bại");
        }
    }

    public void insertAccount() {
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        System.out.println("Nhập full name: ");
        String fullName = sc.nextLine();
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập department id: ");
        int departmentId = sc.nextInt();
        System.out.println("Nhập position id: ");
        int positionId = sc.nextInt();
        sc.nextLine();
        boolean check = accountController.insert(username, fullName, email, departmentId, positionId);
        if (check) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }
}
