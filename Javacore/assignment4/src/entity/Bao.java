package entity;

public class Bao extends TaiLieu {

    private int ngayPhatHanh;

    public Bao() {

    }

    public Bao(
            String maTaiLieu,
            String tenNhaXuatBan,
            int soBanPhatHanh,
            int ngayPhatHanh
    ) {

        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);

        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                "} " + super.toString();
    }
}