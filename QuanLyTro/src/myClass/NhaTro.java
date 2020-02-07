package myClass;

import java.util.*;

public class NhaTro {
    private ArrayList<PhongTro> danhSachPhongTro = new ArrayList();
    private String ten;
    
    public NhaTro(String ten){
        this.ten = ten;
    }
    
    public void ThongTin(){
        System.out.println("---------------- DANH SÁCH PHÒNG TRỌ ----------------");
        System.out.println("Tên nhà trọ: " + this.ten);
        for (PhongTro phongTro : danhSachPhongTro) {
            phongTro.ThongTin();
        }
    }
    
    public void ThemPhongTro(PhongTro phongtro){
        danhSachPhongTro.add(phongtro);
    }
    
    public void PhaPhongTro(int maPhongTro){
        int p = -1;
        for (int i = 0; i < this.danhSachPhongTro.size(); i++) {
            if (this.danhSachPhongTro.get(i).getMa() == maPhongTro){
                p = i;
            }
        }
        if (p == -1) System.out.println("Không tìm thấy mã " + maPhongTro);
        else{
            this.danhSachPhongTro.remove(p);
            System.out.println("Đã phá phòng mã " + maPhongTro);
        }
    }
    
    public void Sua(){
        System.out.println("----------------- Sửa thông tin -------------------");
        System.out.println("Nhập tên Nhà Trọ: ");
        Scanner in = new Scanner(System.in);
        this.ten = in.nextLine();
    }

    public ArrayList<PhongTro> getDanhSachPhongTro() {
        return danhSachPhongTro;
    }

    public String getTen() {
        return ten;
    }
    
    
}
