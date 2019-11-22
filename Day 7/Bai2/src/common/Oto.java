package common;
public class Oto extends Vehicle{
    private int SoChoNgoi;
    private int DungTich;

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int SoChoNgoi) {
        this.SoChoNgoi = SoChoNgoi;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }
    
    @Override
    public String getNhanHieu() {
        return super.getNhanHieu();
    }

    @Override
    public void setNhanHieu(String NhanHieu) {
        super.setNhanHieu(NhanHieu);
    }

    @Override
    public int getNamSX() {
        return super.getNamSX();
    }

    @Override
    public void setNamSX(int NamSX) {
        super.setNamSX(NamSX);
    }

    @Override
    public String getHang() {
        return super.getHang();
    }

    @Override
    public void setHang(String Hang) {
        super.setHang(Hang);
    }
}
