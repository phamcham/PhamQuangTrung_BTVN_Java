
package week4bai1;

import common.Person;

public class Week4bai1 {
    public static void main(String[] args) {
        Person SonNghien = new Person();
        Person TuBueDe = new Person();
        SonNghien.setName("Son");
        SonNghien.setAge(20);
        SonNghien.setHobby("An chay");
        SonNghien.setSex("Nam");
        TuBueDe.setName("Tu");
        TuBueDe.setAge(69);
        TuBueDe.setHobby("Ca khia");
        TuBueDe.setSex("Khong xac dinh");
        System.out.println("SonNghien:");
        System.out.println("Ten: " + SonNghien.getName());
        System.out.println("Tuoi: " + SonNghien.getAge());
        System.out.println("So thich: " + SonNghien.getHobby());
        System.out.println("Gioi tinh: " + SonNghien.getSex());
        System.out.println("TuBueDe:");
        System.out.println("Ten: " + TuBueDe.getName());
        System.out.println("Tuoi: " + TuBueDe.getAge());
        System.out.println("So thich: " + TuBueDe.getHobby());
        System.out.println("Gioi tinh: " + TuBueDe.getSex());
    }
    
}
