package common;
public class Moto extends Vehicle{
    private int PhanPhoi;

    public int getPhanPhoi() {
        return PhanPhoi;
    }

    public void setPhanPhoi(int PhanPhoi) {
        this.PhanPhoi = PhanPhoi;
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
