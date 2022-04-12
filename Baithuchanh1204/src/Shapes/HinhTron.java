package Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {

    public float banKinh;

    // constructor
    public HinhTron() {
        ten = " Hình Tròn";
    }

    public void nhapBanKinh() {
        System.out. println("Bán Kính = ");
        Scanner scanner = new Scanner (System.in);
        banKinh = scanner .nextFloat();
        sc.close(); 
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI  * banKinh * banKinh;

    }
}