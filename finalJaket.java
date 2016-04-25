package laporan5;

public class finalJaket {
    final int a = 100000;
    final int b = 125000;
    final int c = 175000;
    private String jaket;
    
   public void setJaket(String j){
       jaket = j;
   }
   public String getJaket(){
       return jaket;
   }
    public void harga(int jml){
        if (jaket.equalsIgnoreCase("A")){
            if (jml <= 100){
                System.out.println("Total Harga               : Rp. "+this.a*jml);
            }else{
                int aa = this.a-5000;
                System.out.println("Selamat, Anda Mendapatkan Potongan Harga Sebesar Rp. 5000/bj");
                System.out.println("Total Harga               : Rp. "+aa*jml);
            }
        }
        else if (jaket.equalsIgnoreCase("B")){
            if (jml <= 100){
                System.out.println("Total Harga               : Rp. "+this.b*jml);
            }else{
                int bb = this.b-5000;
                System.out.println("Selamat, Anda Mendapatkan Potongan Harga Sebesar Rp. 5000/bj");
                System.out.println("Total Harga               : Rp. "+bb*jml);
            }
        }
        else if (jaket.equalsIgnoreCase("C")){
            if (jml <= 100){
                System.out.println("Total Harga               : Rp. "+this.c*jml);
            }else{
                int cc = this.c-15000;
                System.out.println("Selamat, Anda Mendapatkan Potongan Harga Sebesar Rp. 15000/bj");
                System.out.println("Total Harga               : Rp. "+cc*jml);
            }
        }
        }
}
