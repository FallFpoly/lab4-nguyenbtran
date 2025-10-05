/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author nguye
 */
public class MainBai2 {
    public static void main(String[] args) {
        System.out.println("=== THONG TIN 2 SAN PHAM ===");
        bai2 sp1 = new bai2();
        bai2 sp2 = new bai2();

        System.out.println("\n-- Nhap san pham 1 --");
        sp1.nhap();
        System.out.println("\n-- Nhap san pham 2 --");
        sp2.nhap();

        System.out.println("\n=== THONG TIN 2 SAN PHAM ===");
        sp1.xuat();
        sp2.xuat();
    }
}
