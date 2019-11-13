package bai4;
import common.*;
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Skill[] archersSkill = {new Skill("Hit", 30f, 0f, 0f), new Skill("Aim", 100f, 30f, 10f)};
        Skill[] knightSkill = {new Skill("Hit", 40f, 0f, 0f), new Skill("Shield", 100f, 50f, 30f)};
        Skill[] tigerSkill = {new Skill("Fire Blowwing", 30f, 0f, 0f)};
        Character1[] Player = {new Character1("Archers", 200f, 150f, 0f, archersSkill), new Character1("Knight", 150f, 100f, 20f, knightSkill)};
        Character1[] Monster = {new Character1("Tiger", 500f, 0f, 20f, tigerSkill)};
        System.out.println("Lựa chọn anh hùng: ");
        int n = in.nextInt();
        
        Battle BattleField = new Battle(Player[n], Monster[0]);
        BattleField.Play();
    }
    
}
