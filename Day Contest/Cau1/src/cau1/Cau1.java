package cau1;

import common.NhanVien;

public class Cau1 {
    public static void main(String[] args) {
        NhanVien[] nhanvien = new NhanVien[4];
        nhanvien[0] = new NhanVien("QQQQ", "con chó", "nhan vien");
        nhanvien[1] = new NhanVien("XXXX", "con mèo", "truong phong");
        nhanvien[2] = new NhanVien("PPPP", "con gà", "giam doc");
        nhanvien[3] = new NhanVien("FFFF", "con lợn", "chu tich");
        for (int i = 0; i < 4; i++) {
            nhanvien[i].HienThiThongTin();
        }
    }
}
