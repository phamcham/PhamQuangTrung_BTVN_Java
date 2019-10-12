package bai10;
import java.util.*;
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double del = b * b - 4 * a * c;
        if (del < 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (del > 0){
            double x1 = (-b - Math.sqrt(del)) / (2 * a);
            double x2 = (-b + Math.sqrt(del)) / (2 * a);
            System.out.println("Nghiem: x1 = " + x1 + "\nx2 = " + x2);
        }
    }
}