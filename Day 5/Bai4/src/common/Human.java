package common;

import java.util.*;

public class Human {
    private String name;
    private int hp;
    private int dmg;
    
    public void InputHuman(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập tên: "); this.name = in.nextLine();
        System.out.println("Nhập hp: "); this.hp = in.nextInt();
        System.out.println("Nhập dmg: "); this.dmg = in.nextInt();
    }
    public void ShowHuman(){
        System.out.println(this.name + ": Hp = " + this.hp);
    }
    
    public void Attacked(Human enemy){
        this.hp = Math.max(0, this.hp - enemy.dmg);
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }
}
