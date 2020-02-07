package myClass;

import java.util.Scanner;

public class KhachThue {
    private int ma;
    private String ten;
    private String soDienThoai;
    private Ngay ngaySinh = new Ngay();
    private String gioiTinh;
    private String ngheNghiep;
    private String soCMND;
    private String queQuan;

    public KhachThue(int ma){
        this.ma = ma;
    }
    
    public KhachThue(int ma, String ten, String soDienThoai, Ngay ngaySinh, String gioiTinh, String ngheNghiep, String soCMND, String queQuan) {
        this.ma = ma;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.ngheNghiep = ngheNghiep;
        this.soCMND = soCMND;
        this.queQuan = queQuan;
    }
    
    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("------------------- NHẬP THÔNG TIN KHÁCH ------------------");
        System.out.println("Mã: " + this.ma);
        System.out.println("Họ và tên: "); this.ten = in.nextLine();
        System.out.println("Số điện thoại: "); this.soDienThoai = in.next();
        System.out.println("Ngày sinh: "); this.ngaySinh.Nhap();
        in.nextLine();
        System.out.println("Giới tính: "); this.gioiTinh = in.nextLine();
        System.out.println("Nghề nghiêp: "); this.ngheNghiep = in.nextLine();
        System.out.println("Số CMND: "); this.soCMND = in.nextLine();
        System.out.println("Quê quán: "); this.queQuan = in.nextLine();
        this.Xuat();
    }
    
    public void Xuat(){
        System.out.println("------------------- THÔNG TIN KHÁCH ------------------");
        System.out.println("Mã: " + this.ma);
        System.out.println("Họ và tên: "+ this.ten);
        System.out.println("Số điện thoại: " + this.soDienThoai);
        System.out.print("Ngày sinh: "); this.ngaySinh.Xuat();
        System.out.println("Giới tính: " + this.gioiTinh);
        System.out.println("Nghề nghiêp: " + this.ngheNghiep);
        System.out.println("Số CMND: " + this.soCMND);
        System.out.println("Quê quán: " + this.queQuan);
    }
    
    public void Sua(){
        System.out.println("----------------- SỬA THÔNG TIN -------------------");
        System.out.println("1. Mã khách thuê");
        System.out.println("2. Tên");
        System.out.println("3. Số điện thoại");
        System.out.println("4. Ngày sinh");
        System.out.println("5. Giới tính");
        System.out.println("6. Nghề nghiệp");
        System.out.println("7. Số CMND");
        System.out.println("8. Quê quán");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        System.out.println("----------------- TUỲ CHỌN -------------------");
        switch (t){
            case 1:{
                System.out.println("HIHI CÁI NÀY MÉO SỬA ĐƯỢC :3");
                break;
            }
            case 2:{
                System.out.println("Nhập tên mới: ");
                this.ten = in.nextLine();
                break;
            }
            case 3:{
                System.out.println("Nhập số điện thoại: ");
                this.soDienThoai = in.nextLine();
                break;
            }
            case 4:{
                System.out.println("Nhập ngày sinh mới: ");
                this.ngaySinh.Nhap();
                break;
            }
            case 5:{
                System.out.println("Nhập giới tính mới: ");
                this.gioiTinh = in.nextLine();
                break;
            }
            case 6:{
                System.out.println("Nhập nghề nghiệp mới: ");
                this.ngheNghiep = in.nextLine();
                break;
            }
            case 7:{
                System.out.println("Nhập số CMND mới: ");
                this.soCMND = in.nextLine();
                break;
            }
            case 8:{
                System.out.println("Nhập quê mới: ");
                this.ten = in.nextLine();
                break;
            }
            default: System.out.println("NHẬP NGU VLLLL");
        }
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public String getQueQuan() {
        return queQuan;
    }
    
    
    
}
