package common;
public class Person {
    private String HoVaTen;
    private Day NgaySinh;
    private String QueQuan;

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public Day getNS() {
        return this.NgaySinh;
    }

    public void setNS(Day NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return this.QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }
}
