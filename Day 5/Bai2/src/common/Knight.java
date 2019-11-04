package common;
import java.util.*;

public class Knight {
    private String name;
    private int hp;
    private int mp;
    
    public void InputKnight(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập tên Knight: "); this.name = in.nextLine();
        System.out.println("Nhập hp " + this.name + ":"); this.hp = in.nextInt();
        System.out.println("Nhập mp " + this.name + ":"); this.mp = in.nextInt();
    }
    
    public void ShowKnight(){
        System.out.println("Knight " + this.name + ":");
        System.out.println("Hp = " + this.hp + "\nMp = " + this.mp);
    }
    
    public void Heal(){
        if (this.mp >= 50){
            this.mp -= 50;
            this.hp += 30;
        }
    }
}
