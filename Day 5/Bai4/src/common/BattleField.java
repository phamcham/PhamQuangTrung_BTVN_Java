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
        int turn = 0, i = 0;
        while (human[0].getHp() > 0 && human[1].getHp() > 0){
            System.out.println("Lần " + ++i + ":");
            this.human[turn].Attacked(this.human[turn^1]);
            this.human[0].ShowHuman();
            this.human[1].ShowHuman();
            turn ^= 1;
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
