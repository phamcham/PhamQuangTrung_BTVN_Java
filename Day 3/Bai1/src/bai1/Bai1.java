package bai1;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float[] a = new float[n];
        for (int i = 0; i < n; i++) a[i] = in.nextFloat();
        Arrays.sort(a);
        int cnt = 0;
        float ans = -1;
        for (int i = n - 2; i >= 0; i--){
            if (a[i] != a[i + 1]) cnt++;
            if (cnt == 2){
                ans = a[i];
                break;
            }
        }
        if (ans == -1) System.out.println("Khong co");
        else System.out.println(ans);
    }
    
}
