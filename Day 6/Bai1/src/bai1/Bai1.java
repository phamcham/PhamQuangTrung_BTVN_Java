package bai1;
import common.ConHeo;

public class Bai1 {
    public static void main(String[] args) {
        ConHeo[] conHeo = new ConHeo[5];
        conHeo[0] = new ConHeo("Ahihi");
        conHeo[0].show();
        conHeo[1] = new ConHeo("Huhu", 50.0f);
        conHeo[1].show();
        conHeo[2] = new ConHeo("Haha", 19);
        conHeo[2].show();
        conHeo[3] = new ConHeo("Uwf", 69.0f, 29);
        conHeo[3].show();
        conHeo[4] = new ConHeo(69, 35.0f);
        conHeo[4].show();
    }
}
