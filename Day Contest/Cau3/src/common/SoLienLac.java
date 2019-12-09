package common;

import java.util.ArrayList;
import java.util.Scanner;

public class SoLienLac {
    private ArrayList <TenLienLac> SoLienLac;

    public SoLienLac(ArrayList<TenLienLac> SoLienLac) {
        this.SoLienLac = SoLienLac;
    }
    
    public void ThemTenLienLac(TenLienLac A){
        SoLienLac.add(A);
    }
    public TenLienLac TimKiemID(String id){
        for (int i = 0; i < this.SoLienLac.size(); i++){
            if (SoLienLac.get(i).getMa().equals(id)){
                return SoLienLac.get(i);
            }
        }
        return null;
    }
    
    public void HienThiThongTinBangID(String id){
        for (int i = 0; i < this.SoLienLac.size(); i++){
            if (SoLienLac.get(i).getMa().equals(id)){
                SoLienLac.get(i).HienThiThongTin();
            }
        }
    }
    
    public void SuaThongTinBangID(String id){
        Scanner in = new Scanner(System.in);
        System.out.println("1 là có, 0 là không :v");
        for (int i = 0; i < this.SoLienLac.size(); i++){
            if (SoLienLac.get(i).getMa().equals(id)){
                int _ma, _ten, _soDienThoai;
                System.out.println("Sửa mã: "); _ma = in.nextInt();
                System.out.println("Sửa tên: "); _ten = in.nextInt();
                System.out.println("Sửa số điện thoại: "); _soDienThoai = in.nextInt();
                if (_ma == 1){
                    System.out.println("Nhập mã: "); SoLienLac.get(i).setMa(in.nextLine());
                }
                if (_ten == 1){
                    System.out.println("Nhập tên: "); SoLienLac.get(i).setTen(in.nextLine());
                }
                if (_soDienThoai == 1){
                    System.out.println("Nhập số điệnn thoại: "); SoLienLac.get(i).setSoDienThoai(in.nextLine());
                }
            }
        }
    }
    public void XoaThongTinBangID(String id){
        for (int i = 0; i < this.SoLienLac.size(); i++){
            if (SoLienLac.get(i).getMa().equals(id)){
                SoLienLac.remove(i);
            }
        }
    }
    public void HienThiToanBoThongTin(){
        for (int i = 0; i < this.SoLienLac.size(); i++){
            SoLienLac.get(i).HienThiThongTin();
        }
    }
}
