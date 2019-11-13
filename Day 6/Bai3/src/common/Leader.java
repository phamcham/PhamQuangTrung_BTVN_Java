package common;
public class Leader {
    private String name;
    private int age;
    private int soNgayCaiTri;
    public Leader(String name, int age, int soNgayCaiTri){
        this.name = name;
        this.age = age;
        this.soNgayCaiTri = soNgayCaiTri;
    }
    public void show(){
        System.out.println("Leader " + this.name + ", tuổi: " + this.age + " số ngày lãnh đạo: " + this.soNgayCaiTri);
    }
}
