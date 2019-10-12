package bai9;
import java.util.*;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0){
            if (b == 0) System.out.println("Vo so nghiem");
            else System.out.println("Khong co nghiem");
        }
        else{
            System.out.println("Nghiem: " + -b/a);
        }
    }
}