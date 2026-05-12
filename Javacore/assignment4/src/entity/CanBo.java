package entity;

import enums.GioiTinh;

public class CanBo {
    private String fullname;
    private Integer age;
    private GioiTinh gioiTinh;
    private String address;

    public CanBo() {

    }

    public CanBo(Integer age, String fullname, GioiTinh gioiTinh, String address) {
        this.age = age;
        this.fullname = fullname;
        this.gioiTinh = gioiTinh;
        this.address = address;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", gioiTinh=" + gioiTinh +
                ", address='" + address + '\'' +
                '}';
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
