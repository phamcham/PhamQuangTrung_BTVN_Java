package common;
public class NhanVien {
    private String MaNhanVien;
    private String TenNhanVien;
    private String ChucVu;
    private int Luong;

    public NhanVien(String MaNhanVien, String TenNhanVien, String ChucVu) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.ChucVu = ChucVu;
    }
    public void HienThiThongTin(){
        System.out.println("Mã nhân viên: " + this.MaNhanVien + "\tTên nhân viên: " + this.TenNhanVien + "\tChức vụ: " + this.ChucVu + "\tLương: " + TinhLuong());
        System.out.println();
    }
    public int TinhLuong(){
        switch (this.ChucVu) {
            case "nhan vien":
                return 5000000;
            case "truong phong":
                return 8000000;
            case "giam doc":
                return 10000000;
            default:
                break;
        }
        return 0;
    }
}
