package org.example.frontend;

import org.example.backend.controller.DepartmentController;
import org.example.entity.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DepartmentFunction {
    private Scanner sc = new Scanner(System.in);
    DepartmentController departmentController = new DepartmentController();
    public void run(){
        List<Department> departments = new ArrayList<>();
        while (true) {
            System.out.println("=== Mời bạn chọn chức năng ===");
            System.out.println("1. Xem ds department");
            System.out.println("2. Thêm mới department");
            System.out.println("3. Xóa department theo ID");
            System.out.println("4. Update department theo ID");
            System.out.println("5. Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    departments = departmentController.findAll();
                    this.showDepartment(departments);
                    break;
                case "2":
                    insertDepartment();
                    break;
                case "3":
                    deleteDepartment();
                    break;
                case "4":
                    updateDepartment();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Nhập sai, nhập lại.");
            }
        }
    }


    public void showDepartment(List<Department> departments) {
        System.out.println("+-----+--------------------+");
        System.out.printf("|%5s|%20s|\n", "ID", "Tên phòng ban");
        System.out.println("+-----+--------------------+");
        for (Department department : departments) {
            System.out.printf(
                    "|%5s|%20s|\n",
                    department.getId(),
                    department.getName()
            );
        }
        if (departments.size() == 0) {
            System.out.println("Không tìm thấy");
        }
        System.out.println("+-----+--------------------+");
    }

    public void deleteDepartment() {
        int id;
        while (true) {
            System.out.println("Nhập ID phòng ban cần xóa: ");
            id = sc.nextInt();
            sc.nextLine();
            if (id <= 0) {
                System.out.println("ID phai lon hon 0. Vui long nhap lai");
                continue;
            }
            if (!departmentController.checkIdExist(id)) {
                System.out.println("ID không tồn tại");
                continue;
            }
            break;
        }
        boolean check = departmentController.delete(id);
        if (check) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }

    public void updateDepartment() {
        int id;
        String name;
        while (true) {
            System.out.println("Nhập tên ID phòng ban cần sửa: ");
            id = sc.nextInt();
            sc.nextLine();
            if (id <= 0) {
                System.out.println("ID phai lon hon 0. Vui long nhap lai");
                continue;
            }
            if (!departmentController.checkIdExist(id)) {
                System.out.println("ID không tồn tại");
                continue;
            }

            break;
        }
        while (true) {
            System.out.println("Nhập tên phòng ban muốn thay đổi: ");
            name = sc.nextLine();
            if(Objects.isNull(name) || name.trim().isEmpty()){
                System.out.println("Kh dc de trong. Nhap lai ten");
                continue;
            }
            if(departmentController.checkExistName(name, id)) {
                System.out.println("ten da ton tai, nhap lai ten khac");
                continue;
            }
                break;
        }
        boolean check = departmentController.update(id, name);
        if (check) {
            System.out.println("Update thành công");
        } else {
            System.out.println("Update thất bại");
        }
    }

    public void insertDepartment() {
        String name;
        while (true) {
            System.out.println("Nhập tên phòng ban: ");
            name = sc.nextLine();
            if(Objects.isNull(name) || name.trim().isEmpty()){
                System.out.println("Kh dc de trong. Nhap lai ten");
                continue;
            }
            if(departmentController.checkExistName(name, null)) {
                System.out.println("ten da ton tai, nhap lai ten khac");
                continue;
            }
                break;
        }
        boolean check = departmentController.insert(name);
        if (check) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }
}
