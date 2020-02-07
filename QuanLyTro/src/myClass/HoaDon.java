package myClass;

import java.util.Scanner;

public class HoaDon {
    private int ma;
    private Ngay ngayThu;
    private int soDien;
    private int soNuoc;
    private int tienSinhHoat;
    private int tienInternet;
    private int tienPhong;
    
    public HoaDon(int ma){
        this.ma = ma;
    }
    
    public HoaDon(int ma, Ngay ngayThu, int soDien, int soNuoc, int tienSinhHoat, int tienInternet, int tienPhong) {
        this.ma = ma;
        this.ngayThu = ngayThu;
        this.soDien = soDien;
        this.soNuoc = soNuoc;
        this.tienSinhHoat = tienSinhHoat;
        this.tienInternet = tienInternet;
        this.tienPhong = tienPhong;
    }

    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("------------------- NHẬP THÔNG TIN HOÁ ĐƠN ------------------");
        System.out.println("Ngày thu: "); this.ngayThu.Nhap();
        System.out.println("Số điện: "); this.soDien = in.nextInt();
        System.out.println("Số nước: "); this.soNuoc = in.nextInt();
        System.out.println("Tiền sinh hoạt: "); this.tienSinhHoat = in.nextInt();
        System.out.println("Tiền internet: "); this.tienInternet = in.nextInt();
        System.out.println("Tiền phòng: "); this.tienPhong = in.nextInt();
    }
    
    public void Xuat(){
        System.out.println("----------------- THÔNG TIN HOÁ ĐƠN -----------------------");
        System.out.println("Ngay thu: "); this.ngayThu.Xuat();
        System.out.println("Số điện: " + this.soDien);
        System.out.println("Số nước " + this.soNuoc);
        System.out.println("Tiền sinh hoạt: " + this.tienSinhHoat);
        System.out.println("Tiền internet: " + this.tienInternet);
        System.out.println("Tiền phòng: " + this.tienPhong);
        System.out.println("Tổng chi phí: " + this.TongChiPhi());
    }
    
    public long TongChiPhi(){
        return this.soDien * 2200 + this.soNuoc * 5000 + this.tienInternet + this.tienSinhHoat + this.tienPhong;
    }
    
    public void Sua(){
        System.out.println("----------------- SỬA THÔNG TIN -------------------");
        System.out.println("1. Ngày thu");
        System.out.println("2. Số điện");
        System.out.println("3. Số nước");
        System.out.println("4. Tiền sinh hoạt");
        System.out.println("5. Tiền internet");
        System.out.println("6. Tiền phòng");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
    }

    public int getMa() {
        return ma;
    }

    public Ngay getNgayThu() {
        return ngayThu;
    }

    public int getSoDien() {
        return soDien;
    }

    public int getSoNuoc() {
        return soNuoc;
    }

    public int getTienSinhHoat() {
        return tienSinhHoat;
    }

    public int getTienInternet() {
        return tienInternet;
    }

    public int getTienPhong() {
        return tienPhong;
    }
    
    
}
