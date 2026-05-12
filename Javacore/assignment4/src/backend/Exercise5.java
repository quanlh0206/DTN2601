package backend;

import entity.*;
import enums.GioiTinh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

    public void question1() {

        Scanner scanner = new Scanner(System.in);

        List<CanBo> canBos = new ArrayList<>();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị thông tin danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát chương trình");

            String choose = scanner.nextLine();

            switch (choose) {

                case "1":

                    System.out.println("Mời nhập họ tên:");
                    String fullname = scanner.nextLine();

                    System.out.println("Mời nhập tuổi:");
                    int age = Integer.parseInt(scanner.nextLine());

                    System.out.println("Mời nhập địa chỉ:");
                    String address = scanner.nextLine();

                    System.out.println("Mời nhập giới tính:");
                    System.out.println("1. Nam");
                    System.out.println("2. Nữ");
                    System.out.println("3. Khác");

                    String inputGioiTinh = scanner.nextLine();

                    GioiTinh gioiTinh;

                    switch (inputGioiTinh) {

                        case "1":
                            gioiTinh = GioiTinh.NAM;
                            break;

                        case "2":
                            gioiTinh = GioiTinh.NU;
                            break;

                        default:
                            gioiTinh = GioiTinh.KHAC;
                    }

                    System.out.println("Mời bạn chọn cán bộ muốn thêm");
                    System.out.println("1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    System.out.println("3. Nhân viên");

                    String inputCanBo = scanner.nextLine();

                    switch (inputCanBo) {

                        case "1":

                            System.out.println("Nhập bậc (1-10):");
                            int bac = Integer.parseInt(scanner.nextLine());

                            CanBo congNhan = new CongNhan(
                                    age,
                                    fullname,
                                    gioiTinh,
                                    address,
                                    bac
                            );

                            canBos.add(congNhan);

                            System.out.println("Thêm mới công nhân thành công");

                            break;

                        case "2":

                            System.out.println("Nhập ngành đào tạo:");
                            String nganh = scanner.nextLine();

                            CanBo kySu = new KySu(
                                    age,
                                    fullname,
                                    gioiTinh,
                                    address,
                                    nganh
                            );

                            canBos.add(kySu);

                            System.out.println("Thêm mới kỹ sư thành công");

                            break;

                        case "3":

                            System.out.println("Nhập công việc:");
                            String congViec = scanner.nextLine();

                            CanBo nhanVien = new NhanVien(
                                    age,
                                    fullname,
                                    gioiTinh,
                                    address,
                                    congViec
                            );

                            canBos.add(nhanVien);

                            System.out.println("Thêm mới nhân viên thành công");

                            break;

                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                    }

                    break;

                case "2":

                    if (canBos.isEmpty()) {
                        System.out.println("Danh sách cán bộ đang rỗng");
                        break;
                    }

                    System.out.println("Nhập họ tên cần tìm:");

                    String findName = scanner.nextLine();

                    boolean isFound = false;

                    for (CanBo canBo : canBos) {

                        if (canBo.getFullname().equalsIgnoreCase(findName)) {

                            System.out.println(canBo);

                            isFound = true;
                        }
                    }

                    if (!isFound) {
                        System.out.println("Không tìm thấy cán bộ");
                    }

                    break;

                case "3":

                    if (canBos.isEmpty()) {

                        System.out.println("Danh sách cán bộ đang rỗng");

                    } else {

                        for (CanBo canBo : canBos) {
                            System.out.println(canBo);
                        }
                    }

                    break;

                case "4":

                    if (canBos.isEmpty()) {
                        System.out.println("Danh sách cán bộ đang rỗng");
                        break;
                    }

                    System.out.println("Nhập tên cán bộ cần xóa:");

                    String deleteName = scanner.nextLine();

                    Iterator<CanBo> iterator = canBos.iterator();

                    boolean isDeleted = false;

                    while (iterator.hasNext()) {

                        CanBo canBo = iterator.next();

                        if (canBo.getFullname().equalsIgnoreCase(deleteName)) {

                            iterator.remove();

                            isDeleted = true;
                        }
                    }

                    if (isDeleted) {

                        System.out.println("Xóa cán bộ thành công");

                    } else {

                        System.out.println("Không tìm thấy cán bộ");
                    }

                    break;

                case "5":

                    System.out.println("Thoát chương trình");

                    return;

                default:

                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    public void question3() {
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent(1, "Nam","Chuyen Van", "Đại học công nghệ");
        System.out.println(highSchoolStudent);
    }

    public void question4() {

        Scanner scanner = new Scanner(System.in);

        List<TaiLieu> taiLieus = new ArrayList<>();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Xóa tài liệu theo mã");
            System.out.println("3. Hiển thị tài liệu");
            System.out.println("4. Tìm kiếm theo loại");
            System.out.println("5. Thoát");

            String choose = scanner.nextLine();

            switch (choose) {

                case "1":

                    System.out.println("Chọn loại tài liệu:");
                    System.out.println("1. Sách");
                    System.out.println("2. Tạp chí");
                    System.out.println("3. Báo");

                    String type = scanner.nextLine();

                    System.out.println("Nhập mã tài liệu:");
                    String maTaiLieu = scanner.nextLine();

                    boolean isExist = false;

                    for (TaiLieu taiLieu : taiLieus) {
                        if (taiLieu.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)) {
                            isExist = true;
                            break;
                        }
                    }

                    if (isExist) {
                        System.out.println("Mã tài liệu đã tồn tại");
                        break;
                    }

                    System.out.println("Nhập tên nhà xuất bản:");
                    String tenNXB = scanner.nextLine();

                    System.out.println("Nhập số bản phát hành:");
                    int soBanPhatHanh = Integer.parseInt(scanner.nextLine());

                    switch (type) {

                        case "1":

                            System.out.println("Nhập tên tác giả:");
                            String tenTacGia = scanner.nextLine();

                            System.out.println("Nhập số trang:");
                            int soTrang = Integer.parseInt(scanner.nextLine());

                            TaiLieu sach = new Sach(
                                    maTaiLieu,
                                    tenNXB,
                                    soBanPhatHanh,
                                    tenTacGia,
                                    soTrang
                            );

                            taiLieus.add(sach);

                            System.out.println("Thêm sách thành công");

                            break;

                        case "2":

                            System.out.println("Nhập số phát hành:");
                            int soPhatHanh = Integer.parseInt(scanner.nextLine());

                            System.out.println("Nhập tháng phát hành:");
                            int thangPhatHanh = Integer.parseInt(scanner.nextLine());

                            TaiLieu tapChi = new TapChi(
                                    maTaiLieu,
                                    tenNXB,
                                    soBanPhatHanh,
                                    soPhatHanh,
                                    thangPhatHanh
                            );

                            taiLieus.add(tapChi);

                            System.out.println("Thêm tạp chí thành công");

                            break;

                        case "3":

                            System.out.println("Nhập ngày phát hành:");
                            int ngayPhatHanh = scanner.nextInt();
                            scanner.nextLine();
                            TaiLieu bao = new Bao(
                                    maTaiLieu,
                                    tenNXB,
                                    soBanPhatHanh,
                                    ngayPhatHanh
                            );

                            taiLieus.add(bao);

                            System.out.println("Thêm báo thành công");

                            break;

                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                    }

                    break;

                case "2":

                    if (taiLieus.isEmpty()) {
                        System.out.println("Danh sách tài liệu rỗng");
                        break;
                    }

                    System.out.println("Nhập mã tài liệu cần xóa:");

                    String deleteId = scanner.nextLine();

                    Iterator<TaiLieu> iterator = taiLieus.iterator();

                    boolean isDeleted = false;

                    while (iterator.hasNext()) {

                        TaiLieu taiLieu = iterator.next();

                        if (taiLieu.getMaTaiLieu().equalsIgnoreCase(deleteId)) {

                            iterator.remove();

                            isDeleted = true;
                        }
                    }

                    if (isDeleted) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tìm thấy tài liệu");
                    }

                    break;

                case "3":

                    if (taiLieus.isEmpty()) {

                        System.out.println("Danh sách tài liệu rỗng");

                    } else {

                        for (TaiLieu taiLieu : taiLieus) {
                            System.out.println(taiLieu);
                        }
                    }

                    break;

                case "4":

                    if (taiLieus.isEmpty()) {
                        System.out.println("Danh sách tài liệu rỗng");
                        break;
                    }

                    System.out.println("Chọn loại cần tìm:");
                    System.out.println("1. Sách");
                    System.out.println("2. Tạp chí");
                    System.out.println("3. Báo");

                    String findType = scanner.nextLine();

                    switch (findType) {

                        case "1":

                            for (TaiLieu taiLieu : taiLieus) {

                                if (taiLieu instanceof Sach) {
                                    System.out.println(taiLieu);
                                }
                            }

                            break;

                        case "2":

                            for (TaiLieu taiLieu : taiLieus) {

                                if (taiLieu instanceof TapChi) {
                                    System.out.println(taiLieu);
                                }
                            }

                            break;

                        case "3":

                            for (TaiLieu taiLieu : taiLieus) {

                                if (taiLieu instanceof Bao) {
                                    System.out.println(taiLieu);
                                }
                            }

                            break;

                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                    }

                    break;

                case "5":

                    System.out.println("Thoát chương trình");

                    return;

                default:

                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}