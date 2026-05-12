package entity;

public class TapChi extends TaiLieu {

    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {

    }

    public TapChi(
            String maTaiLieu,
            String tenNhaXuatBan,
            int soBanPhatHanh,
            int soPhatHanh,
            int thangPhatHanh
    ) {

        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);

        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                "} " + super.toString();
    }
}