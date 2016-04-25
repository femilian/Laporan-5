package laporan5;

import java.util.Scanner;

public class mainAritmatik {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
            System.out.print("Pembilang Pertama : ");
            int pem1 = in.nextInt();
            System.out.print("Penyebut Pertama : ");
            int pen1 = in.nextInt();
            System.out.print("Pembilang Kedua : ");
            int pem2 = in.nextInt();
            System.out.print("Penyebut Kedua : ");
            int pen2 = in.nextInt();
            System.out.println("");
            System.out.print("Hasil Penjumlahan = "+pem1+"/"+pen1+" + "+pem2+"/"+pen2+" = ");
            Aritmatik.penjumlahan(pem1, pen1, pem2, pen2);
            System.out.print("Hasil Pengurangan = "+pem1+"/"+pen1+" - "+pem2+"/"+pen2+" = ");
            Aritmatik.pengurangan(pem1, pen1, pem2, pen2);
            Aritmatik ar = new Aritmatik();
            System.out.print("Hasil Perkalian = "+pem1+"/"+pen1+" x "+pem2+"/"+pen2+" = ");
            ar.perkalian(pem1, pen1, pem2, pen2);
            System.out.print("Hasil Pembagian = "+pem1+"/"+pen1+" : "+pem2+"/"+pen2+" = ");
            ar.pembagian(pem1, pen1, pem2, pen2);
            System.out.print("Hasil Penyederhanaan Pecahan Pertama = "+pem1+"/"+pen1+" = ");
            ar.sederhana(pem1, pen1);
            System.out.print("Hasil Penyederhanaan Pecahan Kedua = "+pem2+"/"+pen2+" = ");
            ar.sederhana(pem2, pen2);
    }    
}
