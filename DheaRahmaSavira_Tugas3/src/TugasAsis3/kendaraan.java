/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsis3;

/**
 *
 * @author Dhea
 */
public class kendaraan {
   private int idKendaraan;
   protected float jarakTempuhAwal;
   protected float jarakTempuh;
   private String namaKendaraan;
   private String tipeKendaraan;
   private int kapasitasMesin;
   private float bahanBakar;
   
   public void setIdKendaraan(int id) {
       this.idKendaraan = id;
   }
   public int getId() {
       return idKendaraan;
    }
   
   public void setJarakTempuhAwal(float awal) {
       this.jarakTempuhAwal = awal;
   }
   
   public float getJarakTempuhAwal() {
       return jarakTempuhAwal;
   }
   
   public void setJarakTempuh(float tempuh) {
       this.jarakTempuh = tempuh;
   }
   
   public float getJarakTempuh() {
       return jarakTempuh;
   }
   
   public void setNamaKendaraan(String nama) {
       this.namaKendaraan = nama;
   }
   
   public String getNamaKendaraan() {
       return namaKendaraan;
   }
   
   public void setTipeKendaraan(String tipe) {
       this.tipeKendaraan = tipe;
   }
   
   public String getTipeKendaraan() {
       return tipeKendaraan;
   }
   
   public void setKapasitasMesin(int kapasitas) {
       this.kapasitasMesin = kapasitas;
   }
   
   public int getKapasitasMesin() {
       return kapasitasMesin;
   }
   
   public void setBahanBakar(float bb) {
       this.bahanBakar = bb;
   }
   
   public float getBahanBakar() {
       return bahanBakar;
   }
   
   public float totalJarak() {
       float jarak;
       
       jarak = getJarakTempuhAwal() + getJarakTempuh();
       return jarak;
   }
   
   public float efektifitas() {
       float E;
       
       E = (float) Math.exp(getJarakTempuh() / getBahanBakar()) * (float) Math.log10(2);
       return E;
   }
   
   public String getEfektifitas() {
       String Efektifitas;
       
       if (efektifitas() > 0 && efektifitas() <= 0.5) {
           Efektifitas = "Efektif";
       }
       else {
           Efektifitas = "Tidak Efektif";
       }    
       return Efektifitas;
   }
   
   public void infoKendaraan() {
       System.out.println("\nTipe Kendaraan\t\t\t: " +getTipeKendaraan());
       System.out.println("Kapasitas Kendaraan\t\t: " +getKapasitasMesin());
       System.out.println("Jumlah Bahan Bakar\t\t: " +getBahanBakar());
       System.out.println("ID Kendaraan\t\t\t: " +getId());
       System.out.println("Jarak Tempuh Awal\t\t: " +getJarakTempuhAwal());
       System.out.println("Jarak Tempuh Akhir\t\t: " +getJarakTempuh());
       System.out.println("Total Jarak\t\t\t: " +totalJarak());
       System.out.println("Keefektifan Mesin\t\t: " +getEfektifitas());
   }
}
