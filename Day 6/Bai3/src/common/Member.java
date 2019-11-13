package common;
public class Member {
    private String name;
    private int nNgayHoatDong;
    private int nNgayNghi;
    public Member(String name, int nNgayHoatDong, int nNgayNghi){
        this.name = name;
        this.nNgayHoatDong = nNgayHoatDong;
        this.nNgayNghi = nNgayNghi;
    }
    public void show(){
        System.out.println("Member " + this.name + ", số ngày chăm: " + this.nNgayHoatDong + ", Ăn éo j k đi học: " + this.nNgayNghi);
    }
}
