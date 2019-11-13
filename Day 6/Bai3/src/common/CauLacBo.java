package common;
public class CauLacBo {
    private Leader A;
    private Support B;
    private Member C;
    
    // khong biet lam the nao nua
    public CauLacBo(){
        A = new Leader("Ahihi", 20, 1);
        String[] tv = {"Ku", "Da", "Sai"};
        B = new Support("Lan", 30, tv);
        C = new Member("Cham", 1, 99);
    }
    public void show(){
        A.show();
        B.show();
        C.show();
    }
}
