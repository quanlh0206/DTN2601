package backend;

import enums.PositionName;

import java.time.LocalDate;

public class Exercise1 {

//    public void question1() {
//        Department department1 = new Department();
//        Department department2 = new Department("abc");
//
//        System.out.println("Department 1:");
//        System.out.println("ID: " + department1.getDepartmentId());
//        System.out.println("Name: " + department1.getDepartmentName());
//
//        System.out.println("Department 2:");
//        System.out.println("ID: " + department2.getDepartmentId());
//        System.out.println("Name: " + department2.getDepartmentName());
//    }
//
//    public void question2() {
//        Account account1 = new Account();
//        Account account2 = new Account(1, "abc@gmail.com", "abc123", "Quân", "Lê");
//        Position position = new Position();
//        position.setPositionId(1);
//        position.setPositionName(PositionName.DEV);
//        Account account3 = new Account(1, "abc@gmail.com", "abc123", "Quân", "Lê", position);
//        Account account4 = new Account(1, "abc@gmail.com", "abc123", "Quân", "Lê", position, LocalDate.now());
//
//        System.out.println("Account 1:");
//        System.out.println("ID: " + account1.getAccountId());
//        System.out.println("Email: " + account1.getEmail());
//        System.out.println("Username: " + account1.getUserName());
//        System.out.println("FullName: " + account1.getFullName());
//        System.out.println("Position: " + account1.getPosition());
//        System.out.println("CreateDate: " + account1.getCreateDate());
//
//        System.out.println("\nAccount 2:");
//        System.out.println("ID: " + account2.getAccountId());
//        System.out.println("Email: " + account2.getEmail());
//        System.out.println("Username: " + account2.getUserName());
//        System.out.println("FullName: " + account2.getFullName());
//        System.out.println("Position: " + account2.getPosition());
//        System.out.println("CreateDate: " + account2.getCreateDate());
//
//        System.out.println("\nAccount 3:");
//        System.out.println("ID: " + account3.getAccountId());
//        System.out.println("Email: " + account3.getEmail());
//        System.out.println("Username: " + account3.getUserName());
//        System.out.println("FullName: " + account3.getFullName());
//        System.out.println("Position: " + account3.getPosition().getPositionName());
//        System.out.println("CreateDate: " + account3.getCreateDate());
//
//        System.out.println("\nAccount 4:");
//        System.out.println("ID: " + account4.getAccountId());
//        System.out.println("Email: " + account4.getEmail());
//        System.out.println("Username: " + account4.getUserName());
//        System.out.println("FullName: " + account4.getFullName());
//        System.out.println("Position: " + account4.getPosition().getPositionName());
//        System.out.println("CreateDate: " + account4.getCreateDate());
//    }
//
//    public void question3() {
//        Account creator = new Account();
//        creator.setUserName("Quân");
//
//        Group group1 = new Group();
//
//        Account acc1 = new Account();
//        acc1.setUserName("user1");
//        Account acc2 = new Account();
//        acc2.setUserName("user2");
//        Account[] accounts = {acc1, acc2};
//        Group group2 = new Group(
//                "Group Java",
//                creator,
//                accounts,
//                LocalDate.now()
//        );
//
//        String[] usernames = {"u1", "u2", "u3"};
//        Group group3 = new Group(
//                "Group Dev",
//                creator,
//                usernames,
//                LocalDate.now()
//        );
//
//        System.out.println("Group 1:");
//        System.out.println("Name: " + group1.getGroupName());
//
//        System.out.println("\nGroup 2:");
//        System.out.println("Name: " + group2.getGroupName());
//        System.out.println("Creator: " + group2.getCreator().getUserName());
//        System.out.println("Accounts:");
//        for (Account acc : group2.getAccounts()) {
//            System.out.println("- " + acc.getUserName());
//        }
//
//        System.out.println("\nGroup 3:");
//        System.out.println("Name: " + group3.getGroupName());
//        System.out.println("Creator: " + group3.getCreator().getUserName());
//        System.out.println("Accounts:");
//        for (Account acc : group3.getAccounts()) {
//            System.out.println("- " + acc.getUserName());
//        }
//    }
}
