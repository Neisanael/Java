package Modul_5;
    public class Dealer {
   private String NamaDealer;
   private String Alamat;
   private String Pemilik;
   private String NPWP;
   private Mobil[] DaftarMobil;
   
   public Dealer (String Nama,String Alamat,String Pemilik,String NPWP){
       this.NamaDealer=Nama;
       this.Alamat=Alamat;
       this.Pemilik=Pemilik;
       this.NPWP=NPWP;
   }
   public String getNama(){
       return NamaDealer;
   }
   public String getAlamat(){
       return Alamat;
   }
   public String getPemilik(){
       return Pemilik;
   }
   public String getNPWP(){
       return NPWP;
   }
   public void setMobil(Mobil[] mbl){
       this.DaftarMobil=mbl;
   }
   public Mobil[]getMobil(){
       return DaftarMobil;
   }
}
