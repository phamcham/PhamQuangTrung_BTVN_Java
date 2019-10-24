
package week4bai2;

import common.Dog;
import java.util.*;

public class Week4bai2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dog concho = new Dog();
        concho.InputName(in.nextLine());
        for (int i = 0; i < 3; i++){
            concho.Bark();
            concho.ShowMP();
        }
    }
    
}
