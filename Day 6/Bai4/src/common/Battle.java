package common;
import java.util.*;
public class Battle {
    private Character1 Player;
    private Character1 Monster;
    
    public Battle(Character1 Player, Character1 Monster){
        this.Player = Player;
        this.Monster = Monster;
    }
    
    public void Play(){
        Scanner in = new Scanner(System.in);
        int turn = 0;
        while (true){
            if (turn == 0){
                System.out.println(">>>>>>>>HERO'S TURN<<<<<<<<<<");
                Player.showInfo();
                System.out.println("-------------HERO'S SKILL-------------");
                for (int i = 0; i <= 1; i++)
                    System.out.println(i + " - " + Player.getSkill(i).getName() + "(mana = " + Player.getSkill(i).getUseMp() + ", dame = " + Player.getSkill(i).getDamage() + " arp = " + Player.getSkill(i).getDesPr() + ")");
                
                System.out.println("Choose skill:");
                int choose = in.nextInt();
                if (Player.canUseSkill(choose)){
                    System.out.println("NOT ENOUGHT MANA");
                }
                else{
                    Monster.beDamaged(Player.getSkill(choose));
                }
            }
            else{
                System.out.println(">>>>>>>>MONSTER'S TURN<<<<<<<<<<");
                Monster.showInfo();
                System.out.println("-------------MONSTER'S SKILL-------------");
                for (int i = 0; i <= 0 ; i++)
                    System.out.println(i + " - " + Monster.getSkill(i).getName() + "(mana = " + Monster.getSkill(i).getUseMp() + ", dame = " + Monster.getSkill(i).getDamage() + " arp = " + Monster.getSkill(i).getDesPr() + ")");
                
                System.out.println("Choose skill:");
                int choose = in.nextInt();
                if (Monster.getMp() < Monster.getSkill(choose).getUseMp()) System.out.println("NOT ENOUGHT MANA");
                else Player.beDamaged(Monster.getSkill(choose));
            }
            turn ^= 1;
            if (Player.isDead()){
                System.out.println("Monster is fucking winnerrrrrr!");
                break;
            }
            if (Monster.isDead()){
                System.out.println("Hero is fucking winnerrrrr!");
                break;
            }
        }
    }
}
