
package common;

import java.util.*;

public class JavaClass {
    private Student stdList[];
    private int ratingStar;
    private String leaderName;
    private void InputStudent(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so sinh vien: "); int n = in.nextInt();
        this.stdList = new Student[n];
        for (int i = 0; i < this.stdList.length; i++){
            System.out.println("Nhap Thong tin sinh vien thu " + (i + 1) + ":");
            stdList[i] = new Student();
            stdList[i].InputInfo();
        }
    }
    private void ShowStudent(){
        for (int i = 0; i < this.stdList.length; i++) {
            System.out.println("Thong tin cua sinh vien thu " + (i + 1) + " la:");
            this.stdList[i].ShowInfo();
        }
        
    }
    public void InputClassInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten leader: "); this.leaderName = in.nextLine();
        System.out.println("Danh gia ratingStar: "); this.ratingStar = in.nextInt();
        this.InputStudent();
    }
    public void ShowClassInfo(){
        System.out.println("Ten leader: " + this.leaderName);
        System.out.println("RatingStar: " + this.ratingStar);
        this.ShowStudent();
    }

}
