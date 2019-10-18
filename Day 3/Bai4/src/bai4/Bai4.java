package bai4;
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String helu = "hello";
        
        int p = 0;
        for (char c : s.toCharArray()){
            if (p < helu.length() && c == helu.charAt(p)){
                p++;
            }
        }
        if (p < 5) System.out.println("No");
        else System.out.println("Yes");
    }
    
}
