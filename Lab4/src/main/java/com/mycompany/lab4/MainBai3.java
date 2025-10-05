/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author nguye
 */
public class MainBai3 {
    public static void main(String[] args) {
        // Tạo sản phẩm có giảm giá
        bai3 sp1 = new bai3("Laptop", 15000000, 2000000);
        // Tạo sản phẩm không giảm giá
        bai3 sp2 = new bai3("Chuot khong day", 250000);

        System.out.println("=== THONG TIN 2 SAN PHAM ===");
        sp1.xuat();
        sp2.xuat();
    }
}


