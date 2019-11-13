package common;
public class Skill {
    private String name;
    private float damage;
    private float useMp;
    private float desPr;
    
    public Skill(String name, float damage, float useMp, float desPr){
        this.name = name;
        this.damage = damage;
        this.useMp = useMp;
        this.desPr = desPr;
    }

    public String getName(){
        return this.name;
    }
    
    public float getDamage() {
        return this.damage;
    }

    public float getUseMp() {
        return this.useMp;
    }

    public float getDesPr() {
        return this.desPr;
    }
    
}
