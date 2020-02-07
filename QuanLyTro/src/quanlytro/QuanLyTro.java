package quanlytro;

import java.util.Scanner;
import myClass.*;

public class QuanLyTro {
    
    public static Ngay Date(int ngay, int thang, int nam){
        Ngay n = new Ngay(ngay, thang, nam);
        return n;
    }
    
    public static void main(String[] args) {
        NhaTro nhatro = new NhaTro("Phạm Chàm Quán");
        KhachThue[] khachthue = new KhachThue[10];
        HoaDon[] hoadon = new HoaDon[5];
        
        khachthue[0] = new KhachThue(1, "Bạn Chàm", "04142551354", Date(5, 11, 2000), "Nam", "Ăn bám", "21123123", "Tung Của");
        khachthue[1] = new KhachThue(2, "Anh Tú", "25251325", Date(1, 2, 1999), "Gay", "Ăn mày", "1113311313", "Campuchia");
        khachthue[2] = new KhachThue(3, "Bạn XXX", "123241412", Date(3, 5, 2000), "Nữ", "Vợ Chàm", "33404315", "Việt Nam");
        khachthue[3] = new KhachThue(4, "Chị Liên", "34534525", Date(12, 11, 2000), "Nam", "Công nhân", "21123123", "Việt Nam");
        khachthue[4] = new KhachThue(5, "Anh Bạch", "247426245", Date(8, 2, 1999), "Gay", "Công nhân", "436636", "Thái Lan");
        khachthue[5] = new KhachThue(6, "Anh Anh", "674685647", Date(22, 12, 1998), "Gay", "Thất nghiệp", "356356", "Hà Lội");
        khachthue[6] = new KhachThue(7, "Cô Yêu", "13424525426", Date(5, 5, 2001), "Nam", "Học sinh", "46767467", "Hà Mã");
        khachthue[7] = new KhachThue(8, "Em Em", "356357353", Date(9, 12, 2000), "Nam", "Học sinh", "9898978", "Tung Của");
        khachthue[8] = new KhachThue(9, "Chú Nhiều", "35624542", Date(9, 4, 1999), "Gay", "Ăn mày", "112112121", "Campuchia");
        khachthue[9] = new KhachThue(10, "Bác Lắm", "777735635", Date(21, 9, 2002), "Gay", "Học sinh", "1778987654", "Campuchia");
        
        hoadon[0] = new HoaDon(1, Date(1, 1, 2020), 123, 234, 200000, 100000, 800000);
        hoadon[1] = new HoaDon(2, Date(1, 1, 2020), 123, 234, 300000, 150000, 900000);
        hoadon[2] = new HoaDon(3, Date(1, 1, 2020), 123, 234, 250000, 150000, 700000);
        hoadon[3] = new HoaDon(4, Date(1, 1, 2020), 123, 234, 315000, 150000, 1800000);
        hoadon[4] = new HoaDon(5, Date(1, 1, 2020), 123, 234, 305000, 200000, 1900000);
        
        PhongTro[] phongtro = new PhongTro[3];
        
        phongtro[0] = new PhongTro(1, 35, true, true);
        phongtro[1] = new PhongTro(2, 35, false, false);
        phongtro[2] = new PhongTro(3, 40, true, true);
        
        phongtro[0].ThemKhachThue(khachthue[0]);
        phongtro[0].ThemKhachThue(khachthue[1]);
        phongtro[0].ThemKhachThue(khachthue[2]);
        phongtro[1].ThemKhachThue(khachthue[3]);
        phongtro[1].ThemKhachThue(khachthue[4]);
        phongtro[1].ThemKhachThue(khachthue[5]);
        phongtro[2].ThemKhachThue(khachthue[6]);
        phongtro[2].ThemKhachThue(khachthue[7]);
        phongtro[2].ThemKhachThue(khachthue[8]);
        phongtro[2].ThemKhachThue(khachthue[9]);
        
        phongtro[0].ThemHoaDon(hoadon[0]);
        phongtro[0].ThemHoaDon(hoadon[1]);
        phongtro[1].ThemHoaDon(hoadon[2]);
        phongtro[1].ThemHoaDon(hoadon[3]);
        phongtro[2].ThemHoaDon(hoadon[4]);
        
        for (int i = 0; i < 3; i++) nhatro.ThemPhongTro(phongtro[i]);
        
        while (true){
            System.out.println("----------------- MENU ------------------");
            System.out.println("1. Truy vấn nhà trọ");
            System.out.println("2. Truy vấn phòng trọ");
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            if (t == 1){
                System.out.println("MENU :\\ TRUYVANNHATRO");
                System.out.println("----------------- TUỲ CHỌN ------------------");
                System.out.println("1. Sửa thông tin nhà trọ");
                System.out.println("2. Xuất thông tin nhà trọ");
                System.out.println("3. Xây thêm nhà trọ");
                System.out.println("4. Phá nhà trọ");
                System.out.println("0. Trở lại");
                t = in.nextInt();
                switch (t) {
                    case 1:{
                        System.out.println("MENU :\\ TRUYVANNHATRO \\ SUATHONGTIN");
                        nhatro.Sua();
                        break;
                    }
                    case 2:{
                        System.out.println("MENU :\\ TRUYVANNHATRO \\ XUATTHONGTIN");
                        nhatro.ThongTin();
                        break;
                    }
                    case 3:{
                        System.out.println("MENU :\\ TRUYVANNHATRO \\ XAYNHA");
                        System.out.println("Nhập mã phòng trọ mới: ");
                        int mpt = in.nextInt();
                        PhongTro ptm = new PhongTro(mpt);
                        ptm.Sua();
                        nhatro.ThemPhongTro(ptm);
                        break;
                    }
                    case 4:{
                        System.out.println("MENU :\\ TRUYVANNHATRO \\ PHANHA");
                        System.out.println("Nhập mã phòng trọ mới: ");
                        int mpt = in.nextInt();
                        nhatro.PhaPhongTro(mpt);
                        break;
                    }
                    default:
                        break;
                }
            }
            else if (t == 2){
                System.out.println("MENU :\\ TRUYVANPHONGTRO");
                nhatro.ThongTin(); for (int i = 0; i < 52; i++) System.out.print("-"); System.out.println();
                System.out.println("Nhập mã phòng trọ: ");
                int mpt = in.nextInt();
                int p = -1;
                for (int i = 0; i < nhatro.getDanhSachPhongTro().size(); i++) {
                    if (nhatro.getDanhSachPhongTro().get(i).getMa() == mpt){
                        p = i;
                    }
                }
                if (p == -1){
                    System.out.println("KHÔNG TÌM THẤY MÃ PHÒNG " + mpt);
                }
                else{
                    System.out.println("----------------- TUỲ CHỌN ------------------");
                    System.out.println("1. Thêm khách thuê");
                    System.out.println("2. Xoá khách thuê");
                    System.out.println("3. Thêm hoá đơn");
                    System.out.println("4. Xoá hoá đơn");
                    System.out.println("5. Sửa thông tin");
                    System.out.println("6. Xuất thông tin phòng trọ");
                    System.out.println("7. Xuất thông tin khách");
                    System.out.println("8. Truy vấn khách thuê");
                    System.out.println("9. Truy vấn hoá đơn");
                    t = in.nextInt();
                    switch (t){
                        case 1:{
                            System.out.println("MENU :\\ TRUYVANPHONGTRO \\ THEMKHACHTHUE");
                            System.out.println("Nhập mã khách hàng: ");
                            int m = in.nextInt();
                            KhachThue kt = new KhachThue(m);
                            kt.Nhap();
                            nhatro.getDanhSachPhongTro().get(p).ThemKhachThue(kt);
                            break;
                        }
                        case 2:{
                            System.out.println("MENU :\\ TRUYVANPHONGTRO \\ XOAKHACHTHUE");
                            System.out.println("Nhập mã khách hàng: ");
                            int m = in.nextInt();
                            nhatro.getDanhSachPhongTro().get(p).DuoiKhachThue(m);
                            break;
                        }
                        case 3:{
                            System.out.println("MENU :\\ TRUYVANPHONGTRO \\ THEMHOADON");
                            System.out.println("Nhập mã hoá đơn: ");
                            int m = in.nextInt();
                            HoaDon hd = new HoaDon(m);
                            hd.Nhap();
                            nhatro.getDanhSachPhongTro().get(p).ThemHoaDon(hd);
                            break;
                        }
                        case 4:{
                            System.out.println("MENU :\\ TRUYVANPHONGTRO \\ XOAHOADON");
                            System.out.println("Nhập mã hoá đơn: ");
                            int m = in.nextInt();
                            nhatro.getDanhSachPhongTro().get(p).XoaHoaDon(m);
                            break;
                        }
                        case 5:{
                            System.out.println("MENU :\\ TRUYVANPHONGTRO \\ SUATHONGTIN");
                            nhatro.getDanhSachPhongTro().get(p).Sua();
                            break;
                        }
                        case 6:{
                            System.out.println("MENU :\\ TRUYVANPHONGTRO \\ XUATTHONGTINPHONGTRO");
                            nhatro.getDanhSachPhongTro().get(p).ThongTin();
                            break;
                        }
                        case 7:{
                            System.out.println("MENU :\\ TRUYVANPHONGTRO \\ XUATTHONGTINKHACH");
                            nhatro.getDanhSachPhongTro().get(p).TongTinKhachThue();
                            break;
                        }
                        case 8:{
                            System.out.println("MENU :\\ TRUYVANPHONGTRO \\ TRUYVANKHACHTHUE");
                            System.out.println("Nhập mã khách thuê");
                            int mkt = in.nextInt();
                            int pp = -1;
                            for (int i = 0; i < nhatro.getDanhSachPhongTro().get(p).getDanhSachKhachThue().size(); i++) {
                                if (nhatro.getDanhSachPhongTro().get(p).getDanhSachKhachThue().get(i).getMa() == mkt){
                                    pp = i;
                                }
                            }
                            if (pp == -1){
                                System.out.println("KHÔNG TÌM THẤY MÃ KHÁCH");
                            }
                            else{
                                System.out.println("----------------- TUỲ CHỌN ------------------");
                                System.out.println("1. Thông tin khách hàng");
                                System.out.println("2. Sửa thông tin");
                                t = in.nextInt();
                                if (t == 1){
                                    System.out.println("MENU :\\ TRUYVANPHONGTRO \\ TRUYVANKHACHTHUE \\ THONGTINKHACHHANG");
                                    nhatro.getDanhSachPhongTro().get(p).getDanhSachKhachThue().get(pp).Xuat();
                                }
                                else{
                                    System.out.println("MENU :\\ TRUYVANPHONGTRO \\ TRUYVANKHACHTHUE \\ SUATHONGTIN");
                                    nhatro.getDanhSachPhongTro().get(p).getDanhSachKhachThue().get(pp).Sua();
                                }
                            }
                            break;
                        }
                        case 9:{
                            System.out.println("MENU :\\ TRUYVANPHONGTRO \\ TRUYVANHOADON");
                            System.out.println("Nhập mã hoá đơn:");
                            int mdh = in.nextInt();
                            int pp = -1;
                            for (int i = 0; i < nhatro.getDanhSachPhongTro().get(p).getDanhSachHoaDon().size(); i++) {
                                if (nhatro.getDanhSachPhongTro().get(p).getDanhSachHoaDon().get(i).getMa() == mdh){
                                    pp = i;
                                }
                            }
                            if (pp == -1){
                                System.out.println("KHÔNG TÌM THẤY MÃ HOÁ ĐƠN");
                            }
                            else{
                                System.out.println("----------------- TUỲ CHỌN ------------------");
                                System.out.println("1. Thông tin hoá đơn");
                                System.out.println("2. Sửa thông tin");
                                t = in.nextInt();
                                if (t == 1){
                                    System.out.println("MENU :\\ TRUYVANPHONGTRO \\ TRUYVANHOADON \\ THONGTINHOADON");
                                    nhatro.getDanhSachPhongTro().get(p).getDanhSachHoaDon().get(pp).Xuat();
                                }
                                else{
                                    System.out.println("MENU :\\ TRUYVANPHONGTRO \\ TRUYVANHOADON \\ SUATHONGTIN");
                                    nhatro.getDanhSachPhongTro().get(p).getDanhSachHoaDon().get(pp).Sua();
                                }
                            }
                            break;
                        }
                        default: System.out.println("NHẬP SAI!");
                    }
                }
            }
        }
    }
    
}
