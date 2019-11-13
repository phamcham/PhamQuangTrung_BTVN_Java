package common;
public class MayTinh {
    public float TinhTong(float a, float b){
        return a + b;
    }
    public float TinhTong(float a, float b, float c){
        return a + b + c;
    }
    public float TinhTong(float[] a){
        float sum = 0;
        for (float i : a) sum += i;
        return sum;
    }
}
