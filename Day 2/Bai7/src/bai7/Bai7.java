package bai7;
import java.util.*;
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println("Max: " + a + "\nMin: " + b);
    }
}