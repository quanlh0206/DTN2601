package entity;

import enums.GioiTinh;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {

    }

    public NhanVien(Integer age, String fullname, GioiTinh gioiTinh, String address, String congViec) {
        super(age, fullname, gioiTinh, address);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "Họ Tên: " + getFullname() + " " +
                "Tuổi: " + getAge() + " " +
                "Giới Tính: " + getGioiTinh() + " " +
                "Địa chỉ: " + getAddress() + " " +
                "Công Việc: " + congViec + '\'' +
                '}';
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
