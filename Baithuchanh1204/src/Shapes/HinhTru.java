package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {

    // Constructor 
    public float chieucao;
    public HinhTru() {
        ten = "Hình Trụ ";
}

public void nhapChieuCao() {
    nhapBanKinh();

    System.out .println("Chiều cao = ");
    Scanner scanner = new Scanner(System.in);
    chieucao = scanner.nextFloat();
}

public void tinhTheTich() {
    tinhDienTich();
    theTich = dienTich * chieucao;
     }
}
