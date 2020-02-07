package myClass;

import java.util.*;

public class PhongTro {
    private int ma;
    private float dienTich;
    private boolean nongLanh;
    private boolean dieuHoa;
    private ArrayList<KhachThue> danhSachKhachThue = new ArrayList();
    private ArrayList<HoaDon> danhSachHoaDon = new ArrayList();
    
    public PhongTro(int ma){
        this.ma = ma;
        this.dienTich = 0;
        this.nongLanh = false;
        this.dieuHoa = false;
    }

    public PhongTro(int ma, float dienTich, boolean nongLanh, boolean dieuHoa) {
        this.ma = ma;
        this.dienTich = dienTich;
        this.nongLanh = nongLanh;
        this.dieuHoa = dieuHoa;
    }
    
    public void ThemKhachThue(KhachThue khachthue){
        this.danhSachKhachThue.add(khachthue);
    }
    
    public void DuoiKhachThue(int maKhachThue){
        int p = -1;
        for (int i = 0; i < this.danhSachKhachThue.size(); i++) {
            if (this.danhSachKhachThue.get(i).getMa() == maKhachThue){
                p = i;
            }
        }
        if (p == -1) System.out.println("KHÔNG TÌM THẤY MÃ " + maKhachThue);
        else{
            this.danhSachKhachThue.remove(p);
            System.out.println("ĐÃ ĐUỔI KHÁCH MÃ " + maKhachThue);
        }
    }
    
    public void ThemHoaDon(HoaDon hoadon){
        this.danhSachHoaDon.add(hoadon);
    }
    
    public void XoaHoaDon(int maHoaDon){
        int p = -1;
        for (int i = 0; i < this.danhSachHoaDon.size(); i++) {
            if (this.danhSachHoaDon.get(i).getMa() == maHoaDon){
                p = i;
            }
        }
        if (p == -1) System.out.println("KHÔNG TÌM THẤY MÃ " + maHoaDon);
        else{
            this.danhSachHoaDon.remove(p);
            System.out.println("ĐÃ XOÁ ĐƠN MÃ " + maHoaDon);
        }
    }

    public void Sua(){
        System.out.println("---------------- SỬA THÔNG TIN PHÒNG -----------------");
        System.out.println("1. Diện tích");
        System.out.println("2. Nóng lạnh");
        System.out.println("3. Điều hoà");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println("----------------- TUỲ CHỌN -------------------");
        switch (t){
            case 1:{
                System.out.println("Nhập diện tích: ");
                this.dienTich = in.nextFloat();
                break;
            }
            case 2:{
                System.out.println("1. Có\n2.Không");
                int c = in.nextInt();
                this.nongLanh = (c == 1);
                break;
            }
            case 3:{
                System.out.println("1. Có\n2.Không");
                int c = in.nextInt();
                this.dieuHoa = (c == 1);
                break;
            }
            default: System.out.println("NHẬP CHO ĐÀNG HOÀNG ĐMM!");
        }
    }
    
    public void ThongTin(){
        System.out.println("--------------- THÔNG TIN PHÒNG TRỌ -----------------");
        System.out.println("Mã: " + this.ma);
        System.out.println("Diện tích: " + this.dienTich + " m^2");
        System.out.println("Nóng lạnh: " + (this.nongLanh ? "Có" : "Không"));
        System.out.println("Điều hoà: " + (this.dieuHoa ? "Có" : "Không"));
        System.out.println("Số người: " + this.danhSachKhachThue.size());
    }
    
    public void TongTinKhachThue(){
        System.out.println("------------- THÔNG TIN KHÁCH THUÊ PHÒNG " + this.ma + " ---------------------");
        for (int i = 0; i < danhSachKhachThue.size(); i++) {
            danhSachKhachThue.get(i).Xuat();
        }
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public boolean isNongLanh() {
        return nongLanh;
    }

    public void setNongLanh(boolean nongLanh) {
        this.nongLanh = nongLanh;
    }

    public boolean isDieuHoa() {
        return dieuHoa;
    }

    public void setDieuHoa(boolean dieuHoa) {
        this.dieuHoa = dieuHoa;
    }

    public ArrayList<KhachThue> getDanhSachKhachThue() {
        return danhSachKhachThue;
    }

    public void setDanhSachKhachThue(ArrayList<KhachThue> danhSachKhachThue) {
        this.danhSachKhachThue = danhSachKhachThue;
    }

    public ArrayList<HoaDon> getDanhSachHoaDon() {
        return danhSachHoaDon;
    }

    public void setDanhSachHoaDon(ArrayList<HoaDon> danhSachHoaDon) {
        this.danhSachHoaDon = danhSachHoaDon;
    }
}
