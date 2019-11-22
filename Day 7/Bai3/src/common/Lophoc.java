package common;
public class Lophoc {
    private String MaLH;
    private String TenLH;
    private Day NgayMo;
    private Sinhvien[] x;
    private int n;
    private String GiaoVien;

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String TenLH) {
        this.TenLH = TenLH;
    }

    public Day getNgayMo() {
        return NgayMo;
    }

    public void setNgayMo(Day NgayMo) {
        this.NgayMo = NgayMo;
    }

    public Sinhvien[] getX() {
        return x;
    }

    public void setX(Sinhvien[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(String GiaoVien) {
        this.GiaoVien = GiaoVien;
    }
}
