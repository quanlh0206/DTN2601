package entity;

import java.time.LocalDate;

public class Group {
    private int groupId;
    private String groupName;
    private Account creator;
    private Account[] accounts;
    private LocalDate createDate;

    public Group () {

    }

    public Group(String groupName, Account creator, Account[] accounts, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    public Group(String groupName, Account creator, String[] usernames, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;

        this.accounts = new Account[usernames.length];

        for (int i = 0; i < usernames.length; i++) {
            Account acc = new Account();
            acc.setUserName(usernames[i]);
            this.accounts[i] = acc;
        }
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
