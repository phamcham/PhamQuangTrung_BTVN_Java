package common;

import java.util.Scanner;

public class KySu extends Person {
    private String NganhHoc;
    private int NamTN;
    
    public void NHAP(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten ky su : "); super.setHoVaTen(in.nextLine());
        System.out.println("Nhap ngay_thang_nam sinh: ");
        Day ngay = new Day();
        ngay.setNgay(in.nextInt());
        ngay.setThang(in.nextInt());
        ngay.setNam(in.nextInt());
        super.setNS(ngay);
        in.nextLine();
        System.out.println("Nhap que quan: "); super.setQueQuan(in.nextLine());
        System.out.println("Nhap nganh hoc: "); this.NganhHoc = in.nextLine();
        System.out.println("Nhap nam tot nghiem: "); this.NamTN = in.nextInt();
    }
    
    public void XUAT(){
        System.out.println("Ten ky su: " + super.getHoVaTen());
        System.out.println("Ngay sinh: " + super.getNS().getNgay() + "/" + super.getNS().getThang() + "/" + super.getNS().getNam());
        System.out.println("Que quan: " + super.getQueQuan());
        System.out.println("Nganh hoc: " + this.NganhHoc);
        System.out.println("Nam tot nghiep: " + this.NamTN);
    }

    public int getNamTN() {
        return NamTN;
    }
    
    public String getTen(){
        return super.getHoVaTen();
    }
}
