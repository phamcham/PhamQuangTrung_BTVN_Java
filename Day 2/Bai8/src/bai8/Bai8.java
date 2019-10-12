package bai8;
import java.util.*;
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c){
            int tmp = a;
            a = c;
            c = tmp;
        }
        if (b < c){
            int tmp = c;
            c = b;
            b = tmp;
        }
        System.out.println("Max: " + a + "\nMin: " + c);
    }
}