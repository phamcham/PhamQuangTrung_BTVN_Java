package common;
public class ConHeo {
    private String name;
    private float weight;
    private int age;

    public ConHeo(String name, float weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public ConHeo(String name){
        this.name = name;
    }
    public ConHeo(String name, float weight){
        this.name = name;
        this.weight = weight;
    }
    public ConHeo(String name, int age){
        this.name = name;
        this.age = age;
    }
    public ConHeo(int age, float weight){
        this.weight = weight;
        this.age = age;
    }
    public void show(){
        System.out.println("Ten: " + name + "\nCan nang: " + weight + "\nTuoi: " + age + '\n');
    }
}
