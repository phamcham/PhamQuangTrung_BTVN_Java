package common;
public class Sinhvien extends Nguoi{
    private String MaSV;
    private String Nganh;
    private int KhoaHoc;

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public int getKhoaHoc() {
        return KhoaHoc;
    }

    public void setKhoaHoc(int KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }
    
    @Override
    public String getHoTen() {
        return super.getHoTen();
    }

    @Override
    public void setHoTen(String HoTen) {
        super.setHoTen(HoTen);
    }

    @Override
    public Day getNgaySinh() {
        return super.getNgaySinh();
    }

    @Override
    public void setNgaySinh(Day NgaySinh) {
        super.setNgaySinh(NgaySinh);
    }

    @Override
    public String getQueQuan() {
        return super.getQueQuan();
    }

    @Override
    public void setQueQuan(String QueQuan) {
        super.setQueQuan(QueQuan);
    }
}
