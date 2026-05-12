package entity;

import enums.GioiTinh;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(){

    }

    public CongNhan(Integer age, String fullname, GioiTinh gioiTinh, String address, int bac) {
        super(age, fullname, gioiTinh, address);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "Họ Tên: " + getFullname() + " " +
                "Tuổi: " + getAge() + " " +
                "Giới Tính: " + getGioiTinh() + " " +
                "Địa chỉ: " + getAddress() + " " +
                "Bậc: " + bac +
                '}';
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
}
