package common;
import java.util.*;

public class Club {
    private String nameClub;
    private int nMember;
    private Person Member[];

    public void InputMember(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập tên club: "); this.nameClub = in.next();
        System.out.print("Nhập số thành viên: "); this.nMember = in.nextInt();
        this.Member = new Person[nMember];
        for (int i = 0; i < nMember; i++) {
            System.out.println("Nhập thông tin thành viên thứ " + (i + 1) + ":");
            this.Member[i] = new Person();
            this.Member[i].InputPerson();
        }
    }
    
    public void ShowMember(){
        for (int i = 0; i < nMember; i++){
            System.out.println("Thông tin thành viên thứ " + (i + 1) + " của club " + nameClub + ":");
            Member[i].ShowPerson();
        }
    }
}
