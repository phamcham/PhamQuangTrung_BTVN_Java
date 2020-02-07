package myClass;

import java.util.Scanner;

public class Ngay {
    private int ngay, thang, nam;
    
    public Ngay(){
        this.ngay = 0;
        this.thang = 0;
        this.nam = 0;
    }

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    private boolean LaNgayHopLe(int ngay, int thang, int nam){
        boolean namNhuan = (nam%400 == 0 || (nam%4 == 0 && nam%100 != 0));
        int[] maxd = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (namNhuan) maxd[2] = 29;
        return thang >= 1 && thang <= 12 && ngay >= 1 && ngay <= maxd[thang];
    }
    
    public void Nhap(){
        Scanner in = new Scanner(System.in);
        this.ngay = in.nextInt();
        this.thang = in.nextInt();
        this.nam = in.nextInt();
        while (!LaNgayHopLe(this.ngay, this.thang, this.nam)){
            System.out.println("NHẬP SAI RỒI, MỜI NHẬP LẠI!");
            this.ngay = in.nextInt();
            this.thang = in.nextInt();
            this.nam = in.nextInt();
        }
    }
    
    public void Xuat(){
        System.out.printf("%02d/%02d/%04d\n", this.ngay, this.thang, this.nam);
    }
}
