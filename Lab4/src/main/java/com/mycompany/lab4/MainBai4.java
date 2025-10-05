/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author nguye
 */
public class MainBai4 {
     public static void main(String[] args) {
        // Tạo 2 sản phẩm bằng 2 constructor khác nhau
        bai4 sp1 = new bai4("Dien thoai", 12000000, 1500000);
        bai4 sp2 = new bai4("Tai nghe Bluetooth", 800000);

        // Xuất thông tin 2 sản phẩm
        System.out.println("=== THONG TIN 2 SAN PHAM ===");
        sp1.xuat();
        sp2.xuat();
        
        sp2.setGiamGia(50000);
        System.out.println("=== SAU KHI CAP NHAT GIAM GIA SAN PHAM 2 ===");
        sp2.xuat();
    }
}
