package frontend;

import backend.QLAccount;
import entity.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountFunction {

    private static Scanner sc = new Scanner(System.in);

    public static void run() {
        List<Account> accounts = new ArrayList<>();
        while (true) {
            System.out.println("=== Mời bạn chọn chức năng ===");
            System.out.println("1. Xem ds account");
            System.out.println("2. Thêm mới account");
            System.out.println("3. Xóa account theo username");
            System.out.println("4. Update account theo ID");
            System.out.println("5. Tìm kiếm account theo username");
            System.out.println("6. Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    accounts = QLAccount.showAccount();
                    showAccount(accounts);
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
                    findByUsername();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Nhập sai, nhập lại.");
            }
        }
    }

    public static void findByUsername() {
        System.out.println("Nhập username cần tìm: ");
        String username = sc.nextLine();
        List<Account> accounts = QLAccount.findAccountByUsername(username);
        showAccount(accounts);
    }

    public static void showAccount(List<Account> accounts) {
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

    public static void deleteAccount() {
        System.out.println("Nhập username account cần xóa: ");
        String username = sc.nextLine();
        boolean check = QLAccount.deleteAccount(username);
        if (check) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }

    public static void updateAccount() {
        System.out.println("Nhập ID account cần sửa: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập full name mới: ");
        String fullName = sc.nextLine();
        boolean check = QLAccount.updateAccount(id, fullName);
        if (check) {
            System.out.println("Update thành công");
        } else {
            System.out.println("Update thất bại");
        }
    }

    public static void insertAccount() {
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
        boolean check = QLAccount.insertAccount(username, fullName, email, departmentId, positionId);
        if (check) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }
}