import java.time.Duration;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Department
        Department dep1 = new Department();
        dep1.departmentId = 1;
        dep1.departmentName = null;

        Department dep2 = new Department();
        dep2.departmentId = 2;
        dep2.departmentName = "Marketing";

        Department dep3 = new Department();
        dep3.departmentId = 3;
        dep3.departmentName = "IT";

        // Position
        Position pos1 = new Position();
        pos1.positionId = 1;
        pos1.positionName = PositionName.DEV;

        Position pos2 = new Position();
        pos2.positionId = 2;
        pos2.positionName = PositionName.TEST;

        Position pos3 = new Position();
        pos3.positionId = 3;
        pos3.positionName = PositionName.PM;

        // Account
        Account acc1 = new Account();
        acc1.accountId = 1;
        acc1.email = "a@gmail.com";
        acc1.userName = "user1";
        acc1.fullName = "Nguyen Van A";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();

        Account acc2 = new Account();
        acc2.accountId = 2;
        acc2.email = "b@gmail.com";
        acc2.userName = "user2";
        acc2.fullName = "Nguyen Van B";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.now();

        Account acc3 = new Account();
        acc3.accountId = 3;
        acc3.email = "c@gmail.com";
        acc3.userName = "user3";
        acc3.fullName = "Nguyen Van C";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();

        // Group
        Group gro1 = new Group();
        gro1.groupId = 1;
        gro1.groupName = "Java Fresher";
        gro1.creator = acc1;
        gro1.createDate = LocalDate.now();

        Group gro2 = new Group();
        gro2.groupId = 2;
        gro2.groupName = "Testing Team";
        gro2.creator = acc2;
        gro2.createDate = LocalDate.now();

        Group gro3 = new Group();
        gro3.groupId = 3;
        gro3.groupName = "Backend Team";
        gro3.creator = acc3;
        gro3.createDate = LocalDate.now();

        // GroupAccount
        GroupAccount ga1 = new GroupAccount();
        ga1.group = gro1;
        ga1.account = acc1;
        ga1.joinDate = LocalDate.now();

        GroupAccount ga2 = new GroupAccount();
        ga2.group = gro2;
        ga2.account = acc1;
        ga2.joinDate = LocalDate.now();

        GroupAccount ga3 = new GroupAccount();
        ga3.group = gro3;
        ga3.account = acc2;
        ga3.joinDate = LocalDate.now();

        // CategoryQuestion
        CategoryQuestion cat1 = new CategoryQuestion();
        cat1.CategoryId = 1;
        cat1.categoryName = "Java";

        CategoryQuestion cat2 = new CategoryQuestion();
        cat2.CategoryId = 2;
        cat2.categoryName = "PHP";

        CategoryQuestion cat3 = new CategoryQuestion();
        cat3.CategoryId = 3;
        cat3.categoryName = "SQL";

        // TypeQuestion
        TypeQuestion t1 = new TypeQuestion();
        t1.typeId = 1;
        t1.typeName = TypeName.ESSAY;

        TypeQuestion t2 = new TypeQuestion();
        t2.typeId = 2;
        t2.typeName = TypeName.MULTIPLE_CHOICE;

        TypeQuestion t3 = new TypeQuestion();
        t3.typeId = 3;
        t3.typeName = TypeName.ESSAY;

        // Question
        Question q1 = new Question();
        q1.questionId = 1;
        q1.content = "Java là gì?";
        q1.categoryQuestion = cat1;
        q1.typeQuestion = t1;
        q1.creator = acc1;
        q1.createDate = LocalDate.now();

        Question q2 = new Question();
        q2.questionId = 2;
        q2.content = "SQL là gì?";
        q2.categoryQuestion = cat3;
        q2.typeQuestion = t2;
        q2.creator = acc2;
        q2.createDate = LocalDate.now();

        Question q3 = new Question();
        q3.questionId = 3;
        q3.content = "PHP larave la gì?";
        q3.categoryQuestion = cat2;
        q3.typeQuestion = t1;
        q3.creator = acc3;
        q3.createDate = LocalDate.now();

        // Answer
        Answer ans1 = new Answer();
        ans1.answerId = 1;
        ans1.content = "Ngôn ngữ lập trình";
        ans1.question = q1;
        ans1.isCorrect = true;

        Answer ans2 = new Answer();
        ans2.answerId = 2;
        ans2.content = "Hệ quản trị DB";
        ans2.question = q2;
        ans2.isCorrect = true;

        Answer a3 = new Answer();
        a3.answerId = 3;
        a3.content = "Framework";
        a3.question = q3;
        a3.isCorrect = true;

        // Exam
        Exam e1 = new Exam();
        e1.ExamId = 1;
        e1.code = 101;
        e1.title = "Java Basic";
        e1.categoryQuestion = cat1;
        e1.duration = Duration.ofMinutes(60);
        e1.creator = acc1;
        e1.createDate = LocalDate.now();

        Exam e2 = new Exam();
        e2.ExamId = 2;
        e2.code = 102;
        e2.title = "SQL Basic";
        e2.categoryQuestion = cat3;
        e2.duration = Duration.ofMinutes(45);
        e2.creator = acc2;
        e2.createDate = LocalDate.now();

        Exam e3 = new Exam();
        e3.ExamId = 3;
        e3.code = 103;
        e3.title = ".NET Basic";
        e3.categoryQuestion = cat2;
        e3.duration = Duration.ofMinutes(30);
        e3.creator = acc3;
        e3.createDate = LocalDate.now();

        // ExamQuestion
        ExamQuestion eq1 = new ExamQuestion();
        eq1.exam = e1;
        eq1.question = q1;

        ExamQuestion eq2 = new ExamQuestion();
        eq2.exam = e2;
        eq2.question = q2;

        ExamQuestion eq3 = new ExamQuestion();
        eq3.exam = e3;
        eq3.question = q3;

        //EX1
//        Exercise1.question1(acc1);
//        GroupAccount[] groupAccounts = { ga1, ga2, ga3 };
//        Exercise1.question2(acc1,groupAccounts);
//        System.out.println(Exercise1.question3(acc2));
//        System.out.println(Exercise1.question4(pos2));
//        Exercise1.question5(gro1, groupAccounts);
//        Exercise1.question6(acc3,groupAccounts);
//        Exercise1.question7(acc1);
//        Account[] accounts = {acc1,acc2,acc3};
//        Exercise1.question8(accounts);
//        Department[] departments = {dep1,dep2,dep3};
//        Exercise1.question9(departments);
//        Exercise1.question10(accounts);
//        Exercise1.question11(departments);
//        Exercise1.question12(departments);
//        Exercise1.question13(accounts);
//        Exercise1.question14(accounts);
//        Exercise1.question15();

        //EX2
//        Exercise2.question1();
//        Exercise2.question2();
//        Exercise2.question3();
//        Exercise2.question4();
//        Exercise2.question5();

        //EX3
//        Exercise3.question1(e1);
//        Exercise3.question2(e2);
//        Exercise3.question3(e3);
//        Exercise3.question4(e3);
//        Exercise3.question5(e2);

        //EX4
//        Exercise4.question1();
//        Exercise4.question2();
//        Exercise4.question3();
//        Exercise4.question7();

        //EX5
//        Exercise5.question1();3
//        Exercise5.question2();
//        Exercise33335.question3();
//        Exercise5.question4();
//        Exercise5.question6();
//        Exercise5.question7();

        //EX6
//        Exercise6.question1();
//        Account[] accounts = {acc1,acc2,acc3};
//        Exercise6.question2(accounts);
        Exercise6.question3();
    }
}