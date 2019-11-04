package bai2;

import common.Knight;

public class Bai2 {

    public static void main(String[] args) {
        Knight a = new Knight();
        a.InputKnight();
        for (int i = 0; i < 3; i++){
            a.Heal();
            a.ShowKnight();
        }
    }
    
}
