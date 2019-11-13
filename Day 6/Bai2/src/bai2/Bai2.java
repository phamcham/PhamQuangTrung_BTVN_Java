package bai2;

import common.MayTinh;

public class Bai2 {
    public static void main(String[] args) {
        MayTinh calc = new MayTinh();
        System.out.println(calc.TinhTong(35.0f, 51.0f));
        System.out.println(calc.TinhTong(10.0f, 35.0f, 69.0f));
        float[] a = {13.9f, 2.2f, 5.4f, 12.3f};
        System.out.println(calc.TinhTong(a));
    }
}
