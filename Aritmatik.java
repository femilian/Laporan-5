package laporan5;

public class Aritmatik {
  
public static void penjumlahan(int pm, int pn, int pm2, int pn2){
    int hasil = pm + pm2;
    int pembilang = (pm*pn2) + (pm2*pn);
    int penyebut = pn * pn2;
    if (pn == pn2){
        System.out.println(hasil+"/"+pn);
    }else if (pn != pn2){
        System.out.println(pembilang+"/"+penyebut);
    }
}
public static void pengurangan (int pm, int pn, int pm2, int pn2){
    int hasil = pm - pm2;
    int pembilang = (pm*pn2) - (pm2*pn);
    int penyebut = pn * pn2;
    if (pn == pn2){
        if (hasil == 0){
            System.out.println(" 0");
        }else{
            System.out.println(hasil+"/"+pn);
        }
    }else if (pn != pn2){
        System.out.println(pembilang+"/"+penyebut);
    }
}
public void perkalian(int pm, int pn, int pm2, int pn2){
    int pembilang = pm * pm2;
    int penyebut = pn * pn2;
    System.out.println(pembilang+"/"+penyebut);
}
public  void pembagian (int pm, int pn, int pm2, int pn2){
    int pembilang = pm * pn2;
    int penyebut = pm2 * pn;
    System.out.println(pembilang+"/"+penyebut);
}
public void sederhana(int pem, int pen){
    if (pen % pem == 0){
        pen = pen/pem;
        pem = pem/pem;
        System.out.println(pem+"/"+pen);
    }else if(pem % pen == 0) {
        pem = pem/pen;
        System.out.println(pem);
    }else{
        System.out.println("Tidak Bisa Disederhanakan ");
    }  
  }
}
