package common;
import java.util.*;

public class Person {
    private String Code;
    private String Name;
    private int Age;
    private String ClassName;

    public void InputPerson(){
        Scanner in = new Scanner(System.in);
        System.out.println("Mã sinh viên: "); this.Code = in.nextLine();
        System.out.println("Tên sinh viên: "); this.Name = in.nextLine();
        System.out.println("Tuổi sinh viên: "); this.Age = in.nextInt();
        System.out.println("Tên lớp: "); this.ClassName = in.next();
    }
    
    public void ShowPerson(){
        System.out.println("Mã sinh viên: " + this.Code);
        System.out.println("Tên sinh viên: " + this.Name);
        System.out.println("Tuổi sinh viên: " + this.Age);
        System.out.println("Tên lớp: " + this.ClassName);
    }
    
}
