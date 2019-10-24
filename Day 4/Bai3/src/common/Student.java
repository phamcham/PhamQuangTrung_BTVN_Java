
package common;

import java.util.*;

public class Student {
    private String name;
    private String code;
    private int age;
    public void InputInfo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ten: "); this.name = in.nextLine();
        System.out.print("Nhap ma sinh vien: "); this.code = in.nextLine();
        System.out.print("Nhap tuoi: "); this.age = in.nextInt();
    }
    public void ShowInfo(){
        System.out.println("Ten: " + this.name + ", Ma sinh vien: " + this.code + ", Tuoi: " + this.age);
    }
}
