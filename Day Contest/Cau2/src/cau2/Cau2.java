package cau2;

import common.ToTien;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        
        ToTien[] ToThu = new ToTien[11];
        
        ToThu[0] = new ToTien("M110A634ABG","1k");
        ToThu[1] = new ToTien("M3255LINH45","1k");
        ToThu[2] = new ToTien("M3HIEU2AS34","1k");

        ToThu[3] = new ToTien("U13HTS34E","2k");
        ToThu[4] = new ToTien("982TUXP21","2k");
        ToThu[5] = new ToTien("38HIT7734","2k");

        ToThu[6] = new ToTien("65GSONGNGHIEN2","5k");
        ToThu[7] = new ToTien("G3C 5WHZ3FDE324","5k");
        ToThu[8] = new ToTien("H34ITHUTS25551","5k");

        ToThu[9] = new ToTien("C7H10OTHAI13","10k");
        
        String[] Giau = {"SON","TU","THU","LINH","THAI","HIEU"};
        
        for (String sGiau : Giau) {
            System.out.println(sGiau + ": ");
            for (int j = 0; j < 10; j++) {
                if (ToThu[j].getMaToTien().contains(sGiau)){
                    ToThu[j].HienThiThongTin();
                }
            }
        }
        
        System.out.println("Các tờ có tổng các chữ số trong mã chia hết cho loại tiền:");
        for (int i = 0; i < 10; i++){
            int sum = ToThu[i].getSum();
            int type = ToThu[i].getType();
            if (sum % type == 0){
                ToThu[i].HienThiThongTin();
            }
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số tiền cần đổi: ");
        int k = in.nextInt();
        if (k < 10){
            for (int i = 0; i < 3; i++){
                for (int j = 3; j < 6; j++) {
                    for (int l = 6; l < 9; l++) {
                        int code = ToThu[i].getType() + ToThu[j].getType() + ToThu[l].getType();
                        Boolean ok = true;
                        if (code % 2 == 1) ok = false;
                        int sum = ToThu[i].getSum() + ToThu[j].getSum() + ToThu[l].getSum();
                        if (sum == k){
                            ToThu[i].HienThiThongTin();
                            ToThu[j].HienThiThongTin();
                            ToThu[l].HienThiThongTin();
                        }
                    }
                }
            }
        }
        
    }
}
