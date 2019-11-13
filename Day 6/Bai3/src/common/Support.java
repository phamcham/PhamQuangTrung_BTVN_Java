package common;
public class Support {
    private String name;
    private int age;
    private String[] tenMems;
    public Support(String name, int age, String[] tenMems){
        this.name = name;
        this.age = age;
        this.tenMems = tenMems;
    }
    public void show(){
        System.out.println("Support " + this.name + ", tuổi: " + this.age);
        System.out.println("Tên các thành viên trong nhóm:");
        for (String s : this.tenMems) System.out.println(s);
    }
}
