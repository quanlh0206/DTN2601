public class Exercise1 {

    public static void question1(Account account) {
        if (account.department.departmentName == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là " + account.department.departmentName);
        }
    }

    public static void question2(Account account, GroupAccount[] groupAccounts) {
        int count = 0;

        for (GroupAccount ga : groupAccounts) {
            if (ga.account == account) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (count == 1 || count == 2) {
            System.out.print("Group của nhân viên này là: ");

            for (GroupAccount ga : groupAccounts) {
                if (ga.account == account) {
                    System.out.print(ga.group.groupName + ", ");
                }
            }

        } else if (count == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    public static String question3(Account account) {
            String result = (account.department.departmentName == null) ? "Nhân viên này chưa có phòng ban"
                    : "Phòng ban của nhân viên này là " + account.department.departmentName;
            return result;
    }

    public static String question4(Position position){
        return (position.positionName == PositionName.DEV)
                ? "Đây là Developer"
                : "Người này không phải là Developer";
    }

    public static void question5(Group group, GroupAccount[] groupAccounts) {
        int count = 0;

        for (GroupAccount ga : groupAccounts) {
            if (ga.group == group) {
                count++;
            }
        }

        switch (count) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }
    }

    public static void question6(Account account, GroupAccount[] groupAccounts) {
        int count = 0;

        for (GroupAccount ga : groupAccounts) {
            if (ga.account == account) {
                count++;
            }
        }

        switch (count) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.print("Group của nhân viên này là: ");

                for (GroupAccount ga : groupAccounts) {
                    if (ga.account == account) {
                        System.out.print(ga.group.groupName + ", ");
                    }
                }
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;

            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    public static void question7(Account account) {
        switch (account.position.positionName) {
            case DEV:
                System.out.println("Đây là Developer");
                break;

            default:
                System.out.println("Người này không phải là Developer");
        }
    }

    public static void question8(Account[] accounts) {
        for (Account acc : accounts) {
            String departmentName = (acc.department.departmentName == null)
                    ? "Chưa có phòng ban"
                    : acc.department.departmentName;

            System.out.println("Email: " + acc.email);
            System.out.println("FullName: " + acc.fullName);
            System.out.println("Department: " + departmentName);
        }
    }

    public static void question9(Department[] departments) {
        for (Department dep : departments) {
            System.out.println("ID: " + dep.departmentId);
            System.out.println("Name: " + dep.departmentName);
        }
    }

    public static void question10(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            Account acc = accounts[i];

            String departmentName = (acc.department.departmentName == null)
                    ? "Chưa có phòng ban"
                    : acc.department.departmentName;

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullName);
            System.out.println("Phòng ban: " + departmentName);
        }
    }

    public static void question11(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            Department dep = departments[i];

            String name = (dep.departmentName == null)
                    ? "Chưa có tên phòng ban"
                    : dep.departmentName;

            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + dep.departmentId);
            System.out.println("Name: " + name);
        }
    }

    public static void question12(Department[] departments) {
        for (int i = 0; i < departments.length && i < 2; i++) {
            Department dep = departments[i];

            String name = (dep.departmentName == null)
                    ? "Chưa có tên phòng ban"
                    : dep.departmentName;

            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + dep.departmentId);
            System.out.println("Name: " + name);
        }
    }

    public static void question13(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {

            if (i == 1) {
                continue;
            }

            Account acc = accounts[i];

            String departmentName = (acc.department.departmentName == null)
                    ? "Chưa có phòng ban"
                    : acc.department.departmentName;

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullName);
            System.out.println("Phòng ban: " + departmentName);
        }
    }

    public static void question14(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            Account acc = accounts[i];

            if (acc.accountId < 4) {

                String departmentName = (acc.department.departmentName == null)
                        ? "Chưa có phòng ban"
                        : acc.department.departmentName;

                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + acc.email);
                System.out.println("Full name: " + acc.fullName);
                System.out.println("Phòng ban: " + departmentName);
            }
        }
    }

    public static void question15() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    public static void question10While(Account[] accounts) {
        int i = 0;

        while (i < accounts.length) {
            Account acc = accounts[i];

            String departmentName = (acc.department.departmentName == null)
                    ? "Chưa có phòng ban"
                    : acc.department.departmentName;

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullName);
            System.out.println("Phòng ban: " + departmentName);

            i++;
        }
    }

    public static void question11While(Department[] departments) {
        int i = 0;

        while (i < departments.length) {
            Department dep = departments[i];

            String name = (dep.departmentName == null)
                    ? "Chưa có tên phòng ban"
                    : dep.departmentName;

            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + dep.departmentId);
            System.out.println("Name: " + name);

            i++;
        }
    }

    public static void question12While(Department[] departments) {
        int i = 0;

        while (i < departments.length) {
            if (i == 2) break;

            Department dep = departments[i];

            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + dep.departmentId);
            System.out.println("Name: " + dep.departmentName);

            i++;
        }
    }

    public static void question13While(Account[] accounts) {
        int i = 0;

        while (i < accounts.length) {

            if (i == 1) {
                i++;
                continue;
            }

            Account acc = accounts[i];

            System.out.println("Email: " + acc.email);

            i++;
        }
    }

    public static void question14While(Account[] accounts) {
        int i = 0;

        while (i < accounts.length) {
            Account acc = accounts[i];

            if (acc.accountId >= 4) {
                i++;
                continue;
            }

            System.out.println("Email: " + acc.email);

            i++;
        }
    }

    public static void question15While() {
        int i = 2;

        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }

    public static void question10DoWhile(Account[] accounts) {
        int i = 0;

        if (accounts.length == 0) return;

        do {
            Account acc = accounts[i];

            String departmentName = (acc.department.departmentName == null)
                    ? "Chưa có phòng ban"
                    : acc.department.departmentName;

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullName);
            System.out.println("Phòng ban: " + departmentName);

            i++;
        } while (i < accounts.length);
    }

    public static void question11DoWhile(Department[] departments) {
        int i = 0;

        if (departments.length == 0) return;

        do {
            Department dep = departments[i];

            String name = (dep.departmentName == null)
                    ? "Chưa có tên phòng ban"
                    : dep.departmentName;

            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + dep.departmentId);
            System.out.println("Name: " + name);

            i++;
        } while (i < departments.length);
    }

    public static void question12DoWhile(Department[] departments) {
        int i = 0;

        if (departments.length == 0) return;

        do {
            if (i == 2) break;

            Department dep = departments[i];

            System.out.println("Id: " + dep.departmentId);
            System.out.println("Name: " + dep.departmentName);

            i++;
        } while (i < departments.length);
    }

    public static void question13DoWhile(Account[] accounts) {
        int i = 0;

        if (accounts.length == 0) return;

        do {
            if (i == 1) {
                i++;
                continue;
            }

            Account acc = accounts[i];

            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullName);

            i++;
        } while (i < accounts.length);
    }

    public static void question14DoWhile(Account[] accounts) {
        int i = 0;

        if (accounts.length == 0) return;

        do {
            Account acc = accounts[i];

            if (acc.accountId >= 4) {
                i++;
                continue;
            }

            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullName);

            i++;
        } while (i < accounts.length);
    }

    public static void question15DoWhile() {
        int i = 2;

        do {
            System.out.println(i);
            i += 2;
        } while (i <= 20);
    }
}
