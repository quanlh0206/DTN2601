package org.example.frontend;

import org.example.backend.controller.PositionController;
import org.example.entity.Position;
import org.example.enums.PositionName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PositionFunction {
    private static Scanner sc = new Scanner(System.in);
    PositionController positionController = new PositionController();
    public void run() {
        List<Position> positions = new ArrayList<>();
        while (true) {
            System.out.println("=== Mời bạn chọn chức năng ===");
            System.out.println("1. Xem ds position");
            System.out.println("2. Thêm mới position");
            System.out.println("3. Xóa position theo ID");
            System.out.println("4. Update position theo ID");
            System.out.println("5. Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    positions = positionController.findAll();
                    this.showPosition(positions);
                    break;
                case "2":
                    insertPosition();
                    break;
                case "3":
                    deletePosition();
                    break;
                case "4":
                    updatePosition();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Nhập sai, nhập lại.");
            }
        }
    }


    public void showPosition(List<Position> positions) {
        System.out.println("+-----+----------------------+");
        System.out.printf(
                "|%5s|%22s|\n",
                "ID",
                "Position Name"
        );
        System.out.println("+-----+----------------------+");
        for (Position position : positions) {
            System.out.printf(
                    "|%5d|%22s|\n",
                    position.getId(),
                    position.getName().name()
            );
        }
        if (positions.size() == 0) {
            System.out.println("Không tìm thấy");
        }
        System.out.println("+-----+----------------------+");
    }

    public void deletePosition() {
        int id;
        while (true) {
            System.out.println("Nhập ID position cần xóa: ");
            id = sc.nextInt();
            sc.nextLine();
            if (id <= 0) {
                System.out.println("ID phải lớn hơn 0");
                continue;
            }
            if (!positionController.checkIdExist(id)) {
                System.out.println("ID không tồn tại");
                continue;
            }
            break;
        }
        boolean check = positionController.delete(id);
        if (check) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }

    public void updatePosition() {
        int id;
        String name;
        while (true) {
            System.out.println("Nhập ID position cần sửa: ");
            id = sc.nextInt();
            sc.nextLine();
            if (id <= 0) {
                System.out.println("ID phải lớn hơn 0");
                continue;
            }
            if (!positionController.checkIdExist(id)) {
                System.out.println("ID không tồn tại");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("Nhập tên position mới: ");
            name = sc.nextLine().trim().toUpperCase();
            if (name.isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            try {
                PositionName.valueOf(name);
            } catch (IllegalArgumentException e) {
                System.out.println("Position không hợp lệ");
                System.out.println("Chỉ được nhập: DEV, TEST, SCRUM_MASTER, PM");
                continue;
            }
            if (positionController.checkExistName(name, id)) {
                System.out.println("Tên đã tồn tại");
                continue;
            }
            break;
        }
        boolean check = positionController.update(id, name);
        if (check) {
            System.out.println("Update thành công");
        } else {
            System.out.println("Update thất bại");
        }
    }

    public void insertPosition() {
        String name;
        while (true) {
            System.out.println("Nhập tên position: ");
            name = sc.nextLine().trim().toUpperCase();
            if (name.isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            try {
                PositionName.valueOf(name);
            } catch (IllegalArgumentException e) {
                System.out.println("Position không hợp lệ");
                System.out.println("Chỉ được nhập: DEV, TEST, SCRUM_MASTER, PM");
                continue;
            }
            if (positionController.checkExistName(name, null)) {
                System.out.println("Tên đã tồn tại");
                continue;
            }
            break;
        }
        boolean check = positionController.insert(name);
        if (check) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }
}
