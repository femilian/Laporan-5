package laporan5;

import java.util.Scanner;

public class mainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        finalJaket j = new finalJaket();
        System.out.println("-------------------- CV. LABKOMDAS ----------------------");
        System.out.println("1. JAKET A : Rp. 100000/bj");
        System.out.println("2. JAKET B : Rp. 125000/bj");
        System.out.println("3. JAKET C : Rp. 175000/bj");
        System.out.println("*diskon Rp. 5000/bj setiap pembelian lebih dari 100 biji");
        System.out.println("---------------------------------------------------------");
        System.out.print("Jenis Jaket yang dibeli   : ");
        j.setJaket(in.next());
        System.out.print("Jumlah yang dibeli (biji) : ");
        int jml = in.nextInt();
        j.harga(jml);
        System.out.println("---------------------TERIMA KASIH------------------------");
    }
}
