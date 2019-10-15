package bai2;
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int ans = 0;
        for (char c : a.toCharArray()){
            int val = c - '0';
            if (val >= 0 && val <= 9){
                ans += val;
            }
        }
        System.out.println(ans);
    }
    
}
