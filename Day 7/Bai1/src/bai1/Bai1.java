package bai1;

import common.*;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KySu[] kysu = new KySu[10];
        System.out.println("Nhap so ky su: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin ky su thu " + (i + 1));
            kysu[i] = new KySu();
            kysu[i].NHAP();
        }
        System.out.println();
        System.out.println("Danh sach ky su:");
        for (int i = 0; i < n; i++){
            System.out.println(kysu[i].getTen());
        }
        
        int namTotNghiepGanNhat = 6969;
        for (int i = 0; i < n; i++){
            namTotNghiepGanNhat = Math.min(namTotNghiepGanNhat, kysu[i].getNamTN());
        }
        
        System.out.println("Thong tin ky su tot nghiep nam " + namTotNghiepGanNhat);
        for (int i = 0; i < n; i++){
            if (kysu[i].getNamTN()== namTotNghiepGanNhat){
                kysu[i].XUAT();
            }
            System.out.println();
        }
    }
}
