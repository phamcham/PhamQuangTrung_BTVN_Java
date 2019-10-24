
package common;

public class Dog {
    private String name;
    private int MP = 100;
    public void InputName(String name){
        this.name = name;
    }
    public void ShowMP(){
        System.out.println("MP = " + this.MP);
    }
    public void Bark (){
        if (name.isEmpty()) System.out.println("Xin loi ban chua dien ten");
        else System.out.println(this.name + " sua");
        this.MP -= 20;
    }
}
