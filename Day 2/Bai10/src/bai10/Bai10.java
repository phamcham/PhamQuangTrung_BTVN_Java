package bai10;
import java.util.*;
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double del = b * b - 4 * a * c;
        if (a == 0){
            if (b == 0){
                if (c == 0) System.out.println("Vo so nghiem");
                else System.out.println("Khong co nghiem");
            }
            else{
                System.out.println("Nghiem: " + -c/b);
            }
        }
        else if (del < 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (del > 0){
            double x1 = (-b - Math.sqrt(del)) / (2 * a);
            double x2 = (-b + Math.sqrt(del)) / (2 * a);
            System.out.println("Nghiem: x1 = " + x1 + "\nx2 = " + x2);
        }
        else{
            double x = -b / (2 * a);
            System.out.println("Nghiem kep: x = " + x);
        }
    }
}