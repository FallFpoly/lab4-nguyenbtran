package com.mycompany.lab4;

import java.util.Scanner;

public class bai1 {
    public String tenSp;
    public Double donGia;
    public Double giamGia;

    public bai1(String tenSp, Double donGia, Double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public bai1() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
    
    
     public static void main(String[] args) {
        bai1 sp = new bai1();   
        sp.nhap();
        System.out.println("\n--- Thong tin san pham ---");
        sp.xuat();
    }
}
