package entity;

import java.time.LocalDate;

public class Account {
    private int accountId;
    private String email;
    private String userName;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate createDate;

    public Account() {

    }

    public  Account (int accountId, String email, String userName, String firstName, String lastname) {
        this.accountId = accountId;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName +" "+ lastname;
    }

    public  Account (int accountId, String email, String userName, String firstName, String lastname, Position position) {
        this.accountId = accountId;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName +" "+ lastname;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    public  Account (int accountId, String email, String userName, String firstName, String lastname, Position position, LocalDate createDate) {
        this.accountId = accountId;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName +" "+ lastname;
        this.position = position;
        this.createDate = createDate;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
