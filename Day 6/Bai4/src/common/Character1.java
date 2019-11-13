package common;
public class Character1 {
    private String name;
    private float hp;
    private float mp;
    private float ar;
    private Skill[] skill;
    
    public Character1(String name, float hp, float mp, float ar, Skill[] skill){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.ar = ar;
        this.skill = skill;
    }
    
    public boolean canUseSkill(int choose){
        if (this.mp < skill[choose].getUseMp()){
            return false;
        }
        else{
            this.mp -= skill[choose].getDamage();
            return true;
        }
    }
    
    public void beDamaged(Skill skill){
        if (skill.getDamage() > this.ar){
            this.hp = Math.max(0, this.hp + this.ar - skill.getDamage());
            this.ar = 0;
        } else {
            this.ar -= skill.getDamage();
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public float getMp(){
        return this.mp;
    }
    
    public float getAr(){
        return this.ar;
    }
    
    public boolean isDead(){
        return this.hp <= 0.0f;
    }
    
    public Skill getSkill(int i){
        return this.skill[i];
    }
    
    public void showInfo(){
        System.out.println(this.name + "'s HP: " + this.hp);
        System.out.println(this.name + "'s MP: " + this.mp);
        System.out.println(this.name + "'s Armor: " + this.ar);
    }
}
