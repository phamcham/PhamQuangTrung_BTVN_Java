package common;
public class ToTien {
    private String MaToTien;
    private String LoaiTien;

    public ToTien(String MaToTien, String LoaiTien) {
        this.MaToTien = MaToTien;
        this.LoaiTien = LoaiTien;
    }
    
    public void HienThiThongTin(){
        System.out.println("Mã tờ tiền: " + this.MaToTien + "\tLoại tiền: " + this.LoaiTien);
        System.out.println();
    }

    public String getMaToTien() {
        return MaToTien;
    }

    public String getLoaiTien() {
        return LoaiTien;
    }
    
    public int getSum(){
        int sum = 0;
        for (int j = 0; j < this.MaToTien.length(); j++){
            if (this.MaToTien.charAt(j) >= '0' && this.MaToTien.charAt(j) <= '9'){
                sum += this.MaToTien.charAt(j) - '0';
            }
        }
        return sum;
    }
    
    public int getType(){
        int type = 0;
        for (int j = 0; j < this.MaToTien.length() - 1; j++){
            type = 10 * type + this.MaToTien.charAt(j) - '0';
        }
        return type;
    }
}
