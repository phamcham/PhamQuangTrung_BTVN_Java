package bai2;

import common.*;

public class Bai2 {
    public static void main(String[] args) {
        Oto oto = new Oto();
        oto.setNhanHieu("ChamDz");
        oto.setNamSX(2019);
        oto.setHang("Lamborghini");
        oto.setSoChoNgoi(9999);
        oto.setDungTich(696969);
        Moto moto = new Moto();
        moto.setNhanHieu("VoChamDz");
        moto.setNamSX(2028);
        moto.setHang("Honda");
        moto.setPhanPhoi(300005);
        
        System.out.println("Oto:");
        System.out.println("Nhan hieu: " + oto.getNhanHieu());
        System.out.println("Nam san xuat: " + oto.getNamSX());
        System.out.println("Ten Hang: " + oto.getHang());
        System.out.println("So cho ngoi: " + oto.getSoChoNgoi());
        System.out.println("Dung tich: " + oto.getDungTich());
        
        System.out.println("Moto:");
        System.out.println("Nhan hieu: " + moto.getNhanHieu());
        System.out.println("Nam san xuat: " + moto.getNamSX());
        System.out.println("Ten Hang: " + moto.getHang());
        System.out.println("Phan phoi: " + moto.getPhanPhoi());
    }
    
}
