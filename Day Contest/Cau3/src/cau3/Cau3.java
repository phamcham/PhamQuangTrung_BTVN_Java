package cau3;

import common.SoLienLac;
import common.TenLienLac;
import java.util.ArrayList;
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <TenLienLac> slc = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            System.out.println("Nhập thông tin liên lạc thứ " + i + " : ");
            String ma, ten, sdt;
            System.out.println("Nhập mã: "); ma = in.nextLine();
            System.out.println("Nhập tên: "); ten = in.nextLine();
            System.out.println("Nhập số điện thoại: "); sdt = in.nextLine();
            TenLienLac tll = new TenLienLac(ma, ten, sdt);
            slc.add(tll);
        }
        SoLienLac sll = new SoLienLac(slc);
        while (true){
            System.out.println("Thêm tên liên lạc 1");
            System.out.println("Tìm kiếm id 2");
            System.out.println("Hiển thị thông tin bằng id 3");
            System.out.println("Sửa thông tin bằng id 4");
            System.out.println("Xoá thông tin bằng id 5");
            int c = in.nextInt();
            switch (c) {
                case 1:
                    String ma, ten, sdt;
                    System.out.println("Nhập mã: ");
                    ma = in.nextLine();
                    System.out.println("Nhập tên: ");
                    ten = in.nextLine();
                    System.out.println("Nhập số điện thoại: ");
                    sdt = in.nextLine();
                    TenLienLac tll = new TenLienLac(ma, ten, sdt);
                    sll.ThemTenLienLac(tll);
                    break;
                case 2:
                    {
                        System.out.println("Nhập id: ");
                        String id = in.nextLine();
                        sll.TimKiemID(id);
                        break;
                    }
                case 3:
                    {
                        System.out.println("Nhập id: ");
                        String id = in.nextLine();
                        sll.HienThiThongTinBangID(id);
                        break;
                    }
                case 4:
                    {
                        System.out.println("Nhập id: ");
                        String id = in.nextLine();
                        sll.SuaThongTinBangID(id);
                        break;
                    }
                case 5:
                    {
                        System.out.println("Nhập id: ");
                        String id = in.nextLine();
                        sll.XoaThongTinBangID(id);
                        break;
                    }
                default:
                    break;
            }
            sll.HienThiToanBoThongTin();
        }
    }
    
}
