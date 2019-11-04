package common;

public class BattleField {
    private Human human[];
    
    public void InputBattleField(){
        this.human = new Human[2];
        for (int i = 0; i < 2; i++){
            System.out.println("Nhập thông tin người " + (i + 1) + ":");
            this.human[i] = new Human();
            this.human[i].InputHuman();
        }
    }
    
    public void Fight(){
        for (int i = 1; i <= 4; i++){
            System.out.println("Lần " + i + ":");
            this.human[1].Attacked(this.human[0]);
            this.human[0].ShowHuman();
            this.human[1].ShowHuman();
        }
        for (int i = 5; i <= 10; i++){
            System.out.println("Lần " + i + ":");
            this.human[0].Attacked(this.human[1]);
            this.human[0].ShowHuman();
            this.human[1].ShowHuman();
        }
    }
    
    public void Result(){
        if (human[0].getHp() == human[1].getHp()) System.out.println("Hoà nhé :v");
        else{
            if (human[0].getHp() < human[1].getHp()) System.out.println(human[1].getName() + " thắng cmnr :3");
            else System.out.println(human[0].getName() + " ez to win :3");
        }
    }
}
