package entity;

import enums.GioiTinh;

public class KySu extends CanBo{
    private String nganh;

    public KySu() {

    }

    public KySu(Integer age, String fullname, GioiTinh gioiTinh, String address, String nganh) {
        super(age, fullname, gioiTinh, address);
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "Họ Tên: " + getFullname() + " " +
                "Tuổi: " + getAge() + " " +
                "Giới Tính: " + getGioiTinh() + " " +
                "Địa chỉ: " + getAddress() + " " +
                "Ngành: " + nganh + '\'' +
                '}';
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
}
